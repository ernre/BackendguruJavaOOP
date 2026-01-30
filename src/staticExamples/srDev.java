package staticExamples;

import staticExamples.jrDev;
import java.util.ArrayList;
import java.util.List;


public class srDev {
    String name;
    int stepPower;
    int experience;

    List<jrDev> team;

    public srDev(String name) {
        this.name = name;
        this.stepPower = 3;
        this.team = new ArrayList<>();
    }

    public void addJrToTeam(jrDev jr){
        if (this.team.size() <= 5) {
            this.team.add(jr);
            System.out.println(jr.name + " Now works with sr " + srDev.this.name);
        }
        else {
            System.out.println(srDev.this.name + "'s team has no place for another jr.");
        }
    }

    public void workWithTeam(){
        System.out.println(srDev.this.name + " Is working with " + this.team.size() + " jr teams.");
        for (jrDev jr: this.team){
            if(!Project.isFinished){
                jr.work();
            }
        }
        if (!Project.isFinished){
            Project.totalProgress += this.stepPower; //Sr works
            System.out.println("while jr team is dealing small things, sr finished the heavy lift (3)");
            System.out.println("Current progress is: " + Project.totalProgress);
        }

    }
}
