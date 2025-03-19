public class Book {

    
    private String title;
    private String author;
    private double price;

   
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    
    public static void main(String[] args) {
        
        Book defaultBook = new Book();  
        System.out.println(defaultBook);

       
        Book parameterizedBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        System.out.println(parameterizedBook);
    }
}