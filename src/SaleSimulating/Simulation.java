package SaleSimulating;

public class Simulation {
    public static void main(String[] args) {

        OnlineStore myStore = new OnlineStore("Backendguru Shop", 1000, 1);

        myStore.bank.giveLoan(myStore.budget, 5000);

        Electronic oopCourse = new Electronic ("Introduction To Object Oriented Programming", 900, 50);
        Fashion purpleShirt = new Fashion ("Backendguru morunda backend developer hissettirecek tişört", 250, 20, "L", 'U');

        myStore.adProductToWarehouse("Electronic", oopCourse);
        myStore.adProductToWarehouse("Fashion", purpleShirt);

        System.out.println("--- Bu Bir Satış Denemesidir ---");
        myStore.sellProduct("Electronic", "Introduction To Object Oriented Programming");

        myStore.processSale(purpleShirt);

        System.out.println("\n--- Gün Sonu Raporu ---");
        System.out.println("Mağaza İtibarı: " + myStore.reputation);
        System.out.println("Bankaya Toplam Borç: " + myStore.bank.getTotalDebt());


    }
}
