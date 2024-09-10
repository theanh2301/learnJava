package BookManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManagement {

    private final List<Document> list;

    public BookManagement() {
        this.list = new ArrayList<>();
    }
    public void displayList() {
        int i = 1;
        if (list.isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            for (Document doc : list) {
                System.out.println("The " + i + " document: ");
                doc.display();
                i = i + 1;
            }
        }
    }

    public void add(Document doc) {
        this.list.add(doc);
    }

    public void remove(Document doc) {
        this.list.remove(doc);
    }
    public void removeList(Scanner sc) {
        System.out.print("Enter publisher of the document you want to delete: ");
        String del = sc.nextLine();
        for (Document doc : list) {
            if (del.equals(doc.getPublisher())){
                remove(doc);
                break;
            }
        }
    }

    public void searchList(Scanner sc) {
        System.out.print("Enter publisher of the document you want to find: ");
        String find = sc.next();

            for (Document doc : list) {
                if (find.equals(doc.getPublisher())) {
                    doc.display();
                }
            }

    }


}
