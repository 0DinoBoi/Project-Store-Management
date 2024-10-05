public class Clothes{
//Instance Variables
private String color;
private String size;
private double price;
  private boolean inStock;
//Default Value
public Clothes(){
  color = "white ";
size = "S ";
  price = 15.99;
  inStock = true;
}
  
public Clothes(String color, String size, double price, boolean inStock){
  this.color = color;
  this.size = size;
  this.price = price;
  this.inStock = inStock;
}
//Gets the color of the clothes
  public String getColor(){
    return color;
  }

  public void setColor(String newColor){
    this.color = newColor;
  }


//Gets the size
  public String getSize(){
    return size;
  }

  public void setSize(String newSize){
    this.size = newSize;
  }
//Gets the price
public Double getPrice(){
return price;
}

public void setPrice(double newPrice){
   this.price = newPrice;
}
//See if it is in stock or not
public Boolean getInStock(){
  return inStock;
}

public void setInStock(boolean updatedStock){
  if(inStock = true){
    inStock = true;
    this.inStock = updatedStock;
  } 
  else {
     inStock = false;
    this.inStock = updatedStock;
  }
  
}
//The final destination where all the information from the StoreRunner gets inputted into this toString.
  public String toString(){
    return "Color: " + color + "\nSize: " + size + "\nPrice: " + price + "\nIn Stock? " + inStock;
  }  
}
