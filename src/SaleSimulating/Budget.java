package SaleSimulating;

public class Budget {
    // Henüz private konusunu işlemedik ancak kendim araştırıp çat pat bi şeyler öğrendim.
    private double balance;                                //kasadaki para
    private double totalRevenue;                           //ciro
    private double totalExpenses;                          //harcama
    private double adExpenses;                             //reklam ücreti

    public Budget(double initialMoney) {
        //initialMoney dışardan gelen parayı temsil ediyor
        this.balance = initialMoney;
        this.totalRevenue = 0;
        this.totalExpenses = 0;
        this.adExpenses = 0;
    }

    //Kasamıza para girşi, ürün satışı
    public void addRevenue(double amount) {
        this.balance += amount;
        this.totalRevenue += amount;
        System.out.println("Kasa: +" + amount + " TL. Güncel Bakiye: " + this.balance);
    }

    //Kasadan para çıkışı
    public boolean spendMoney(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            this.totalExpenses += amount;
            return true;
        }
        else  {
            System.out.println("!!!BAKİYE YETERSİZ: " + amount + "TL'lik ödemeniz gerçekleşmedi.");
            return false;
        }
    }


}
