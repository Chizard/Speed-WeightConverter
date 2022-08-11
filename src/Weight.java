import java.util.Scanner;

public class Weight {

    public static void weightCalculation() {
        Scanner answer = new Scanner(System.in);
        float ans1;
        float ans2;
        float ans3;

        System.out.println("How would you like to convert?");
        System.out.println("1. lbs -> kg\n" +
                           "2. kg -> lbs");
        ans1 = answer.nextInt();

        System.out.println("What value would you like to convert?");
        ans2 = answer.nextFloat();

        if (ans1 == 1) {
            ans3 = (float) (ans2*0.45359237);
            System.out.println("------------------------");
            System.out.println( ans2 + " lbs is " + ans3 + " kgs");
            System.out.println("------------------------");

        }
        if (ans1 == 2) {
            ans3 = (float) (ans2*2.2046226218);
            System.out.println("------------------------");
            System.out.println(ans2 + " kgs is " + ans3 + " lbs");
            System.out.println("------------------------");


        }

    }

}
