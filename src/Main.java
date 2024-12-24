import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Java");
        books.add("Python");
        books.add("JavaScript");
        books.add("C++");
        books.add("C#");
        books.add("PHP");
        books.add("C+++");
        books.add("C##");
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");
        books.add("Book4");
        books.add("Book5");
        List<List<String>> result = BookShelf.distributeBooks(books);
        System.out.println(result);

    }
}

