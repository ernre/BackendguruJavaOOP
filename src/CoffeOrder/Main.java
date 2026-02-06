package CoffeOrder;

public class Main {
    public static void main(String[] args) {
        // 1. Dükkan ismini ve menüsünü görelim
        System.out.println("Mağaza: " + CoffeeShop.shopName);
        CoffeeShop.showMenu();

        // 2. Bir pipet seçelim
        Straw organicStraw = new Straw("Kahve Posası");

        // 3. Bir bardak hazırlayalım
        Cup myCup = new Cup("Cam", "Orta", organicStraw);

        // 4. Farklı senaryolarda kahve üretelim

        // Senaryo A: Sade Sipariş
        Coffee s1 = new Coffee("Espresso", "Küçük", myCup); // Boyut eklendi

        // Senaryo B: Tam Detaylı Sipariş (BUG FIXED)
        // Sıralama: Type, Size, isHot, isDecaf, Cream, Syrup, Cup
        Coffee s2 = new Coffee(
                "Latte",
                "Büyük",        // EKSİK OLAN PARAMETRE EKLENDİ
                false,          // isHot (Soğuk)
                true,           // isDecaf (Kafeinsiz)
                "Süt Köpüğü",   // EKSİK OLAN KREMA EKLENDİ (Yoksa "Yok" yazılmalı)
                "Karamel",      // Şurup
                new Cup("Plastik", "Büyük", new Straw("Kağıt"))
        );

        // 5. Özetleri yazdıralım
        s1.displayOrder();
        s2.displayOrder();
    }
}