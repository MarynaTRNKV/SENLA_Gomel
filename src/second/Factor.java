package second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        try{ Scanner in = new Scanner(System.in);
            System.out.print("Введите число:  ");
            factorize (in.nextInt());}
        catch (InputMismatchException e) {
            System.out.println("Число дробное. Возможны только целые числа.");}
    }
    private static void factorize (int number) {
        System.out.print("Простые множители числа: " );
        int x = number;
        for (int i = 2; i <= x; i++){
            if (number % i == 0) {
                number /= i;
                System.out.print(i + " ");
                i = 1;}
        }
    }
}
