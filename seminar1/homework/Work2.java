//Вывести все простые числа от 1 до 1000
//Простые числа - числа которые деляться только на 1 и на само себя без остатка(кроме 1).

package seminar1.homework;

public class Work2 {
    public static void hwork() {
        for (int i = 2; i <= 1000; i++) {
            int k = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    k += 1;
                }
            }
            if (k == 0) {
                System.out.println(i);
            }
        }
    }
}
