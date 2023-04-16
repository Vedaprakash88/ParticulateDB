package Fun;

import java.util.Scanner;

public class PrintStar {
       public static void main(String[] args) {
            Scanner starscanner = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int n = starscanner.nextInt();
            int space = 0;

            for (int i = 1; i <= n; i++) {
                if (space != 0) {
                    for (int j = 0; j < space; j++) {
                        System.out.print(" ");
                    }
                }
                for (int p = 1; p<=n; p++) {
                    System.out.print("*");
                }
                System.out.println();
                space += n-1;
            }
        }
}
