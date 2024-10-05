public class Shirt extends Clothes {
  /*These are the instance variables for the shirt class*/
  private boolean hasSleeves;
  private boolean hasDesign;
  
public Shirt(String color, String size, double price, boolean hasSleeves, boolean hasDesign) {
        super(color,size,price);
        this.hasSleeves = hasSleeves;
        this.hasDesign = hasDesign;
    }
//Sees if the shirt has sleeves or not
    public boolean hasSleeves() {
        return hasSleeves;
    }
//Sees if the shirt has a design or not
    public boolean hasDesign() {
        return hasDesign;
    }
//Gets information from the StoreRunner to print out the information about the shirt.
    public String toString() {
        return "\nShirt- " + "\nColor: " + getColor() + "\nSize: " + getSize() + "\nPrice: " + getPrice() + "\nSleeves: " + hasSleeves + 
              "\nDesign: " + hasDesign ;
    }
}
