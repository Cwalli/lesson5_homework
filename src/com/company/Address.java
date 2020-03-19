package com.company;

public class Address {
    private String street;
    private int HouseNumber;
    private Integer building; // Если корпус есть

    public Address(String street, int houseNumber) {
        this.street = street;
        this.HouseNumber = houseNumber;
    }
    public Address(String street, int houseNumber, Integer building) {
        this.street = street;
        this.HouseNumber = houseNumber;
        this.building = building;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return HouseNumber;
    }

    public Integer getBuilding() {
        return building;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(int houseNumber) {
        HouseNumber = houseNumber;
    }

    public void setBuilding(Integer building) {
        this.building = building;
    }

    // Вывод с помощью метода
    public void getPrintAddress() {
        //System.out.println(" Улица:" + street  + " Номер дома:" + HouseNumber + " Корпус:" + building );
        //String PrintNumber = " Улица:" + street  + " Номер дома:" + HouseNumber;
        if (building != null) {
            System.out.println("Улица:" + street  + " Номер дома:" + HouseNumber + " Корпус:" + building );
        } else System.out.println(" Улица:" + street  + " Номер дома:" + HouseNumber);
    }
        // Возвращение адреса
        public String getFullAddress() {
            String fullAddress = "ул. " + street + " д. " + HouseNumber;
            if (building != null) {
                fullAddress += "/" + building;
            }
            return fullAddress;
        }
}
