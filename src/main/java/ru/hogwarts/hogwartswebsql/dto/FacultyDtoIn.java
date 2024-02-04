package ru.hogwarts.hogwartswebsql.dto;

public class FacultyDtoIn {

    private String name;
    private String color;

    public FacultyDtoIn() {
    }

    public FacultyDtoIn(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
