package sortingobjects;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieComparatorTests {

    @Test
    public void testYearComparator() {
        YearComparator yearComparator = new YearComparator();
        Movie movie1 = new Movie("Movie A", 2021, null);
        Movie movie2 = new Movie("Movie B", 2020, null);
        int result = yearComparator.compare(movie1, movie2);
        assertEquals(-1, result, "YearComparator test failed!");
    }

    @Test
    public void testTitleComparator() {
        TitleComparator titleComparator = new TitleComparator();
        Movie movie3 = new Movie("An Awesome Movie", 2020, null);
        Movie movie4 = new Movie("The Great Movie", 2021, null);
        int result = titleComparator.compare(movie3, movie4);
        assertEquals(1, result, "TitleComparator test failed!");
    }
}
