package movies;
import java.util.Arrays;

import util.Input;

public class Movie {

    private String name;
    private String category;


    //    constructor
    public Movie(String nameExt, String categoryExt) {
        this.name = nameExt;
        this.category = categoryExt;
    }

    // returns the movie name
    public String getName() {
        return name;
    }

    // changes the movie name property
    public void setName(String name) {
        this.name = name;
    }

    // returns the movie cat
    public String getCategory() {
        return category;
    }

    // changes the movie cat property
    public void setCategory(String category) {
        this.category = category;
    }


//    add a movie
    public static Movie[] addMovie(Movie[] movie,String nameExternal, String categoryExternal) {
        Movie[] newMovieArray = Arrays.copyOf(movie, movie.length + 1);
        newMovieArray[movie.length] = new Movie(nameExternal,categoryExternal);
        return newMovieArray;
        };
    };



//need to make copy of original array with length+1,
//        then need to add new person object to new/copy at length-1,





//    public static void main(String[] args) {
//
//    }
//}


//        Give the user a list of options for viewing all the movies or viewing movies by category.
//        Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
//        If a category is selected, only movies from that category should be displayed.
//        Your application should continue to run until the user chooses to exit.