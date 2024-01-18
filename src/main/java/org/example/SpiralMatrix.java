package org.example;

public class SpiralMatrix {

    public static void generateSpiralMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        int num = 1;
        int left = 0, right = cols - 1, top = 0, bottom = rows - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        // Вывод матрицы
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(String.format("%02d ", matrix[i][j]));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        generateSpiralMatrix(2, 3);
        System.out.println();
        generateSpiralMatrix(3, 1);
        System.out.println();
        generateSpiralMatrix(4, 4);
    }
}

