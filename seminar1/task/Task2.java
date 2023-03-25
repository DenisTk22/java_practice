//Задача 3
package seminar1.task;

public class Task2 {
    // пример 110111
    public static int run(int[] array) {
        int count = 0;
        int maxcount = 0;
        for (int i : array) { // foreach
            if (i == 1) {
                count++;
            } else {
                if (maxcount < count) {
                    maxcount = count;
                }
                count = 0;
            }
        }
        if (count > maxcount) {
            maxcount = count;
        }
        return maxcount;
    }
} // alt+shift+f - выравнивает код
