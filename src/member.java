
import java.util.ArrayList;
import java.util.List;
public class member {
    public String name;
    private final String memberId;
    private final List<book> borrowedBooks;

    public member(String name, String memberId){
        this.name = name;
        this.memberId = memberId;
        borrowedBooks = new ArrayList<>();
    }

    public List<book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public String getMemberId()
    {
        return memberId;
    }
    public void borrowBook(book Book) {
        borrowedBooks.add(Book);

    }
        private void addBookToBorrowedList (book Book){
        borrowedBooks.add(Book);
        System.out.println(name + "borrowed" + Book.title);
        }


}
