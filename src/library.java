import java.util.ArrayList;
import java.util.List;
public class library {
    private static List<book> books = List.of();
    private static List<member> members = List.of();

    public library() {
        books = new ArrayList<book>();
        members = new ArrayList<member>();
    }
    public static void addBook(book Book){
        books.add(Book);
        System.out.println("Added book:" + Book.title);
    }
    public static void registerMember(member Member){
        members.add(Member);
        System.out.println("Registered member:" + Member.name);
    }
    private static book findBookByIsbn(String isbn){
        for(book book : books){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }
    private static member findMemberById(String memberId){
        for(member member : members){
            if(member.getMemberId().equals(memberId))
            {
                return member;
            }
        }
        return null;
    }
    public static void lendBook(String isbn, String memberId){
        book book = findBookByIsbn(isbn);
        member member = findMemberById(memberId);
        if(book!=null && member!=null)
        {
            member.borrowBook(book);
        }else{
            System.out.println("book or member not found");
        }
    }
}

