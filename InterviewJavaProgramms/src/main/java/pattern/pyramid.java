package pattern;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args){

                Scanner scanner = new Scanner(System.in);

                // Prompt the user to enter the number of rows
                System.out.print("Enter the number of rows for the pattern: ");
                int rows = scanner.nextInt();

                // Generate the left-aligned star pattern
                for (int i = 1; i <= rows; i++) {
                    // Print stars in each row
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    // Move to the next line
                    System.out.println();
                }

                scanner.close();
            }
        }


