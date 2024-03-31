import java.util.ArrayList;
import java.util.List;
class Library {
    private List<Book> catalog;
    private List<String> blacklist;

    public Library() {
        this.catalog = new ArrayList<>();
        this.blacklist = new ArrayList<>();
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public boolean checkBlacklist(String readerName) {
        return blacklist.contains(readerName);
    }

    public Book findBook(String title) {
        for (Book book : catalog) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                return book;
            }
        }
        return null;
    }

    public void lendBook(Book book, String readerName) {
        book.setAvailable(false);
        System.out.println(readerName + " вернул книгу: " + book);
    }

    public void addReaderToBlacklist(String readerName) {
        blacklist.add(readerName);
        System.out.println(readerName + " добавлен в черный список.");
    }
}