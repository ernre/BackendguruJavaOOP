package CoffeOrder;

public class Straw {
    public String material; // Kağıt, Plastik, Kahve Posası

    public Straw(String material) {
        this.material = material;
    }

    public String getStrawInfo() {
        return material + " pipet seçildi.";
    }
}