public class Main {
    public static void daysToDistance(int distance) {
        System.out.println("Задание 3");
        if (distance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else if (distance > 100){
            System.out.println("Свыше 100 км доставки нет.");
        }
    }


    public static void versionAdvice(int clientDeviceYear, int androidOrIos) {
        System.out.println("Задание 2");
        if (androidOrIos == 0 && clientDeviceYear == 2024) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (androidOrIos == 0 && clientDeviceYear != 2024) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (androidOrIos == 1 && clientDeviceYear != 2024) {
            System.out.println("Установите облегченную версию приложения для Android  по ссылке");
        } else if (androidOrIos == 1 && clientDeviceYear != 2024) {
            System.out.println("Установите облегченную версию приложения для Android  по ссылке");
        }
    }

    public static void leapYear(int year) {
        System.out.println("Задание 1");
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год НЕ является високосным");
        }
    }

    public static void main(String[] args) {
        leapYear(20000);
        versionAdvice(2024, 0);
        daysToDistance(95);
    }
}