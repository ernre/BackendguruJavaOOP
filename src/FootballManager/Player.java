package FootballManager;

public class Player {
    String name;
    int age;
    double marketValue;
    int stamina;

    public Player(String name, int age, double marketValue, int stamina) {
        this.name = name;
        this.age = age;
        this.marketValue = marketValue;
        this.stamina = stamina;
    }
}

class goalKeeper extends Player {
    int catchingSkills;
    public goalKeeper(String name, int age, double marketValue, int stamina, int catchingSkills) {
        super(name, age, marketValue, stamina);
        this.catchingSkills = catchingSkills;
    }

}
