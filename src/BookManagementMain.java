import BookManagement.BookManagement;
import BookManagement.*;

import java.util.Scanner;

public class BookManagementMain {
    private static InputValidator inputValidator;

    public static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        inputValidator = new InputValidator();
        BookManagement bookManagement = new BookManagement();
//        Document book = new Book("publisher",3);
        Document magazine = new Magazine(4211, 12 , "publisher", 2);
        Document newspaper = new Newspaper( 20,"publisher", 1);

        while (true) {
            System.out.println("\nCan I help you?");
            System.out.println("1. Print document.");
            System.out.println("2. Add document.");
            System.out.println("3. Remove document.");
            System.out.println("4. Search document.");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            int choice = inputValidator.readInt();

            switch (choice) {
                case 1:
                    System.out.println("case 1:");
                    bookManagement.displayList();
                    break;
                case 2:
                    System.out.println("case 2:");
                    System.out.print("Enter the length of the list: ");
                    int n = sc.nextInt();
                    for (int  i = 1; i <= n; i++) {
                        Document book = new Book("author", 100 ,"publisher",0);
                        System.out.println("Document " + i);
                        System.out.print("Enter publisher: ");
                        book.setPublisher(sc.next());
                        System.out.print("Enter circulation: ");
                        book.setCirculation(sc.nextInt());
                        System.out.print("Enter author: ");
                        book.setAuthor(sc.next());
                        System.out.print("Enter pages: ");
                        book.setPages(sc.nextInt());
                        bookManagement.add(book);
                    }
                    break;
                case 3:
                    System.out.println("case 3:");
                    bookManagement.removeList(sc);
                    break;
                case 4:
                    System.out.println("case 4:");
                    bookManagement.searchList(sc);
                    break;
                case 0:
                    System.out.println("Bye bye!");
                    System.exit(0);
                default:
                    System.out.println("Your choice is invalid!");
            }

        }
    }
}