package src.lesson2;

public class Task4 {
    public static void main(String[] args) {
        int n = 354;

        int firstNumber = n / 100;
        int secondNumber = (n % 100) / 10;
        int thirdNumber = n % 10;

        int summa = firstNumber + secondNumber + thirdNumber;
        System.out.println(summa);

    }
}
