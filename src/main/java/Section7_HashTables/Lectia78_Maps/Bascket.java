package Section7_HashTables.Lectia78_Maps;

public class Bascket {

   String fruits;
   int quantity;

    public Bascket(String fruits, int quantity) {
        this.fruits = fruits;
        this.quantity = quantity;
    }

    public String getFruits() {
        return fruits;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Bascket{" +
                "fruits='" + fruits + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
