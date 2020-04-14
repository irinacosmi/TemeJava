package com.java.training.d02.Teme.Movie;

public class ImmutableMovie {
    private final int id;
    private final String name;
    private final String director;
    private final int year;


    public ImmutableMovie(int id, String name, String director, int year) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.year = year;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getDirector(){
        return director;
    }

    public int getYear(){
        return year;
    }

    public void display(){
        System.out.println("The movie has " + id +"," + name + "," + director + "," +  year);
    }
}


