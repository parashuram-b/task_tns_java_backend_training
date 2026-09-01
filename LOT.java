package task_tasks;

public class LOT {
	public static void main(String[] args) {

        int a = 55;
        int b = 42;
        int c = 18;

        if (a >= b && a >= c) {
            System.out.println("Largest = " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest = " + b);
        } else {
            System.out.println("Largest = " + c);
        }
    }

}
