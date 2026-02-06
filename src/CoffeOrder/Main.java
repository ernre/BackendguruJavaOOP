package CoffeOrder;

public class Main {
    public static void main(String[] args) {
        // 1. Dükkan ismini ve menüsünü görelim (Nesne üretmeden!)
        System.out.println("Mağaza: " + CoffeeShop.shopName);
        CoffeeShop.showMenu();

        // 2. Bir pipet seçelim
        Straw organicStraw = new Straw("Kahve Posası");

        // 3. Bir bardak hazırlayalım
        Cup myCup = new Cup("Cam", "Orta", organicStraw);

        // 4. Farklı senaryolarda kahve üretelim

        // Senaryo A: Sade Sipariş (Chaining sayesinde)
        Coffee s1 = new Coffee("Espresso", myCup);

        // Senaryo B: Tam Detaylı Sipariş
        Coffee s2 = new Coffee("Latte", false, true, "Karamel",
                new Cup("Plastik", "Büyük", new Straw("Kağıt")));

        // 5. Özetleri yazdıralım
        s1.displayOrder();
        s2.displayOrder();
    }
}