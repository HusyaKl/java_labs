class Librarian {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public void issueBook(Book book, Reader reader) {
        if (book.isAvailable() && !reader.isOnBlacklist()) {
            book.setAvailable(false);
            System.out.println(this.name + " выдал книгу '" + book.getTitle() + "' " + reader.getName());
        } else {
            System.out.println("НЕльзя выдать книгу " + reader.getName());
        }
    }
}
