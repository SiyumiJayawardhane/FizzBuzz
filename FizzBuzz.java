package JavaWeek1Tut;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of fizz buzz: ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("fizzbuzz ");
            }
            else if (i % 3 == 0) {
                System.out.print("fizz ");
            }
            else if (i % 5 == 0) {
                System.out.print("buzz ");
            }
            else{
                System.out.print(i+ " ");
            }
        }
    }
}
