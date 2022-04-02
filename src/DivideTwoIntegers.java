import java.util.Scanner;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();


        int sign = ((dividend < 0) || (divisor < 0)) ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;
        while (dividend>=divisor){
            dividend-=divisor;
            ++quotient;
        }

        if(sign==-1){
            quotient = -quotient;
        }

    }
}
