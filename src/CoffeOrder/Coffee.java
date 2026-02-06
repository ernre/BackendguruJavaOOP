package CoffeOrder;

public class Coffee {
    public String type;
    public String size;
    public boolean isHot;
    public boolean isDecaf;
    public String cream;
    public String syrup;
    public Cup cup;

    // Kurucu 1
    public Coffee(String type, String size, Cup cup) {
        // "None" yerine Türkçe "Yok" standardına geçildi
        this(type, size, true, false, "Yok", "Yok", cup);
    }

    // Kurucu 2
    public Coffee(String type, String size, boolean isHot, boolean isDecaf, Cup cup) {
        this(type, size, isHot, isDecaf, "Yok", "Yok", cup);
    }

    // Kurucu 3 (Ana Kurucu)
    public Coffee(String type, String size, boolean isHot, boolean isDecaf,
                  String cream, String syrup, Cup cup) {
        this.type = type;
        this.size = size;
        this.isHot = isHot;
        this.isDecaf = isDecaf;
        this.cream = cream;
        this.syrup = syrup;
        this.cup = cup;
    }

    public void displayOrder() {
        System.out.println("********** SİPARİŞ FİŞİ **********");
        System.out.println("Kahve: " + (isDecaf ? "Kafeinsiz " : "") + type);
        System.out.println("Boyut: " + size);
        System.out.println("Sıcaklık: " + (isHot ? "Sıcak" : "Soğuk"));
        System.out.println("Ekstralar: Krema: " + cream + ", Şurup: " + syrup);
        System.out.println("Sunum: " + cup.getCupInfo());
        System.out.println("**********************************\n" );
    }
}