public class Book{
    public String author;
    public boolean isAvailable;
    public double price;
    public String publisher;
    public String title;
    public int yearPublished;
    
    public void printDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + price);
        if (isAvailable == true){
            System.out.println("Available: Yes");
        }else if (isAvailable == false){
            System.out.println("Available: No");
        }
    }
    public void updatePrice(double newPrice){
        price = newPrice;
    }
    public void markAsUnavailable(){
        isAvailable = false;
    }
    public void markAsAvailable(){
        isAvailable = true;
    }
    public boolean isPublishedAfter(int year){
        if (year < yearPublished){
            return true;
        }else{
            return false;
        }
    }
}
