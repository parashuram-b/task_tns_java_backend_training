package task_tasks;

public class Palindromecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1221;
        int temp = n;
        int reverse = 0;

        while (n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }

        if (reverse == temp) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

	}

}
