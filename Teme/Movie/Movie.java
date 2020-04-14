package com.java.training.d02.Teme.Movie;

public class Movie {
    private int id;
    private String name;
    private String director;
    private int year;

    public Movie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display(){
        System.out.println("The movie has " + id +"," + name + "," + director + "," +  year);
    }
}
