package staticExamples;

public class jrDev {
    public String name;
    public int stepPower;

    public jrDev(String name) {
        this.name = name;
        this.stepPower = 1;
    }

    public void work(){
        Project.totalProgress += this.stepPower;
        System.out.println(this.name + " has progressed " + this.stepPower +
                " the project! New progress level is: " + Project.totalProgress);
    }

}
