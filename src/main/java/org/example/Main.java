package org.example;

import org.kociemba.twophase.Search;
import org.kociemba.twophase.Tools;

public class Main {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        for (int k = 0; k < 8; k++) {
            for (int i = 0; i < 100; i++) {
                String result = Search.solution(Tools.randomCube(), 20+k, 5, true);
            }
            System.out.println(time - System.currentTimeMillis());
            time = System.currentTimeMillis();

        }

    }
}