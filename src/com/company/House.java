package com.company;

public class House {
    private int year;
    private int floor;
    private Address address;
    private static int HouseCount = 0;

    public House(int year, int floor, Address address) {
        this.year = year;
        this.floor = floor;
        this.address = address;
        HouseCount++;
    }

    public int getHouseCount() {
        return HouseCount;
    }
    public int getYear() {
        return year;
    }

    public int getFloor() {
        return floor;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    // Вывод с помощью метода
    public void getPrintHouse() {
        System.out.println("Год постройки:" + year + " Этажность:" + floor + " ");
    }
    // Возвращение всей информации по объекту
    public String getAllHouseInfo() {
        String allHouseInfo = "Год постройки: " + year + "\n" +
                "Этажность: " + floor + "\n" +
                "Адрес: " + address.getFullAddress();
        return allHouseInfo;
    }
}
