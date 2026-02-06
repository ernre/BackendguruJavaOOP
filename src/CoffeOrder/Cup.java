package CoffeOrder;

public class Cup {
    public String material; // Cam, Plastik, Karton
    public String size;     // Small, Medium, Large
    public Straw straw;     // Cup nesnesi bir Straw nesnesi içerir

    public Cup(String material, String size, Straw straw) {
        this.material = material;
        this.size = size;
        this.straw = straw;
    }

    public String getCupInfo() {
        return size + " boy " + material + " bardak ve " + straw.getStrawInfo() ;
    }
}