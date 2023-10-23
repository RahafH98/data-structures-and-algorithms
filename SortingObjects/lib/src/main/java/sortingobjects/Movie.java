package sortingobjects;

import java.util.Comparator;
import java.util.List;

public class Movie {
    private String title;
    private int year;
    private List<String> genres;

    public Movie(String title, int year, List<String> genres) {
        this.title = title;
        this.year = year;
        this.genres = genres;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getGenres() {
        return genres;
    }
}

class YearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie2.getYear() - movie1.getYear();
    }
}


class TitleComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        String title1 = removeCommonPrefixes(movie1.getTitle()).toLowerCase().trim();
        String title2 = removeCommonPrefixes(movie2.getTitle()).toLowerCase().trim();

        int result = title1.compareTo(title2);


        if (result < 0) {
            return 1; // movie1 > movie2
        } else if (result > 0) {
            return -1; // movie1 < movie2
        } else {
            return 0; // movie1 == movie2
        }
    }

    private String removeCommonPrefixes(String title) {
        String[] commonPrefixes = {"A ", "An ", "The "};
        for (String prefix : commonPrefixes) {
            if (title.regionMatches(true, 0, prefix, 0, prefix.length())) {
                title = title.substring(prefix.length());
                break;
            }
        }
        return title;
    }
}



