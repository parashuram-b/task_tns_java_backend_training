package task_tasks;

public class ArmstrongCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 371;
	        int temp = n;
	        int sum = 0;

	        while (n > 0) {
	            int rem = n % 10;
	            sum = sum + (rem * rem * rem);
	            n = n / 10;
	        }

	        if (sum == temp) {
	            System.out.println("Armstrong Number");
	        } else {
	            System.out.println("Not an Armstrong Number");
	        }

	}

}
