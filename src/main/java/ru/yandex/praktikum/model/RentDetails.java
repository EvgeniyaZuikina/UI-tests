package ru.yandex.praktikum.model;

public class RentDetails {

    private final String date;
    private final String period;
    private final String color;
    private final String comment;


    public RentDetails(String date, String period, String color, String comment) {
        this.date = date;
        this.period = period;
        this.color = color;
        this.comment = comment;
    }

    public static RentDetails getSimpleRentDetails() {
        return new RentDetails(
                "09.05.2022",
                "трое суток",
                "серая безысходность",
                "звонить после 12:00");
    }

    public static RentDetails getComplexRentDetails() {
        return new RentDetails(
                "11.05.2022",
                "пятеро суток",
                "чёрный жемчуг",
                "запасной номер +79109990011");
    }


    public String getDate() {
            return date;
        }
    public String getPeriod() {
        return period;
    }
    public String getColor() {
        return color;
    }
    public String getComment() {
        return comment;
    }
}

