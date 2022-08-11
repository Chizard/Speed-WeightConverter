import java.util.Scanner;

public class Speed {

    public static void speedCalculation() {
        Scanner answer = new Scanner(System.in);
        float ans1;
        float ans2;
        float ans3;

        System.out.println("Would you like to convert MPH -> KMPH?" +
                           " or KMPH -> MPH");
        System.out.println("1. MPH -> KMPH\n" +
                           "2. KMPH -> MPH");
        ans1 = answer.nextInt();

        System.out.println("What value would you like to convert?");
        ans2 = answer.nextFloat();

        if (ans1 == 1) {
            ans3 = (float) (ans2*1.609344);
            System.out.println("------------------------");
            System.out.println(ans2 + " MPH is " + ans3 + " KMPH");
            System.out.println("------------------------");

        }
        if (ans1 == 2) {
            ans3 = (float) (ans2*0.6213711922);
            System.out.println("------------------------");
            System.out.println(ans2 + " KMPH is " + ans3 + " MPH");
            System.out.println("------------------------");

        }

    }
}
