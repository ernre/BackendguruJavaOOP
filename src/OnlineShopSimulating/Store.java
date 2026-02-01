package OnlineShopSimulating;

import java.util.HashMap;
import java.util.ArrayList;

public class Store {
    String storeName;
    Budget budget;
    Bank bank;
    double reputation;

    // Ürünleri kategorisine göre hash indisleme yöntemi ile tutuyoruz.
    HashMap<String, ArrayList<Product>> warehouse;

    public Store (String storeName, double initialMoney) {
        this.storeName = storeName;
        this.budget = new Budget(initialMoney);
        this.warehouse = new HashMap<>();
        this.bank = new Bank();
        this.reputation = initialMoney;

        this.warehouse.put("Electronic", new ArrayList<>());
        this.warehouse.put("Fashion", new ArrayList<>());
        this.warehouse.put("Sports", new ArrayList<>());
    }

    public void adProductToWarehouse(String category, Product p){
        if (this.warehouse.containsKey(category)){
            this.warehouse.get(category).add(p);
            System.out.println(p.name + " ürünü " + category + " kategorisine eklendi.");
        }
        else {
            System.out.println("Hata! Geçersiz Kategori Girildi..");
        }
    }

    public void showProductByCategory(String category){
        System.out.println("--- " + category + " Deposu ---");
        ArrayList<Product> products = this.warehouse.get(category);

        for (Product p : products){
            System.out.println("Ürün" + p.name + " | Stok: " + p.stock + " | Fiyat: " + p.price);
        }
    }

    public void sellProduct(String category, String productName) {
        ArrayList<Product> products = this.warehouse.get(category);

        for (Product p : products) {
            if (p.name.equals(productName) && p.stock > 0) {
                p.stock--; // Stoktan düş
                this.budget.addRevenue(p.price); // Kasaya para ekle
                this.reputation += 0.1; // Her başarılı satış itibar kazandırır
                System.out.println(p.name + " satıldı! Kalan stok: " + p.stock);
                return;
            }
        }
        System.out.println("Ürün bulunamadı veya stok bitti!");
    }
}

class PhysicalStore extends Store {
    double rentExpense;

    public PhysicalStore(String storeName, double initialMoney, double rentExpense) {
        super(storeName, initialMoney);
        this.rentExpense = rentExpense;
    }

    public double getPriceWithmarkup(Product p){
        return p.price * 1.10; //Abla kira masrafları var, mağazada fiyatlarımız başka internette başka
    }
}


class OnlineStore extends Store{
    int shippingOption; //1: Ücretsiz, 2: Ücretli

    public OnlineStore(String storeName, double initialMoney, int shippingOption) {
        super(storeName, initialMoney);
        this.shippingOption = shippingOption;
    }

    public void processSale(Product p){
        if (this.shippingOption == 1){
            this.reputation += 2.0; //ücretsiz kargo sayesinde popülerlik artacaktır
            this.budget.addRevenue(p.price * 0.8);
            System.out.println("Ücretsiz kargo ile sipariş geçildi! Popülerlik arttı.");
        }
        else if (this.shippingOption == 2){
            this.reputation -= 0.5;
            this.budget.addRevenue(p.price);
            System.out.println("Ücretli kargo ile sipariş geçildi!");
        }
    }
}