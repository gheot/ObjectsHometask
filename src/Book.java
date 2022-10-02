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
}

