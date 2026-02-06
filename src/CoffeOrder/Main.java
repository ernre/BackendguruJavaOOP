package CoffeOrder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mağaza: " + CoffeeShop.shopName);
        CoffeeShop.showMenu();

        Straw organicStraw = new Straw("Kahve Posası");

        Cup myCup = new Cup("Cam", "Orta", organicStraw);

        // Sipariş detayları farklı olunca ne olacak?

        // Senaryo A: Sade Sipariş
        Coffee s1 = new Coffee("Espresso", "Küçük", myCup); // Boyut eklendi

        // Senaryo B: Tam Detaylı Sipariş
        Coffee s2 = new Coffee(
                "Latte",
                "Büyük",
                false,
                true,
                "Vişneli Krema",
                "Fındık",
                new Cup("Plastik", "Büyük", new Straw(" Kağıt"))
        );

        s1.displayOrder();
        s2.displayOrder();
    }
}