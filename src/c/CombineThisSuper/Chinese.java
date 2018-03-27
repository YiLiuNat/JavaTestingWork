package c.CombineThisSuper;

public class Chinese extends Person{
	Chinese(){
		super(); //调用父类的构造方法1
		prt("子类-调用父类的无参数构造方法:"+"A Chinese coder");
	}
	
	Chinese(String name){
		super(name);//调用父类的构造方法2
		prt("子类-调用父类的含一个参数的构造方法:"+"his name is " + name);
	}
	
	Chinese(String name, int age){
		this(name);//调用具有相同形式参数的构造方法
		prt("子类-调用子类具有相同形式参数: his age is " + age);
	}
	
	public static void main(String[] args) {
		Chinese cn = new Chinese();
		cn = new Chinese("XiaoMing");
		cn = new Chinese("XiaoMing", 18);
	}
}
