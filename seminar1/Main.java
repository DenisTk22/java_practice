package seminar1;

import seminar1.task.Task1;
import seminar1.task.Task2;

public class Main {
    public static void main(String[] args) { // psvn
        // Task1.run();
        int[] ray = new int[] { 1, 0, 1, 1, 2, 1 };
        int ourarray = Task2.run(ray);
        System.out.println(ourarray);
    }
}
