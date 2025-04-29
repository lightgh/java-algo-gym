package topicwise.classes;

import java.util.ArrayList;
import java.util.List;

/** - Immutable Classes
 * 1. Make Fields Final and private
 * 2. Don't provide setters
 * 3. No subclasses (ex: make class final)
 * 4. Write constructor taking all fields
 */
public class ImmutableClasses {
}

/**
 * POJO
 *  - constructor
 *  - toString()
 *  - hashCode() - more rules
 *  - equals() - more rules
 */
class POJO {}

record Book(String isbn, String title, String author) {
    @Override
    public String toString() {
        return String.format("%s[%s, %s, %s] - Just Title", this.getClass().getSimpleName(), isbn, title, author);
    }

    public boolean isAllowedTitle(){
        return this.title.contains("Java");
    }
}

record BookNM(String isbn, String title, String author, int numPages, List<String> chapters) {
    public BookNM {
        chapters = List.copyOf(chapters);
    }
}



class TestBook {
    public static void main(String[] args) {
        Book book = new Book("123", "Java Programming", "John Smith");
        System.out.println("book.author() = " + book.author());
        System.out.println("book.isbn() = " + book.isbn());
        System.out.println("book.toString() = " + book.toString());
        System.out.println("book title is Allowed = " + book.isAllowedTitle());


        List<String> chapters = new ArrayList<>();
        chapters.add("1");
        BookNM bookNM = new BookNM(book.isbn(), book.title(), book.author(), 2342, chapters);
        chapters.add("2");
        System.out.println(bookNM.toString());
//        bookNM.chapters().add("3");
        chapters.add("4");
        System.out.println(bookNM.toString());
    }
}


