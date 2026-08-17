package java_roadmap.week2;

import java.util.*;

class Book {
    private String mainBookID;
    private String title;
    private boolean available;

    public Book(String bookID, String title) {
        this.mainBookID = bookID;
        this.title = title;
        this.available = true;
    }

    public String getBookID() {
        return mainBookID;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return getBookID() + " | " + title +
                " | " + (available ? "Available" : "Borrowed");
    }
}


class Member {
    private String memberID;
    private List<Book> borrowedBooks;

    public Member(String memberID) {
        this.memberID = memberID;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getMemberID() {
        return memberID;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "Member ID: " + memberID +
                " | Borrowed Books: " + borrowedBooks.size();
    }
}


class LibraryManager {

    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();


    // =========================
    // BOOK METHODS
    // =========================

    public void addBook(Book book) {

        for (Book existingBook : books) {
            if (existingBook.getBookID().equals(book.getBookID())) {
                System.out.println("Book ID already exists.");
                return;
            }
        }

        books.add(book);
        System.out.println("Book added successfully.");
    }


    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available in library.");
            return;
        }

        System.out.println("\n----- BOOK LIST -----");

        for (Book book : books) {
            System.out.println(book);
        }
    }


    public void removeBook(String bookID) {

        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {

            Book book = iterator.next();

            if (book.getBookID().equals(bookID)) {

                if (!book.isAvailable()) {
                    System.out.println("Cannot remove book. Book is currently borrowed.");
                    return;
                }

                iterator.remove();
                System.out.println("Book removed successfully.");
                return;
            }
        }

        System.out.println("Book not found.");
    }


    private Book findBook(String bookID) {

        for (Book book : books) {

            if (book.getBookID().equals(bookID)) {
                return book;
            }
        }

        return null;
    }


    // =========================
    // MEMBER METHODS
    // =========================

    public void addMember(String memberID) {

        if (findMember(memberID) != null) {
            System.out.println("Member ID already exists.");
            return;
        }

        members.add(new Member(memberID));

        System.out.println("Member registered successfully.");
    }


    private Member findMember(String memberID) {

        for (Member member : members) {

            if (member.getMemberID().equals(memberID)) {
                return member;
            }
        }

        return null;
    }


    // =========================
    // BORROW BOOK
    // =========================

    public void borrowBook(String bookID, String memberID) {

        Book book = findBook(bookID);
        Member member = findMember(memberID);


        // Check member
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }


        // Check book
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }


        // Check availability
        if (!book.isAvailable()) {
            System.out.println("Book is already borrowed.");
            return;
        }


        // Add existing Book object to existing Member
        member.borrowBook(book);

        // Change book status
        book.setAvailable(false);

        System.out.println(
                "Book " + bookID +
                        " has been borrowed by member " + memberID + "."
        );
    }


    // =========================
    // RETURN BOOK
    // =========================

    public void returnBook(String bookID, String memberID) {

        Member member = findMember(memberID);

        if (member == null) {
            System.out.println("Member not found.");
            return;
        }


        Book book = findBook(bookID);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }


        if (!member.getBorrowedBooks().contains(book)) {
            System.out.println(
                    "This member has not borrowed this book."
            );
            return;
        }


        member.returnBook(book);

        book.setAvailable(true);

        System.out.println(
                "Book " + bookID +
                        " returned successfully."
        );
    }


    // =========================
    // MEMBER RECORD
    // =========================

    public void viewMemberRecord(String memberID) {

        Member member = findMember(memberID);

        if (member == null) {
            System.out.println("Member not found.");
            return;
        }


        System.out.println("\n----- MEMBER RECORD -----");

        System.out.println("Member ID: " + member.getMemberID());

        List<Book> borrowedBooks = member.getBorrowedBooks();


        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
            return;
        }


        System.out.println("Borrowed Books:");

        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}


public class Library {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LibraryManager lm = new LibraryManager();

        boolean running = true;


        while (running) {

            System.out.println("""
                    
                    ===== LIBRARY =====
                    
                    1. Customer's Panel
                    2. Admin's Panel
                    3. Exit
                    
                    Enter your choice:
                    """);


            int choice1 = readInt(sc);


            switch (choice1) {

                // =========================
                // CUSTOMER PANEL
                // =========================

                case 1:

                    boolean customerRunning = true;

                    while (customerRunning) {

                        System.out.println("""
                                
                                ----- CUSTOMER'S PANEL -----
                                
                                1. Borrow Book
                                2. Return Book
                                3. View Books
                                4. View Member Record
                                5. Exit
                                
                                Enter your choice:
                                """);


                        int choice2 = readInt(sc);


                        switch (choice2) {

                            case 1:

                                System.out.println("Enter Book ID:");
                                String bookID = sc.next();

                                System.out.println("Enter Member ID:");
                                String memberID = sc.next();

                                lm.borrowBook(bookID, memberID);

                                break;


                            case 2:

                                System.out.println("Enter Book ID:");
                                String returnBookID = sc.next();

                                System.out.println("Enter Member ID:");
                                String returnMemberID = sc.next();

                                lm.returnBook(
                                        returnBookID,
                                        returnMemberID
                                );

                                break;


                            case 3:

                                lm.viewBooks();

                                break;


                            case 4:

                                System.out.println("Enter Member ID:");
                                String recordMemberID = sc.next();

                                lm.viewMemberRecord(recordMemberID);

                                break;


                            case 5:

                                customerRunning = false;

                                break;


                            default:

                                System.out.println("Invalid choice.");
                        }
                    }

                    break;


                // =========================
                // ADMIN PANEL
                // =========================

                case 2:

                    boolean adminRunning = true;

                    while (adminRunning) {

                        System.out.println("""
                                
                                ----- ADMIN'S PANEL -----
                                
                                1. Add Book
                                2. Remove Book
                                3. View Books
                                4. Add Member
                                5. Exit
                                
                                Enter your choice:
                                """);


                        int choice3 = readInt(sc);


                        switch (choice3) {

                            case 1:

                                System.out.println("Enter Book ID:");
                                String bookID = sc.next();

                                sc.nextLine();

                                System.out.println("Enter Book Title:");
                                String title = sc.nextLine();

                                lm.addBook(
                                        new Book(bookID, title)
                                );

                                break;


                            case 2:

                                System.out.println(
                                        "Enter Book ID to remove:"
                                );

                                String removeBookID = sc.next();

                                lm.removeBook(removeBookID);

                                break;


                            case 3:

                                lm.viewBooks();

                                break;


                            case 4:

                                System.out.println("Enter Member ID:");
                                String memberID = sc.next();

                                lm.addMember(memberID);

                                break;


                            case 5:

                                adminRunning = false;

                                break;


                            default:

                                System.out.println("Invalid choice.");
                        }
                    }

                    break;


                // =========================
                // EXIT
                // =========================

                case 3:

                    running = false;

                    System.out.println("Exiting library...");

                    break;


                default:

                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }


    // =========================
    // INPUT METHOD
    // =========================

    private static int readInt(Scanner sc) {

        while (true) {

            try {

                return sc.nextInt();

            } catch (InputMismatchException e) {

                System.out.println(
                        "Invalid input. Please enter a number."
                );

                sc.nextLine();
            }
        }
    }
}