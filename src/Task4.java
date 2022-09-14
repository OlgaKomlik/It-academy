package src;

public class Task4 {
    public static void main(String[] args) {
        int hourTime = 17;
        String helloWords = "";
        switch (hourTime) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                helloWords = "Доброе утро";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                helloWords = "Добрый день";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                helloWords = "Добрый вечер";
                break;
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                helloWords = "Доброй ночи";
                break;
        }
        System.out.println(helloWords);
    }
}
