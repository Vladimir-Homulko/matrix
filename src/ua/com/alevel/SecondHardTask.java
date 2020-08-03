package ua.com.alevel;

import java.util.Arrays;

public class SecondHardTask {

    public void matrixTransportation(double matrix[][]) {

        double[][] transportedMatrix = new double[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                transportedMatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("Matrix transprtation: ");

        for (int i = 0; i < transportedMatrix.length; i++) {
            System.out.println(Arrays.toString(transportedMatrix[i]));
        }

    }

}
