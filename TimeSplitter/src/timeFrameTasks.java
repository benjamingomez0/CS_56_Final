import java.util.ArrayList;

public class timeFrameTasks {
    private ArrayList<String> tasks;
    private int timeFrame;
    private int timeSplit;

    timeFrameTasks() {
        this.tasks = new ArrayList<String>();
        this.tasks.add("No tasks Available!");
        this.timeFrame = 1;
        // time split refers to sec per task;
        this.timeSplit = 60;
    }

    timeFrameTasks(ArrayList<String> tasks, int timeFrame) {
        this.tasks = tasks;
        this.timeFrame = timeFrame;
        this.timeSplit = ((timeFrame * 60) * 60) / tasks.size();
    }

    public ArrayList<String> getTasks() {
        return this.tasks;
    }

    public int getTimeFrame() {
        return this.timeFrame;
    }

    public int getTimeSplit() {
        return this.timeSplit;
    }

}
