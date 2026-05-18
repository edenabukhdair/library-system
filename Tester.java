public class Tester {
    public static void main(String[] args) {
        Book B1=new Book("colors","dene",100,564);
        Book B2=new Book("numbers","lolo",160,500);
        B1.printDetails();
        B2.printDetails();
        B2.setPrice(200);
        B2.printDetails();
    }
}
