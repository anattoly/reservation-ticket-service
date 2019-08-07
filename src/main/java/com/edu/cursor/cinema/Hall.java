package com.edu.cursor.cinema;

public class Hall {
    private Integer number;
    private Integer amountOfPlaces;
    private TypeOfPlace typeOfPlace;

    public Hall(Integer number, Integer amountOfPlaces, TypeOfPlace typeOfPlace) {
        this.number = number;
        this.amountOfPlaces = amountOfPlaces;
        this.typeOfPlace = typeOfPlace;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getAmountOfPlaces() {
        return amountOfPlaces;
    }

    public void setAmountOfPlaces(Integer amountOfPlaces) {
        this.amountOfPlaces = amountOfPlaces;
    }

    public TypeOfPlace getTypeOfPlace() {
        return typeOfPlace;
    }

    public void setTypeOfPlace(TypeOfPlace typeOfPlace) {
        this.typeOfPlace = typeOfPlace;
    }
}
