package com.java.training.d02.Teme.Movie;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setId(1);
        movie.setName("Avengers");
        movie.setDirector(" Anthony Russo");
        movie.setYear(2019);


        ImmutableMovie toy = new ImmutableMovie(2, "Toy Story", "Josh Cooley", 2019);

        movie.display();
        toy.display();

    }

}
