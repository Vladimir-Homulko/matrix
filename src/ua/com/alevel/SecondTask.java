package ua.com.alevel;

public class SecondTask implements SumAndMultiplication {

    @Override
    public void sumAndMultiplication(double[][] matrix) {

        double sum = 0;
        double multiplication = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > 0.5) {
                    sum = sum + matrix[i][j];
                    multiplication = multiplication * matrix[i][j];
                }
            }
        }

        System.out.println("Sum all elements of matrix > 0.5 = " + sum);
        System.out.println("Multiplication all elements of matrix > 0.5 = " + multiplication);
    }
}
