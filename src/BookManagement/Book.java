package BookManagement;

public class Book extends Document {
    String author;
    Integer pages;
    public Book() {

    }

    public Book(String author, Integer pages ,String publisher, Integer circulation) {
        super(publisher, circulation);
        this.author = author;
        this.pages = pages;
    }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public Integer getPages() { return pages; }
    public void setPages(Integer pages) { this.pages = pages; }

    @Override
    public void display() {
        System.out.print("The book ");
        System.out.print(" | Id: " + getId());
        System.out.print(" | Author: " + author);
        System.out.print(" | Page: " + pages);
        System.out.print(" | publisher: " + getPublisher());
        System.out.println(" | circulation: " + getCirculation());
    }
}
