
public class Main{

    public static void main(String[]args){
    library lib = new library();
    book book1 = new book("World Rallying", "Sebastian Lob","wrc",44);
    book book2 = new book ("Toyota Racing","Chris Meek","tgr",55);
    book book3 = new book("Ford Fiesta","Adrian Four max","frt",66);
    book book4 = new book("Citron","James Pari","ctr",52);
    book book5 = new book("Evolution","Nasser Mute","nash",99);

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);
    library.addBook(book4);
    library.addBook(book5);


    member member1 = new member("Kato Ismail","W001");
    member member2 = new member("Seb Ogler","W003");
    library.registerMember(member1);
    library.registerMember(member2);

    library.lendBook("wrc","W001");
    library.lendBook("tgr","W001");
    library.lendBook("frt","W003");
}
}