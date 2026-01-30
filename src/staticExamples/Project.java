package staticExamples;

public class Project {
    public static int totalProgress = 0;
    public static boolean isFinished = false;
    public int goalProgress = 100;

    public static void getCurrentProgress() {
        System.out.println("Current progress is: " + Project.totalProgress);
    }
    public static void checkGoalProgress() {
        if (Project.totalProgress >= totalProgress) {
            isFinished = true;
            System.out.println("!!! Reached Goal !!!");
        }
    }

}
