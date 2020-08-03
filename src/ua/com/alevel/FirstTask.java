package ua.com.alevel;

public class FirstTask implements SumAndMultiplication {

    @Override
    public void sumAndMultiplication(double[][] matrix) {

        double sumDiagonal = 0;
        double multiplicationDiagonal = 1;


        for (int i = 0; i < matrix.length; i++) {
            sumDiagonal = sumDiagonal + matrix[i][matrix.length - i - 1];
            multiplicationDiagonal = multiplicationDiagonal
                    * matrix[i][matrix.length - i - 1];
        }

        System.out.println("Sum of diagonal is: " + sumDiagonal);
        System.out.println("Multiplication of diagonal: " + multiplicationDiagonal);

    }

}
