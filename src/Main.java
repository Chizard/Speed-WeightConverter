import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner answer1 = new Scanner(System.in);
        int ans;

    while (true) {
        System.out.println("Would you like to convert speed or weight?");
        System.out.println("1. Speed\n" +
                "2. Weight\n" +
                "3. Quit");
        ans = answer1.nextInt();

            switch (ans) {

                case 1:
                    Speed.speedCalculation();
                    break;
                case 2:
                    Weight.weightCalculation();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }

        }

    }
}