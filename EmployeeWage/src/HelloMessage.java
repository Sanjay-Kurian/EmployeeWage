
public class HelloMessage {
	public static void main(String[] args) {
		double empCheck = Math.floor((Math.random()*10)%3);
		int WAGE_PER_HOUR = 20;
		int FULL_DAY_HOUR = 8;
		int PART_TIME_HOUR = 4;
		int wage;
		if (empCheck == 1)
		{
			wage = WAGE_PER_HOUR * FULL_DAY_HOUR;
			System.out.println("Employee is present");
			System.out.println("The wage is "+wage);
		}
		else if(empCheck == 0)
		{
			wage=0;
			System.out.println("Employee is absent");
			System.out.println("The wage is "+wage);
		}
		else
		{
			wage = WAGE_PER_HOUR * PART_TIME_HOUR;
			System.out.println("Employee is present");
			System.out.println("The wage is "+wage);
		}
		
	}
}
