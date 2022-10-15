class Author {

  private String authorName;
  private String address;

  Author(String authorName, String address) {
    this.address = address;
    this.authorName = authorName;
  }

  public String getAuthorDetails() {
    return "Name: " + this.authorName + " Address: " + this.address;
  }
}

class Book {

  private String bookName;
  private double price;
  private Author author;

  public void setAuthor(Author author) {
    this.author = author;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Author getAuthor() {
    return author;
  }

  public String getBookName() {
    return bookName;
  }

  public double getPrice() {
    return price;
  }
}

public class Library {

  public static void main(String[] args) {
    Author author = new Author("Herbert", "VB 87, New Jersey, USA");
    Book book = new Book();
    book.setAuthor(author);
    book.setBookName("The Complete Reference: Java");
    book.setPrice(670.00);

    System.out.println("Book Details:");
    System.out.println("Book Name: " + book.getBookName());
    System.out.println("Book Price: " + book.getPrice());
	Author authDetails =  book.getAuthor();
	System.out.println("Author Details:"+authDetails.getAuthorDetails());
  }
}
