package newLibrary;

public class Book {

    private String isbn;
    private String name;
    private Author authors;
    private double price;
    private int qty = 0;

    public Book( String isbn, String name, Author authors, double price){

        this.isbn = isbn;
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String isbn,String name, Author authors, double price, int qty){

        this.isbn = isbn;
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getName(){
        return name;
    }

    public Author getAuthor(){
        return authors ;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString(){

        return  "Book[isbn = " + isbn+ " ,name = " + name + ", Author[0][" + authors.toString() + "]" + ", price = " + price + ", qty= " + qty;

    }
}
