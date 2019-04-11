package net;

import java.util.ArrayList;
import java.util.Random;

public class Matrix {
    private ArrayList<ArrayList<Integer>> matrix;

    public Matrix(ArrayList<ArrayList<Integer>> matrix) {
        this.matrix = matrix;
    }

    public Matrix(int size, int min, int max) throws MyException {
        if (size < 0) {
            throw new MyException(ErrorCode.NEGATIVE_SIZE);
        }
        Random random = new Random();
        matrix = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            ArrayList<Integer> nested = new ArrayList<>();
            for (int j = 0; j < size; j++)
                nested.add(random.nextInt((max - min) + 1) + min);
            matrix.add(nested);
        }
    }

    public void setItem(int x, int y, int value) {
        matrix.get(x).add(y, value);
    }

    public Integer getItem(int x, int y) {
        return matrix.get(x).get(y);
    }

    public ArrayList<ArrayList<Integer>> getInstanse() {
        return matrix;
    }
}