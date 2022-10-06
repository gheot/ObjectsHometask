import java.util.Objects;

public class Book {
    private int publishYear;
    private final String title;
    private final Author author;
    public Book (String title, Author author, int publishYear) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getTitle () {
        return this.title;
    }

    public Author getAuthor () {
        return this.author ;
    }

    public int getPublishYear () {
        return this.publishYear;
    }

    public void setPublishYear (int publishYear) {
        this.publishYear = publishYear ;
    }
    public String bookInfo() {
        return "Книга: " + this.title + " Автор: " + this.author.getFullName() + " Год публикации: " +
                this.publishYear;
    }

     public String toString() {
        return "Книга: " + title + " Автор: " +  author + " Год публикации: " + publishYear;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishYear, title, author);
    }
}

