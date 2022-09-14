package Lesson3;

public class Task1 {
    public static void main(String[] args) {
        int numberDayOfWeek = 3;
        String nameDayOfWeek = "";
        switch (numberDayOfWeek) {
            case 1:
                nameDayOfWeek = "MONDAY";
                break;
            case 2:
                nameDayOfWeek = "TUESDAY";
                break;
            case 3:
                nameDayOfWeek = "WEDNESDAY";
                break;
            case 4:
                nameDayOfWeek = "THURSDAY";
                break;
            case 5:
                nameDayOfWeek = "FRIDAY";
                break;
            case 6:
                nameDayOfWeek = "SATURDAY";
                break;
            case 7:
                nameDayOfWeek = "SUNDAY";
                break;
        }
        System.out.println(nameDayOfWeek);
    }
}
