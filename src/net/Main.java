package net;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws MyException {
        int size = 5;
        int min = 0;
        int max = 10;
        Matrix matrix = new Matrix(size, min, max);
        ArrayList<ArrayList<Integer>> mx = matrix.getInstanse();
        print(mx);
        int mainAverage = 0, subAverage = 0;
        for (int i = 0; i < size; i++) {
            mainAverage += mx.get(i).get(i);
            subAverage += mx.get(size - 1 - i).get(i);
        }
        mainAverage /= size;
        subAverage /= size;
        System.out.println("Среднее значение элементов главной диагонали: " + mainAverage);
        System.out.println("Среднее значение элементов побочной диагонали: " + subAverage);
        if (mainAverage > subAverage) {
            mx.get((int) Math.ceil(size / 2)).set((int) Math.ceil(size / 2), mainAverage);
        } else {
            mx.get((int) Math.ceil(size / 2)).set((int) Math.ceil(size / 2), subAverage);
        }
        print(mx);
    }

    private static void print(ArrayList<ArrayList<Integer>> mx) {
        for (int i = 0; i < mx.size(); i++) {
            for (int j = 0; j < mx.size(); j++) {
                System.out.printf("%d ", mx.get(i).get(j));
            }
            System.out.println();
        }
    }
}