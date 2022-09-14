package src;

public class Task2 {
    public static void main(String[] args) {
        int numberDayOfWeek = 5;
        String nameDayOfWeek = "";
        if (numberDayOfWeek == 1) {
            nameDayOfWeek = "MONDAY";
        } else if (numberDayOfWeek == 2) {
            nameDayOfWeek = "TUESDAY";
        } else if (numberDayOfWeek == 3) {
            nameDayOfWeek = "WEDNESDAY";
        } else if (numberDayOfWeek == 4) {
            nameDayOfWeek = "THURSDAY";
        } else if (numberDayOfWeek == 5) {
            nameDayOfWeek = "FRIDAY";
        } else if (numberDayOfWeek == 6) {
            nameDayOfWeek = "SATURDAY";
        } else if (numberDayOfWeek == 7) {
            nameDayOfWeek = "SUNDAY";
        }
        System.out.println(nameDayOfWeek);
    }
}
