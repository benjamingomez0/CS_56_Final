import java.io.Serializable;
import java.util.*;

public class TSPacket implements Serializable {

    private ArrayList<String> tasks;
    private int timeFrame;

    TSPacket() {
        this.tasks = new ArrayList<String>();
        this.tasks.add("No tasks Available!");
        this.timeFrame = 1;

    }

    TSPacket(ArrayList<String> tasks, int timeFrame) {
        this.tasks = tasks;
        this.timeFrame = timeFrame;

    }

    public ArrayList<String> getTasks() {
        return this.tasks;
    }

    public int getTimeFrame() {
        return this.timeFrame;
    }

}
