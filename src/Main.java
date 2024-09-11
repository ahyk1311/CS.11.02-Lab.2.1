/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Alysha
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        int sum = add(12,20);
        System.out.println(sum);
        int sum2 = add(5,7,3,5);
        System.out.println(sum2);
        String riseNShine = morningGreeting("中國");
        System.out.println(riseNShine);
        String afternoonT = afternoonGreeting("奶奶");
        System.out.println(afternoonT);
        String tripleS = triple("ha");
        System.out.println(tripleS);
        double quotient = half(26);
        System.out.println(quotient);
        int positiveDown = roundPositiveValueToNearestInteger(1.3);
        System.out.println(positiveDown);
        int positiveUp = roundPositiveValueToNearestInteger(1.7);
        System.out.println(positiveUp);
        int negativeDown = roundNegativeValueToNearestInteger(-1.7);
        System.out.println(negativeDown);
        int negativeUp = roundNegativeValueToNearestInteger(-1.3);
        System.out.println(negativeUp);
    }

    // 1. add
    public static int add(int a, int b){
        return a + b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d){
        return add(add(a,b),add(c,d));
    }
    // 3. morningGreeting
    public static String morningGreeting(String a){
        return "早上好, " + a + "!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String a){
        return "下午好, " + a + "!";
    }
    // 5. triple
    public static String triple(String a){
        return a + a + a;
    }
    // 6. half
    public static double half(int a){
        return a /2.0;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double a){
        return (int) (a+0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double a){
        return (int) (a-0.5);
    }
}
