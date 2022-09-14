package src;

public class Task3 {
    public static void main(String[] args) {
        int hourTime = 17;
        String helloWords = "";
        if (hourTime >= 5 && hourTime <12) {
            helloWords = "Доброе утро";
        } else if (hourTime >= 12 && hourTime <17) {
            helloWords = "Добрый день";
        } else if (hourTime >= 17 && hourTime <22) {
            helloWords = "Добрый вечер";
        } else {
            helloWords = "Доброй ночи";
        }
        System.out.println(helloWords);
    }
}
