package _04.Overload;
//Overloading重载 是在一个类里面，方法名字相同，而参数不同
//返回类型可以相同也可以不同。每个重载的方法都必须有一个独一无二都类型列表

public class Overloading {
	public int test() {
		System.out.println("test1");
		return 1;
	}
	
	public void test(int a) {
		System.out.println("test2");
	}
	
	//以下两个参数类型顺序不同
	public String test(int a, String s) {
		System.out.println("test3");
		return "return test 3";
	}
	
	public String test(String s, int a) {
		System.out.println("test4");
		return "return test 4";
	}
	
	//执行内容
	public static void main(String[] args) {
		Overloading o = new Overloading();//创建一个overloading对象
		System.out.println(o.test());
		o.test(1);
		System.out.println(o.test(1,"test3"));
		System.out.println(o.test("test4", 1));
	}
}
