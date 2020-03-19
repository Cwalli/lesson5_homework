package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.*;

public class Main {

    public static void main(String[] args) {
        /**
         write your code here

         */


        House[] houses = new House[10];
        Address[] addresses = new Address[10];
        addresses[0] = new Address("Притыцкого", 50);
        houses[0] = new House(1950, 5, addresses[0]);
        addresses[1] = new Address("Есенина", 60, 5);
        houses[1] = new House(2005, 22, addresses[1]);
        addresses[2] = new Address("Громова", 62);
        houses[2] = new House(2007, 21, addresses[2]);
        addresses[3] = new Address("Громова", 62);
        houses[3] = new House(2007, 21, addresses[2]);

     //   System.out.println(Arrays.toString(houses));
      //  System.out.println(houses[1].getAllHouseInfo());
       // System.out.println(houses[2].getAllHouseInfo());
       // System.out.println(houses[3].getAllHouseInfo());
        //    int InitHouseCount = houses[0].getHouseCount();

      //  for (House house : houses)
          //  if (house != null)
          //  {
            for(int i =0; i < houses[0].getHouseCount(); i++ ){
            System.out.println("Номер объекта: " + (i+1));
            System.out.println(houses[i].getAllHouseInfo());
            System.out.println("-------------------------------");
            }

// }
        for(;;){
            Scanner in = new Scanner(System.in);
            Scanner inStreet = new Scanner(System.in);
            Scanner WriteNewBuilding = new Scanner(System.in);
            System.out.println("Введите номер необходимого действия:" + "\n" + "1 - Вывод информации" + "\n" +
                    "2 - Редактирование" + "\n" + "3 - Добавление нового объекта" + "\n" + "4 - Выход из программы");

            int answer = in.nextInt();
            if (answer < 4 & answer > 0) {
                switch (answer) {
                    case (1):
                        for(int i =0; i < houses[0].getHouseCount(); i++ ){
                            System.out.println("Номер объекта: " + (i+1));
                            System.out.println(houses[i].getAllHouseInfo());
                            System.out.println("-------------------------------");
                        }

                       // for (House house : houses) {
                       //     if (house != null) {
                        //        System.out.println(house.getAllHouseInfo());
                        //        System.out.println("-------------------------------");
                      //      }
                       // }
                        break;
                    case (2):
                        System.out.println("Введите номер объекта для редактирования:");
                        int answer1 = in.nextInt();
                        if (answer1 <= 3 & answer1 > 0) {

                             //   switch (answer1) {

                              //      case (1):
                            System.out.println("Введите номер параметра, который необходимо отредактировать:");
                            System.out.println("1 - Год постройки");
                            System.out.println("2 - Этажность");
                            System.out.println("3 - Улица");
                            System.out.println("4 - Номер дома");
                            System.out.println("5 - Корпус");
                            int answer2 = in.nextInt();
                            if (answer2 <= 5 & answer2 > 0) {
                                switch (answer2) {
                                    case (1):
                                        System.out.println("Текущий год постройки: " + houses[answer1 - 1].getYear());
                                        System.out.println("Введите новый год постройки:");
                                        int WriteYear = in.nextInt();
                                        if (WriteYear > 0) houses[answer1 - 1].setYear(WriteYear);
                                        break;
                                    case (2):
                                        System.out.println("Текущая этажность: " + houses[answer1 - 1].getFloor());
                                        System.out.println("Введите новую этажность:");
                                        int WriteFloor = in.nextInt();
                                        if (WriteFloor > 0) houses[answer1 - 1].setFloor(WriteFloor);
                                        break;
                                    case (3):
                                        System.out.println("Текущая улица: " + addresses[answer1 - 1].getStreet());
                                        System.out.println("Введите новую улицу:");
                                        String WriteStreet = inStreet.nextLine();
                                       //
                                        //if (WriteStreet != null)
                                            addresses[answer1 - 1].setStreet(WriteStreet);

                                        break;
                                    case (4):
                                        System.out.println("Текущий номер дома: " + addresses[answer1 - 1].getHouseNumber());
                                        System.out.println("Введите новый номер дома:");
                                        int WriteHouseNumber = in.nextInt();
                                        if (WriteHouseNumber > 0)
                                            addresses[answer1 - 1].setHouseNumber(WriteHouseNumber);
                                        break;
                                    case (5):
                                        System.out.println("Текущий корпус: " + addresses[answer1 - 1].getBuilding());
                                        System.out.println("Введите новый корпус:");
                                        int WriteBuilding = in.nextInt();
                                        if (WriteBuilding > 0) addresses[answer1 - 1].setBuilding(WriteBuilding);
                                        break;

                                }
                            } else {
                                System.out.println("Введен неверный параметр!!! Попробуйте еще раз!!!");
                                break;
                            }

                        } else {
                            System.out.println("Введен неверный параметр!!! Завершение работыпрограммы!!!");
                            break;
                        }
                    break;
                    case (3):

                        addresses[houses[0].getHouseCount()] = new Address("Str", 50);
                        houses[houses[0].getHouseCount()] = new House(1950, 5, addresses[houses[0].getHouseCount()]);
                        System.out.println("Введите год постройки для нового объекта:");
                        int WriteYear = in.nextInt();
                        if (WriteYear > 0) houses[houses[0].getHouseCount()-1].setYear(WriteYear);

                        System.out.println("Введите этажность для нового объекта:");
                        int WriteFloor = in.nextInt();
                        if (WriteFloor > 0) houses[houses[0].getHouseCount()-1].setFloor(WriteFloor);

                        System.out.println("Введите улицу для нового объекта:");
                        String WriteStreet = inStreet.nextLine();
                      //  if (WriteStreet != null)
                            addresses[houses[0].getHouseCount()-1].setStreet(WriteStreet);


                        System.out.println("Введите номер дома для нового объекта:");
                        int WriteHouseNumber = in.nextInt();
                      //  if (WriteHouseNumber > 0)
                            addresses[houses[0].getHouseCount()-1].setHouseNumber(WriteHouseNumber);

                        System.out.println("Введите корпус для нового объекта:");
                        int WriteBuilding = in.nextInt();
                      // if (WriteBuilding > 0)
                            addresses[houses[0].getHouseCount() - 1].setBuilding(WriteBuilding);

                        break;

                }
                System.out.println();
            } else
            if (answer == 4) {
                System.out.println("Завершение работыпрограммы!!!");
                break;
            }

            else {
                System.out.println("Введен неверный параметр!!! Завершение работыпрограммы!!!");
                break;
            }

        }


/**
 House1.getPrintHouse();
 Address1.getPrintAddress();
 System.out.println("---------------------------------------------------");
 House2.getPrintHouse();
 Address2.getPrintAddress();
 System.out.println("---------------------------------------------------");
 House3.getPrintHouse();
 Address3.getPrintAddress();
 */

    }
}