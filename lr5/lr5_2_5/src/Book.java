import java.util.InputMismatchException;
import java.util.Scanner;

class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int pageCount;
    private double price;
    private String binding;

    public Book(int id, String title, String author, String publisher, int year, int pageCount, double price, String binding) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
        this.binding = binding;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор(ы): " + author);
        System.out.println("Издательство: " + publisher);
        System.out.println("Год: " + year);
        System.out.println("Количество страниц: " + pageCount);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Переплет: " + binding);
        System.out.println();
    }
    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "Преступление и наказание", "Достоевский", "Москва", 2000, 300, 20.0, "Твердый"),
                new Book(2, "Дракула", "Стокер", "Издательство", 2005, 250, 15.0, "Мягкий"),
                new Book(3, "1984", "Оруэлл", "АСТ", 2010, 400, 30.0, "Твердый")
        };

        Scanner scanner = new Scanner(System.in);

        // обработка исключений
        try {
            // a) список книг заданного автора
            System.out.print("Введите автора: ");
            String authorName = scanner.nextLine();
            System.out.println("Книги " + authorName + ":");
            for (Book book : books) {
                if (book.getAuthor().equalsIgnoreCase(authorName)) {
                    book.displayInfo();
                }
            }

            // b) список книг, выпущенных заданным издательством
            System.out.print("Введите название издательства: ");
            String publisherName = scanner.nextLine();
            System.out.println("Книги " + publisherName + ":");
            for (Book book : books) {
                if (book.getPublisher().equalsIgnoreCase(publisherName)) {
                    book.displayInfo();
                }
            }

            // c) список книг, выпущенных после заданного года
            System.out.print("Введите год издательства: ");
            int year = scanner.nextInt();
            System.out.println("Книги изданные после " + year + ":");
            for (Book book : books) {
                if (book.getYear() > year) {
                    book.displayInfo();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено некорректное значение.");
        } finally {
            scanner.close(); // закрытие потока ввода
        }
    }
}