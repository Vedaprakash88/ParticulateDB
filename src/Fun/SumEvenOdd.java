package Fun;

import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args){

        Scanner objScanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = objScanner.nextInt();
        int odd = 0;
        int remainder;
        int even = 0;
        System.out.println();

        while (num>0) {
            remainder = num%10;

            if (remainder%2 == 0) {
                even += remainder;
            }

            else {//(remainder%2 !=0) {
                odd += remainder;
            }
            num = num/10;

        }
        System.out.println("Even: " + even + "; Odd: " + odd);

    }
}
