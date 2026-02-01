package SaleSimulating;

public class Bank {
    private double totalDebt;
    private final double interestRate = 0.15; // Java 25: Sabit faiz oranı %15

    public Bank() {
        this.totalDebt = 0;
    }

    // Mağazaya kredi verir ve parayı mağazanın bütçesine aktarır.
    public void giveLoan(Budget budget, double amount) {
        double debtToPay = amount + (amount * this.interestRate);
        this.totalDebt += debtToPay;
        budget.addRevenue(amount); // Kredi çekmek kasaya nakit girişi sağlar
        System.out.println("Banka: " + amount + " TL kredi verildi. Gelecekte ödenecek: " + debtToPay);
    }

    public double getTotalDebt() {
        return this.totalDebt;
    }
}
