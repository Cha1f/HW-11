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

    public static int delivery(int deliveryDistance){
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }
        return deliveryDistance;
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2024;
        leapYear(year);
        //////
        System.out.println("Задача 2");
        int clientOperationSystem = 0;
        int clientDeviceYear = 2013;
        getClientOS(clientOperationSystem, clientDeviceYear);
        //////
        System.out.println("Задача 3");
        int deliveryDistance = 68;
        delivery(deliveryDistance);
        var days = delivery(deliveryDistance);
        System.out.println("Потребуется дней: " + days); //Тогда совершенно всё ломается(
    }
}