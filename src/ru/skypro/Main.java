package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        short clientOS = 0; //0 - iOS, 1 - Android
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else System.out.println("Установите версию приложения для Android по ссылке");

        // Задание 2
        short clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015){
            if (clientOS == 0){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }  else System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }  else System.out.println("Установите облегченную версию приложения для Android по ссылке");

        // Задание 3
        short year = 1988;
        if ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0)){
            System.out.println(year + " год не является високосным");
        } else System.out.println(year + " год является високосным");

        // Задание 4
        short deliveryDistance = 95;
        int countDay = 1;
        if (deliveryDistance <= 60){
            if (deliveryDistance >= 20){
                countDay++;
            }
        } else if (deliveryDistance <=100){
            countDay = countDay + 2;
        }
        if (deliveryDistance <= 100){
            System.out.println("Потребуется дней: " + countDay);
        } else System.out.println("Введено некорректное значение. Доставка карт поддерживается на расстояние до 100 км.");

        // Задание 5
        short monthNumber = 12;
        String monthName;
        switch (monthNumber){
            case 1:
                monthName = "Январь";
                break;
            case 2:
                monthName = "Февраль";
                break;
            case 3:
                monthName = "Март";
                break;
            case 4:
                monthName = "Апрель";
                break;
            case 5:
                monthName = "Май";
                break;
            case 6:
                monthName = "Июнь";
                break;
            case 7:
                monthName = "Июль";
                break;
            case 8:
                monthName = "Август";
                break;
            case 9:
                monthName = "Сентябрь";
                break;
            case 10:
                monthName = "Октябрь";
                break;
            case 11:
                monthName = "Ноябрь";
                break;
            case 12:
                monthName = "Декабрь";
                break;
            default: monthName = "Такого месяца нет";
        }
        System.out.println("Определен месяц: " + monthName);
    }
}
