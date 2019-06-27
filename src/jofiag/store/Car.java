package jofiag.store;

public class Car {
    private String name;
    private String color;
    private int price;

    public Car(String pName, String pColor, int pPrice){
        name = pName;
        color = pColor;
        price = pPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Afficher une voiture.
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
