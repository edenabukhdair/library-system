public class Book {
    private String title;
    private String author;
  private double price;
 private int pages;
 public Book(String title, String author, double price, int pages) {
     this.title = title;
     this.author = author;
     this.price = price;
     this.pages = pages;
 }
 public String getTitle() {
     return title;
 }
 public void setTitle(String title) {
     this.title = title;
 }
 public String getAuthor() {
     return author;
 }
 public void setAuthor(String author) {
     this.author = author;
 }
 public double getPrice() {
     return price;
 }
 public void setPrice(double price) {
     if (price > 0) {
         this.price = price;
     }
 }
 public int getPages() {
     return pages;
 }
 public void setPages(int pages) {
     this.pages = pages;
 }
 public void printDetails() {
     System.out.println("Title: " + this.getTitle());
     System.out.println("Author: " + this.getAuthor());
     System.out.println("Price: " + this.getPrice());
     System.out.println("Pages: " + this.getPages());
 }

}
