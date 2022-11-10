package org.example;

import org.kociemba.twophase.Search;
import org.kociemba.twophase.Tools;

public class Main {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        for (int k = 0; k < 8; k++) {
            for (int i = 0; i < 1000; i++) {
                String result = Search.solution(Tools.randomCube(), 20 + k, 10, true);
                if (result.startsWith("Error")) {
                    System.out.println(result);
                }
            }
            long time100 = time - System.currentTimeMillis();
            System.out.printf("solve limit %d in %dms\n", 20 + k, Math.abs(time100 / 1000));
            time = System.currentTimeMillis();

        }

    }
}