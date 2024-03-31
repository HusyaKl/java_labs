import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        Librarian librarian = new Librarian("Ксения");
        Reader reader = new Reader("Настя");

        // Взаимодействие с библиотекой
        System.out.print("Введите название книги: ");
        String bookTitle = scanner.nextLine();

        Book foundBook = library.findBook(bookTitle);

        if (foundBook != null) {
            librarian.issueBook(foundBook, reader);
        } else {
            System.out.println("Книга не найдена в каталоге.");
        }
        Book newBook = new Book("Преступление и наказание", "Достоевский");
        library.addBook(newBook);

        // Взаимодействие с библиотекой
        System.out.print("Введите название книги: ");
        String bookTitle2 = scanner.nextLine();

        Book foundBook2 = library.findBook(bookTitle2);

        if (foundBook2 != null) {
            librarian.issueBook(foundBook2, reader);
        } else {
            System.out.println("Книга не найдена в каталоге.");
        }

        System.out.print("Читатель вернул книгу? (да/нет): ");
        String returnStatus = scanner.nextLine();

        if (returnStatus.equalsIgnoreCase("нет")) {
            reader.addToBlacklist();
        }

        scanner.close();
    }
}