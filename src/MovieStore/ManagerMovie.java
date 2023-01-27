package MovieStore;

import java.util.ArrayList;

public class ManagerMovie {

    ArrayList<MovieClass> movie;

    public ManagerMovie() {
        this.movie = new ArrayList<MovieClass>();
    }

    public void setMovie(MovieClass movie, int index) {
        this.setMovie(new MovieClass(movie), index);
    }

    public MovieClass getMovie(int index) {
        return new MovieClass(this.movie.get(index));
    }

    public void addMovie(MovieClass movie) {
        this.movie.add(new MovieClass(movie));
    }

    public void sell(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cane not be left Blank or null");
        }
        for (int i = 0; i < movie.size(); i++) {
            if(!(movie.get(i).getAvailability())){
                throw new IllegalArgumentException("Move cannot be sell it is already rented out");
            }if (movie.get(i).getName().equals(name)) {
                this.movie.remove(i);
            }
        }
    }

    public void rent(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cane not be left Blank or null");
        }
        for (int i = 0; i < movie.size(); i++) {
            if (movie.get(i).getName().equals(name)) {
                this.movie.get(i).setAvailability(false);
            }
        }
    }
    public void Return(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cane not be left Blank or null");
        }
        for (int i = 0; i < movie.size(); i++) {
            if (movie.get(i).getName().equals(name)) {
                this.movie.get(i).setAvailability(false);
            }
        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < movie.size(); i++) {
            temp += this.movie.get(i).toString();
            temp += "\n\n";
        }

        return temp;
    }
}