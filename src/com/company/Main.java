package com.company;

import java.util.Scanner;

public class Main {

    public static void printMatrix(double [][]matrix1 ){
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[i].length; j++){
                System.out.print("["+matrix1[i][j]+"] ");
            }
            System.out.println();
        }
    }

    public static void fillMatrix(double [][]matrix1 ){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix1.length ; i++){
            for (int j = 0; j < matrix1[i].length ; j++){
                System.out.print("Введите элемент " + i + " строки, " + j + " столбца: ");
                matrix1[i][j] = scanner.nextDouble();
            }
        }
    }

    public static void main(String[] args) {

        int n;
        int m;

        Scanner scanner = new Scanner(System.in);

        /*Задание размерности первой матрицы*/
        System.out.print("Введите количество строк первой матрицы n: ");
        n = scanner.nextInt();
        System.out.print("Введите количество столбцов первой матрицы m: ");
        m = scanner.nextInt();

        double [][] matrix1 = new double[n][m];
        fillMatrix(matrix1);

        int q;
        int z;

        /*Задание размерности второй матрицы*/
        System.out.print("Введите количество строк второй матрицы n: ");
        q = scanner.nextInt();
        System.out.print("Введите количество столбцов второй матрицы m: ");
        z = scanner.nextInt();

        /*Создание матрицы заданной размерностью*/
        double [][] matrix2 = new double[q][z];

        /*Заполнение матрицы*/
        fillMatrix(matrix2);

        /*Вывод матриц*/
        printMatrix(matrix1);
        System.out.println();
        printMatrix(matrix2);

        if (m == q){
            double [][] matrix3 = new double[m][q];
            for (int i = 0; i < matrix1.length; i++){
                for (int j = 0; j < matrix2[i].length; j++){
                    for (int k = 0; k < matrix2.length;k++)
                    matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }

            System.out.println();
            printMatrix(matrix3);
        }
        else {
            System.out.println("Матрицы нельзя перемножить");
        }
    }
}
