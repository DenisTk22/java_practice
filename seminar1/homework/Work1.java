//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package seminar1.homework;

import java.util.Scanner;

public class Work1 {
    public static void hwork1() {
        Scanner iscan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int k = iscan.nextInt();
        int sum = 0;
        for (int i = 1; i <= k; i++){
            sum +=i;
        }
        System.out.println("Треугольное число числа " + k + " = " + sum);
    }

    public static void hwork2(){
        Scanner iscan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int k = iscan.nextInt();
        int mult = 1;
        for (int i = 1; i <= k; i++){
            mult *=i;
        }
        System.out.println("Факториал числа " + k + " = " + mult);

    }
}


