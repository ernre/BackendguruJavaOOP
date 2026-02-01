package SaleSimulating;

public class Product {
    String name;
    double price;
    int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
    }
}

class Electronic extends Product {
    int warrantyMonths;
    public Electronic(String name, double price, int stock) {
        super(name, price, stock);
        this.warrantyMonths = warrantyMonths;
    }
}

class Fashion extends Product {
    String size; // S: Small, M: Medium, L: Large, XL: Extra Large
    char gender; // F: Female, M: Male, U: Unisex

    public Fashion(String name, double price, int stock, String size, char gender) {
        super(name, price, stock);
        this.gender = gender;
        this.size = size;
    }
}

class Sports extends Product {
    boolean isOutdoor; // A sport product can be either outdoor or indoor

    public Sports(String name, double price, int stock, boolean isOutdoor) {
        super(name, price, stock);
        this.isOutdoor = isOutdoor;
    }
}