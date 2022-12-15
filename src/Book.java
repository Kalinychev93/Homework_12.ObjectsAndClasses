public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = new Author(author.getFirstName(), author.getSurName());
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {  // не совсем понял, зачем создавать, если не используется? Либо я что-то не правильно сделал?
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
