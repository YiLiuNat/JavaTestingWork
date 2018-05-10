package _08.Random_LoL_Simulation;

public class random {
	public static void main(String[] args) {

		boolean baoji_base = false;
		double probability = 0.05;
		int attack_count = 1;
		if(Math.random() <= probability) {
			baoji_base = true;
			System.out.println("当前攻击次数"+attack_count+", 是否暴击"+baoji_base);
		}
		else {
			while(baoji_base != true) {
				probability += 0.05;
				if(Math.random() <= probability) {
					baoji_base = true;
				}
				System.out.println("当前攻击次数"+attack_count+", 是否暴击"+baoji_base);
				attack_count += 1;
			}
			
		}
	}
	
	
}
