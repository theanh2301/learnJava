package BookManagement;

public class Newspaper extends Document {
    Integer publicationDate;

    public Newspaper() {

    }
    public Newspaper(Integer publicationDate,String publisher, Integer circulation) {
        super(publisher, circulation);
        this.publicationDate = publicationDate;
    }

    public Integer getPublicationDate() { return publicationDate; }
    public void setPublicationDate(Integer publicationDate) { this.publicationDate = publicationDate; }
    @Override
    public void display() {
        System.out.print("The newspaper ");
        System.out.print(" | Id: " + getId());
        System.out.print(" | publication date: " + publicationDate);
        System.out.print(" | publisher: " + getPublisher());
        System.out.println(" | circulation: " + getCirculation());
    }
}
