package ObjectOrientedProgramming;


class Library {

    private int size;
    private int[] books;
    private int[] issuedBooks;
    private int counter;

    Library(int size) {
        this.size = size;
        books = new int[size];
        issuedBooks = new int[size];
        counter = 0;
    }

    void addBook(int bookId) {
        books[counter] = bookId;
        System.out.println("Book added successfully");
    }

    void issueBook(int id) {
        issuedBooks[id] = 1;
        System.out.println("Book issued successfully");
    }

    void returnBook(int id) {
        books[id] = 0;
        System.out.println("Book returned successfully");
    }

    void availableBooks() {
        for(int i=0; i<size; i++) {
            if(books[i]==1)
                System.out.println("Book id: " + i + " is Present");
        }
    }
}


public class LibraryClassExercise {
    public static void main() {

    }
}
