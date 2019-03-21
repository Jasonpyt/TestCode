import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.lang.reflect.Method;
import java.util.List;

/*
   解析 bean.xml 文件

     创建对象并设置属性

 */
public class Dom4JReflectDemo {

    public static void main(String[] args) throws Exception {
        //1:创建 SaxReader对象 用来解析xml文档
        SAXReader  reader = new SAXReader();
        //2:读取 xml文档 并解析成document对象
        Document document = reader.read("Day24//src//bean.xml");

        // 3:获取根节点
        Element rootElement = document.getRootElement();

        //4:获取子元素
        List<Element> beanElements = rootElement.elements();
        // beanElements  所有的bean元素
        // 5:遍历得到每个bean元素
        for (Element beanElement : beanElements) {
            // 6 解析 bean元素  获取  className对应的属性值
            String className = beanElement.attributeValue("className");

//            System.out.println(className);
            // className  就是该类型的位置
            // 根据类的全路径 创建该类型对象
            Class clazz = Class.forName(className);

            Object obj = clazz.newInstance();

            //7:获取bean元素中的子元素 并解析
            List<Element>  ppElements = beanElement.elements();
            // ppElements  bean下的所有的property元素
            //8 遍历得到每一个 property元素
            for (Element ppElement : ppElements) {
                String name = ppElement.attributeValue("name");
                String value = ppElement.attributeValue("value");

//                System.out.println("    "+name+"  "+value);
                // name  属性名   value 属性值
                // 如何通过属性名 设置属性值？？？
                //  setXxx方法
                // 找对应的setXxx方法
                String methodName = "set"+name.substring(0,1).toUpperCase()+name.substring(1);
                Method method = clazz.getMethod(methodName, String.class);
                // method就是那个 setXxx方法
                method.invoke(obj,value);
            }

            System.out.println(obj);
        }
    }
}
