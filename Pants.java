public class Pants extends Clothes {
  //Instance Variables
    private boolean isSkinny;
    private boolean isLoose;
    private boolean isStraight;

    public Pants(String color, String size, boolean isSkinny, boolean isLoose, boolean isStraight, double price) {
        super(color,size,price);
        this.isSkinny = isSkinny;
        this.isLoose = isLoose;
        this.isStraight = isStraight;
    }
//Sees if the pants is a skinny fit
    public boolean isSkinny() {
        return isSkinny;
    }
//Sees if the pants is a loose fit
    public boolean isLoose() {
        return isLoose;
    }
//Sees if the pants is a straight fit
    public boolean isStraight() {
        return isStraight;
    }
//Prints out the information about the pants from the StoreRunner.
    public String toString() {
        return "\nPants-" +
                "\nColor: " + getColor() +
                "\nSize: " + getSize() +
                "\nSkinny? - " + isSkinny +
                "\nLoose? - " + isLoose +
                "Straight? - " + isStraight +
                "Price: " + getPrice();
    }
}
