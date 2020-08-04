public class EmployeeeWorkinguc6 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int empRatePerHr = 20;

	public static void main(String args[]){
		int empHrs = 0, empWage = 0;
		int totalEmpWage = 0;
		int maxHrs = 100;
		int reachedHrs = 0;
		while (reachedHrs < maxHrs)
		{
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
				case IS_FULL_TIME : 
					empHrs = 8;
					break;
				case IS_PART_TIME :
					empHrs = 4;
					break;
				default :
					empHrs = 0;
				}

			reachedHrs += empHrs;
		}

		System.out.println(reachedHrs);
		empWage = empHrs * empRatePerHr;
		System.out.println("Employee Wage : " + empWage);

	}
}
