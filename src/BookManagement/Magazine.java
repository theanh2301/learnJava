package BookManagement;

public class Magazine extends Document {
    Integer issueNumber;
    Integer publicationMonth;

    public Magazine() {

    }
    public Magazine(Integer issueNumber, Integer publicationMonth,String publisher, Integer circulation) {
        super(publisher, circulation);
        this.issueNumber = issueNumber;
        this.publicationMonth = publicationMonth;
    }

    public Integer getPublicationMonth() { return publicationMonth; }
    public void setIssueNumber(Integer issueNumber) { this.issueNumber = issueNumber; }
    public Integer getIssueNumber() { return issueNumber; }
    public void setPublicationMonth(Integer publicationMonth) { this.publicationMonth = publicationMonth; }
    @Override
    public void display() {
        System.out.print("The magazine ");
        System.out.print(" | Id: " + getId());
        System.out.print(" | issue number: " + issueNumber);
        System.out.print(" | publication month: " + publicationMonth);
        System.out.print(" | publisher: " + getPublisher());
        System.out.println(" | circulation: " + getCirculation());
    }
}
