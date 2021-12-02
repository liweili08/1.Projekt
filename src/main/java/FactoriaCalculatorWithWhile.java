import java.util.Scanner;

public class FactoriaCalculatorWithWhile {
    public static void main(String[] args){
        System.out.println("Geben Sie eine Zahl an:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Falkultät " + num + "! ist " + factorialCalculatorWithWhile(num));
    }

    public static int factorialCalculatorWithWhile(int num) {
        if (num == 0){
            return 1;
        } else {
            int i =1;
            int fac = 1;
            while ( i<= num){
                fac = fac * i;
                i = i+1;
            }
            return fac;
        }
    }

    }
