public class StoreRunner {
  public static void main(String[] args) {


/*Prints out all of the information about clothes, shirts, and pants*/
Clothes WS = new Clothes("Black", "M", 19.00, false);

    System.out.println(WS);

Shirt BrightShirt = new Shirt("Yellow", "L", 25.99, false, true);

    System.out.println(BrightShirt);

Pants SkinnyJeans = new Pants("Navy", "L", 30.75, true, false, false);

    System.out.println(SkinnyJeans);
  }
}
