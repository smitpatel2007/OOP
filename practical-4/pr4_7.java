
class Book {
    String title;
    String author;
    double price;

    // Method to set details
    void setDetails(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Method to apply discount
    void applyDiscount(double discountPercent) {
        price = price - (price * discountPercent / 100);
        System.out.println("Price after " + discountPercent + "% discount: " + price);
    }
}


public class pr4_7 {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setDetails("Java Programming", "James Gosling", 500);
        b1.displayDetails();
        b1.applyDiscount(10);
    }
}
