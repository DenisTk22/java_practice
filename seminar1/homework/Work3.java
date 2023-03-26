//Реализовать простой калькулятор.
// Использовать сканнер: Scanner scanner = new Scanner(System.in); String enter = scanner.next(); int i = Integer.parseInt(enter);

package seminar1.homework;

import java.util.Scanner;

public class Work3 {
    public static void hwork() {
        Scanner sc = new Scanner(System.in);
        double a, b, sum;
        int operator;
        System.out.println("ВАШ КАЛЬКУЛЯТОР");
        System.out.println("Введите первое число: ");
        a = sc.nextInt();
        System.out.println("Введите оператор:\n1 : +\n2 : -\n3 : *\n4 : /");
        operator = sc.nextInt();
        System.out.println("Введите второе число: ");
        b = sc.nextInt();
        if (operator == 1) {
            sum = a + b;
            System.out.println("Ответ: " + sum);
        }
        if (operator == 2) {
            sum = a - b;
            System.out.println("Ответ: " + sum);
        }
        if (operator == 3) {
            sum = a * b;
            System.out.println("Ответ: " + sum);
        }
        if (operator == 4) {
            sum = a / b;
            System.out.println("Ответ: " + sum);
        }
    }
}
