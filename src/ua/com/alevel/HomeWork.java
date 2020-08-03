package ua.com.alevel;

public class HomeWork {

    public void HomeWork() {
        Matrix matrix = new Matrix();
        FirstTask firstTask = new FirstTask();
        firstTask.sumAndMultiplication(matrix.matrix);
        SecondTask secondTask = new SecondTask();
        secondTask.sumAndMultiplication(matrix.matrix);
        SecondHardTask secondHardTask = new SecondHardTask();
        secondHardTask.matrixTransportation(matrix.matrix);
        ThirdHardTask thirdHardTask = new ThirdHardTask();
        thirdHardTask.allMid(matrix.matrix);
    }
}
