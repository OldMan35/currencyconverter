package ru.currencyconverter.model;

public class Valute {
    private String id; //"AUD" etc.
    private int value; //57.2883

    public Valute() {

    }

    public Valute(String id, int value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public int getValue() {

        return value;
    }

    public void setValue(int value) {

        this.value = value;
    }
}