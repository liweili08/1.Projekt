import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.println("Geben Sie eine Zahl an:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Falkultät " + num + "! ist " + factorialCalculator(num));
    }

    public static int factorialCalculator(int num) {
        if (num == 0){
            return 1;
        } else {
            int fac = 1;
            for (int i = 1; i <= num; ++i) {
                fac = fac * i;
            }
            return fac;
        }
    }

}
