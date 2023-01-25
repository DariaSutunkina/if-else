package DashaSutunkina.edu;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);
        double symbol = scanner.nextDouble();
        if (symbol % 2 == 0) {
            System.out.println("число четное");
        } else
            System.out.println("число нечетное");

        //2
        int a = scanner.nextInt();
        if (a > 0 && a < 10) {
            System.out.println("positive number less than 10");
        } else if (a < 0) {
            System.out.println("negative number");
        } else if (a == 0) {
            System.out.println("is 0");
        } else {
            System.out.println("over 10");

        }

    }

}
