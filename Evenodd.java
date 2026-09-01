package task_tasks;
import java.util.Scanner;

public class Evenodd {
	public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = var.nextInt();

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

}
