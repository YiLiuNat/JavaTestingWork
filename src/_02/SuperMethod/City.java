//https://www.cnblogs.com/hasse/p/5023392.html
package _02.SuperMethod;

public class City extends Country{
	String name;
	void value() {
		name = "Shanghai";
		super.value();//调用父类的方法
		System.out.println(name);
		System.out.println(super.name);
	}
//可以看到，这里既调用了父类的方法value()，也调用了父类的变量name。若不调用父类方法value()，
//只调用父类变量name的话，则父类name值为默认值null。
	
	
	public static void main(String[] args) {
		City anyNameThatIwant = new City();
		anyNameThatIwant.value();
	}
}
