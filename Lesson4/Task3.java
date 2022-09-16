package Lesson4;

public class Task3 {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        int countNumbers = 1;
        while (countNumbers < 11) {
            int currentNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = currentNumber;
            countNumbers++;
            System.out.println(currentNumber);
        }
    }
}
