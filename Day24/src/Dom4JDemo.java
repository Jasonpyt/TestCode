import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/*
   解析 bean.xml 文件

       1：导jar包

       2:  去解析
          A 核心类
             SaxReader  可以读取xml文档，并且装载到内存
                   Document read(xml的位置)

             Document对象

                   Element getRootElement()获取根元素 返回根元素。

            Element
                 elements() 获取所有的子元素

                 attributeValue(属性名) 获取对应属性名的值

 */
public class Dom4JDemo {

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

            System.out.println(className);

            //7:获取bean元素中的子元素 并解析
            List<Element>  ppElements = beanElement.elements();
            // ppElements  bean下的所有的property元素
            //8 遍历得到每一个 property元素
            for (Element ppElement : ppElements) {
                String name = ppElement.attributeValue("name");
                String value = ppElement.attributeValue("value");

                System.out.println("    "+name+"  "+value);
            }
        }
    }
}
