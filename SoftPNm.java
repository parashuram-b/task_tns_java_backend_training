package task_tasks;

public class SoftPNm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
        int n = 2;
        int sum = 0;

        while (count < 10) {
            int factors = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    factors++;
                }
            }

            if (factors == 2) {
                sum = sum + n;
                count++;
            }

            n++;
        }

        System.out.println("Sum = " + sum);

	}

}
