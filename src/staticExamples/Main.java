package staticExamples;

public class Main {
    public static void main(String[] args) {
        srDev lead = new srDev("Akın Kaldıroğlu");

        // Creating and adding 5 Juniors
        lead.addJrToTeam(new jrDev("Emre"));
        lead.addJrToTeam(new jrDev("Erdem"));
        lead.addJrToTeam(new jrDev("Nuriye"));
        lead.addJrToTeam(new jrDev("Yusuf"));
        lead.addJrToTeam(new jrDev("Meral"));

        lead.workWithTeam();
        Project.getCurrentProgress();
    }
}
