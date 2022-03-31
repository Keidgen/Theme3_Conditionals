package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // ������� 1
        short clientOS = 0; //0 - iOS, 1 - Android
        if (clientOS == 0){
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        } else System.out.println("���������� ������ ���������� ��� Android �� ������");

        // ������� 2
        short clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015){
            if (clientOS == 0){
                System.out.println("���������� ������ ���������� ��� iOS �� ������");
            }  else System.out.println("���������� ������ ���������� ��� Android �� ������");
        } else if (clientOS == 0){
            System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
        }  else System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");

        // ������� 3
        short year = 1988;
        if ((year % 4 != 0) || (year % 100 == 0 && year % 400 != 0)){
            System.out.println(year + " ��� �� �������� ����������");
        } else System.out.println(year + " ��� �������� ����������");

        // ������� 4
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
            System.out.println("����������� ����: " + countDay);
        } else System.out.println("������� ������������ ��������. �������� ���� �������������� �� ���������� �� 100 ��.");

        // ������� 5
        short monthNumber = 12;
        String monthName;
        switch (monthNumber){
            case 1:
                monthName = "������";
                break;
            case 2:
                monthName = "�������";
                break;
            case 3:
                monthName = "����";
                break;
            case 4:
                monthName = "������";
                break;
            case 5:
                monthName = "���";
                break;
            case 6:
                monthName = "����";
                break;
            case 7:
                monthName = "����";
                break;
            case 8:
                monthName = "������";
                break;
            case 9:
                monthName = "��������";
                break;
            case 10:
                monthName = "�������";
                break;
            case 11:
                monthName = "������";
                break;
            case 12:
                monthName = "�������";
                break;
            default: monthName = "������ ������ ���";
        }
        System.out.println("��������� �����: " + monthName);
    }
}
