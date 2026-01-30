package staticExamples;

public class jrDev {
    public String name;
    public int stepPower;
    public int experience = 0;


    public jrDev(String name) {
        this.name = name;
        this.stepPower = 1;
    }

    public void work(){
        Project.totalProgress += this.stepPower;
        System.out.println(this.name + " has progressed " + this.stepPower +
                " the project. New progress level is: " + Project.totalProgress);

        if (Project.isFinished) {
            this.experience++;
            System.out.println(this.name + " has finished the project and gained experience: " + this.experience);
        }

    }

    public void canBeSr(){
        if (this.experience >= 5){
            System.out.println(this.name + " Can be a Sr and deserves a raise");
        }
    }

}
