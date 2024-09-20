import java.time.LocalDate;

public class Main {
    //Задание 1
    public static void checkYear(int year) {
        if (year % 4 == 0 && year > 1584 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    //Задание 2
    public static void checkOS(int clientOS, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year < currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Введите 1 или 2");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Введите 1 или 2");
            }
        }
    }

    //Задание 3
    public static int deliveryDays(int Distance) {
        int days = 0;
        if (Distance <= 20) {
            days = 1;
        } else if (Distance <= 60) {
            days = 2;
        } else if (Distance <= 100) {
            days = 3;
        }
        return days;
    }


    public static void main(String[] args) {
        //Задание 1
        int year = 2001;
        checkYear(year);
        System.out.println();

        //Задание 2
        int clientOS = 1;
        int clientDeviceYear = 2015;
        checkOS(clientOS, clientDeviceYear);
        System.out.println();


        //Задание 3
        int deliveryDistance = 180;
        int timeDelivery = deliveryDays(deliveryDistance);
        if (timeDelivery > 0) {
            System.out.println("Потребуется дней: " + timeDelivery);
        } else {
            System.out.println("Доставки нет");
        }

    }
}
