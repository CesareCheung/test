package base;

public class Demo05 {

    // 属性：变量

    // 类变量 关键字：static
    static double salary=8900;


   /* 实例变量：从属于对象,如果不初始化值，输出默认值
     除了基本类型，其余的输出都为null
     String默认输出null ,boolean 默认输出false
     int 默认输出0
     */
    String name;
    int age;

    // main 方法
    public static void main(String[] args) {
        // 局部变量:必须声明和初始化值
        int i=10;
        System.out.println(i);

        // 实例变量：变量类型  变量名称 =new base.Demo05()
        Demo05 demo05=new Demo05();
        System.out.println(demo05.age);
        System.out.println(demo05.name);


        //类变量
        System.out.println(salary);

    }

    // 其他方法
    public void add(){

    }

}
