/** A class to store the barcode and name of the ingredient. */

public class Ingredient {
    private long barcode;
    private String name;

    public Ingredient(long barcode, String name){
        this.barcode = barcode;
        this.name = name;
    }
    public String toString() {
            return name;
        }
}
