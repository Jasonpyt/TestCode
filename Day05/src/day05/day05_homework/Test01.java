package day05.day05_homework;
/*
* 自定义异常类
问题：
请使用代码实现
每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
如果老师给学生赋值一个负数,抛出一个自定异常
*
*
*
* */
public class Test01 {
    public static void main(String[] args) {
        Student st1 = new Student("123","张三",88);
        Student st2 = new Student("121","李四",88);
        Student st3 = new Student("124","王五",-18);

        try{

            checkScore(st3.getScore(),st3);
            System.out.println(st3.getName() + "输入的成绩正确" );
        }catch (MyException e){
            e.printStackTrace();
        }

    }

    public static boolean checkScore(int score,Student student) throws MyException {
        if (student.getScore() < 0 | student.getScore() > 100){
            throw  new MyException(student.getName() + "输入的分数不对");
        }
        return true;
    }
}
class  Student{
    private  String id;
    private  String name;
    private  int score;

    public Student() {
    }

    public Student(String id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
