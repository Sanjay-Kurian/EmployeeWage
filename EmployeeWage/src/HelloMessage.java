
public class HelloMessage {
	public static void main(String[] args) {
		int WAGE_PER_HOUR = 20;
		int FULL_DAY_HOUR = 8;
		int PART_TIME_HOUR = 4;
		int wage = 0;
		int sum = 0;
		int day = 1;
		int MAX_HOUR = 100;
		int TOTAL_HOURS=0;
		while (day <= 20 && TOTAL_HOURS <= MAX_HOUR)
		{
			double empCheck = Math.floor((Math.random()*10)%3);	
			int check = (int)empCheck;
			switch (check)
			{
			case 1:	wage = WAGE_PER_HOUR * FULL_DAY_HOUR;
					TOTAL_HOURS = TOTAL_HOURS + FULL_DAY_HOUR;
					System.out.println("Employee is present");
					System.out.println("The wage is "+wage);
			break;
			case 0:	wage=0;
					System.out.println("Employee is absent");
					System.out.println("The wage is "+wage);
			break;
			case 2:	wage = WAGE_PER_HOUR * PART_TIME_HOUR;
					TOTAL_HOURS = TOTAL_HOURS + FULL_DAY_HOUR;
					System.out.println("Employee is present");
					System.out.println("The wage is "+wage);
			break;
			}
			sum = sum + wage;
			day++;
		}
		System.out.println("The total wage of the employee in a month "+sum);
	}
}
