package Lesson4;

public class Task4 {
    public static void main(String[] args) {
        int firstNumber = 1;
        int resultOfMultiplication;
        while (firstNumber <= 10) {
            int secondNumber = 1;
            while (secondNumber <= 10) {
                resultOfMultiplication = firstNumber * secondNumber;
                System.out.println(firstNumber + "*" + secondNumber + "=" + resultOfMultiplication);
                secondNumber++;
            }
            firstNumber++;
        }
    }
}
