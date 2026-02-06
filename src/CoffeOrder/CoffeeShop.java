package CoffeOrder;
import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    public static String shopName = "Java & Liverpool Hub";
    public static List<String> menu = new ArrayList<>();

    static {
        menu.add("Espresso");
        menu.add("Latte");
        menu.add("Cappuccino");
        menu.add("Flat White");
        menu.add("Americano");
        System.out.println("[SİSTEM] Menü başarıyla yüklendi. " + shopName + " açıldı!");
    }

    public static void showMenu() {
        System.out.println("=== GÜNCEL MENÜ ===");
        for (String item : menu) {
            System.out.println("-  " + item);
        }
    }
}