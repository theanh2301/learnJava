import java.util.Scanner;
public class LibraryMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Lua chon nguoi dung");
            System.out.println("1. Doc Gia");
            System.out.println("2. Thu Thu");
            System.out.println("0. Thoat");
            System.out.println("--------------------------------");
            System.out.print("Nhap lua chon cua ban: ");
            String choice = sc.nextLine();
            if (choice.equals("1")) {
                System.out.println("Case 1");
                while (true) {
                    System.out.println("--------------------------------");
                    System.out.println("1. Case 1");
                    System.out.println("2. Case 2");
                    System.out.println("3. Case 3");
                    System.out.println("4. Case 4");
                    System.out.println("0. Thoat");
                    System.out.println("--------------------------------");
                    System.out.print("Nhap lua chon cua ban: ");
                    choice = sc.nextLine();
                    if (choice.equals("1")) {
                        System.out.println("Case 1");

                    } else if (choice.equals("2")) {
                        System.out.println("Case 2");

                    } else if (choice.equals("3")) {
                        System.out.println("Case 3");

                    } else if (choice.equals("4")) {
                        System.out.println("Case 4");

                    } else if (choice.equals("0")) {
                        break;
                    } else {
                        System.out.println("Hay nhap dung lua chon: ");
                    }
                }
            } else if (choice.equals("2")) {
                System.out.println("Case 2");
                while (true) {
                    System.out.println("--------------------------------");
                    System.out.println("1. Case 1");
                    System.out.println("2. Case 2");
                    System.out.println("3. Case 3");
                    System.out.println("4. Case 4");
                    System.out.println("5. Case 5");
                    System.out.println("6. Case 6");
                    System.out.println("0. Thoat");
                    System.out.println("--------------------------------");
                    System.out.print("Nhap lua chon cua ban: ");
                    choice = sc.nextLine();
                    if (choice.equals("1")) {
                        System.out.println("Case 1");

                    } else if (choice.equals("2")) {
                        System.out.println("Case 2");

                    } else if (choice.equals("3")) {
                        System.out.println("Case 3");

                    } else if (choice.equals("4")) {
                        System.out.println("Case 4");

                    } else if (choice.equals("5")) {
                        System.out.println("Case 5");

                    } else if (choice.equals("6")) {
                        System.out.println("Case 6");

                    } else if (choice.equals("0")) {
                        break;
                    } else {
                        System.out.println("Hay nhap dung lua chon: ");
                    }
                }

            } else if (choice.equals("0")) {
                System.out.println("Bye Bye! ^ ^");
                System.exit(0);
            } else {
                System.out.println("Hay nhap dung lua chon: ");
            }


        }
    }
}