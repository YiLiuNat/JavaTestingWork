package _07.ExtendsInterface;

public interface Hokey extends Sports{
	public void homeGoalScored();
	public void visitingGoalScored();
	public void endOfPeriod(int period);
	public void overtimePeriod(int ot);
}
