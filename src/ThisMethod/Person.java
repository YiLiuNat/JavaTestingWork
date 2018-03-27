//https://www.cnblogs.com/hasse/p/5023392.html
package ThisMethod;
class Person {
    private int age = 10;
    public Person(){
    System.out.println("初始化年龄："+age);
}
    public int GetAge(int age){//这是一个公共变量 可以跨类访问
        this.age = age;
        return this.age;
    }
}
