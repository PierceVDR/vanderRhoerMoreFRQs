public class Book {
    private String title;
    private double price;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Book(String bookTitle, double bookPrice) {
        title = bookTitle;
        price = bookPrice;
    }

    public String getTitle() {
        return title;
    }

    public String getBookInfo() {
        return title + "-" + price;
    }
}
