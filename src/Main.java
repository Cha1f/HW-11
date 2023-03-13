public class Main {
    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - не високосный год");
        }
    }

    public static void getClientOS(int clientOperationSystem, int clientDeviceYear) {
        if (clientOperationSystem == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static String delivery(int deliveryDistance){
        if (deliveryDistance <= 20) {
            return "1 день доставки";
        } else if (deliveryDistance <= 60) {
            return "2 дня доставки";
        } else if (deliveryDistance <= 100) {
            return "3 дня доставки";
        }
        return "Доставки нет";
    }
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2024;
        leapYear(year);
        System.out.println("Задача 2");
        int clientOperationSystem = 0;
        int clientDeviceYear = 2013;
        getClientOS(clientOperationSystem, clientDeviceYear);
        System.out.println("Задача 3");
        System.out.println(delivery(28)); //Тогда совершенно всё ломается(
    }
}