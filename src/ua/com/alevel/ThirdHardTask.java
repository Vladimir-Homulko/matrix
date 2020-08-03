package ua.com.alevel;

public class ThirdHardTask {

    public void allMid(double[][] matrix) {

        double middleValue = 0;
        double multiplication = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                middleValue = (middleValue + matrix[i][j]) * matrix.length;
                multiplication = multiplication * middleValue;
            }
        }

        System.out.println("Third task answer is: " + multiplication);

    }

}
