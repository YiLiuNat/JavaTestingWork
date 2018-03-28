package _06.Interface;
//当类实现接口的时候，类要实现接口中所有的方法
//否则，类必须声明为抽象的类。
public class Mammal implements Animal {
	public void eat() {
		System.out.println("Mammal eats");
	}
	public void travel() {
		System.out.println("Mammal travels");
	}
	public int noLegs() {
		return 0;
	}
	
	public static void main(String args[]) {
		Mammal m = new Mammal();
		m.eat();
		m.travel();
		System.out.println(m.noLegs());
	}
}
