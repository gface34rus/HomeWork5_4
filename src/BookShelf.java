import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookShelf {
    public static List<List<String>> distributeBooks(List<String> books) {
        Collections.sort(books);
        final int SHELF_COUNT = 5;
        List<List<String>> shelves = new ArrayList<>();
        for (int i = 0; i < SHELF_COUNT; i++) {
            shelves.add(new ArrayList<>());
        }
        for (int i = 0; i < books.size(); i++) {
            int shelfIndex = i % SHELF_COUNT;
            shelves.get(shelfIndex).add(books.get(i));
        }
        return shelves;
    }
}
