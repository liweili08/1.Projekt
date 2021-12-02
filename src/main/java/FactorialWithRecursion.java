import java.util.Scanner;

public class FactorialWithRecursion {
    public static void main(String[] args){
        System.out.println("Geben Sie eine Zahl an:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Falkultät " + num + "! ist " + factorialWithRecursion(num));
    }

    public static int factorialWithRecursion(int num){
        if (num == 0){
            return 1;
        }else {
            return num * factorialWithRecursion(num-1) ;
        }
    }
}

/*
1,2,...,n
cacultaleGaussSum(n)=n+(n-1)+...+1+0
=n+(cacultaleGaussSum(n-1))
=n+(n-1+cacultaleGaussSum(n-2))
=....
?=n+...*
*/
