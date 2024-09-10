package BookManagement;

import java.util.UUID;

public abstract class Document {
    private UUID id;
    private String publisher;
    private Integer circulation;

    public Document () {

    }

    public Document (String publisher, Integer circulation ){

        this.id = UUID.randomUUID();
        this.publisher = publisher;
        this.circulation  = circulation;

    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getCirculation() {
        return circulation;
    }
    public void setCirculation(Integer circulation) {
        this.circulation = circulation;
    }

    public abstract void display();
}
