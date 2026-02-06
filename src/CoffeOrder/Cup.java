package CoffeOrder;

public class Cup {
    public String material; // Cam, Plastik, Karton. Benim gibi sağlığa takıntılı kişiler cam bardak kullanabilir.
    public String size;     // Small, Medium, Large (tek harf şeklinde de tutulabilir, geliştirmeye açık kısım)
    public Straw straw;     // Cup nesnesi bir Straw nesnesi içerir. Birbirini işaret eden sınıflar (Dog - Owner örneği gibi)

    public Cup(String material, String size, Straw straw) {
        this.material = material;
        this.size = size;
        this.straw = straw;
    }

    public String getCupInfo() {
        return size + " boy " + material + " bardak ve " + straw.getStrawInfo() ;
    }
}