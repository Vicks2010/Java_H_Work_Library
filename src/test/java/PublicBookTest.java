import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PublicBookTest {

    private PublicBook myBooks;
//    ArrayList<Integer> books

    @Before
    public void before(){
        myBooks = new PublicBook();
    }

    @Test
    public void hasNumberOfBooks(){
        assertEquals(0, myBooks.getBookCount());
    }

    @Test
    public void canAddBookToList(){
        myBooks.addBook(6);
        assertEquals(1, myBooks.getBookCount() );
    }
}
