import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import java.io.IOException;
import java.util.*;

public class indexController {

    // Info to be sent to back-end
    private ArrayList<String> tasks = new ArrayList<String>();
    private TSPacket packet;
    // client
    private TimeSplitterClient client;
    // value returned from server
    private Integer secPerTask;
    // ussed to populate current task
    private int taskNum;

    // constructor
    public indexController(TimeSplitterClient client) {
        this.client = client;
    }

    public void setTaskNum(int taskNum) {
        this.taskNum = taskNum;
        currTask.setText(tasks.get(this.taskNum));
        timePer.setText("Time per task: " + (secPerTask / 60) + "min");
    }

    @FXML
    private Label currTask;
    @FXML
    private Label timePer;
    @FXML
    private TextField taskInput;
    @FXML
    private ListView taskList;

    /* time frame Choice box variable and handling */
    @FXML
    private ChoiceBox<String> timeBox;

    @FXML
    private void addTask() {
        String text = taskInput.getText();
        tasks.add(text);
        text = "Task " + tasks.size() + ": " + text;
        taskList.getItems().add(new Label(text));
        taskInput.setText("");
    }

    @FXML
    private void onTimeBoxClick() {
        timeBox.setItems(FXCollections.observableArrayList("1hr", "2hr", "3hr", "4hr", "5hr", "6hr", "7hr", "8hr",
                "9hr", "10hr", "11hr", "12hr"));
    }

    @FXML
    private void handleTaskSubmit() throws ClassNotFoundException {

        String time = (String) timeBox.getValue();
        int timeFrame;
        switch (time) {
            case "1hr":
                timeFrame = 1;
                break;
            case "2hr":
                timeFrame = 2;
                break;
            case "3hr":
                timeFrame = 3;
                break;
            case "4hr":
                timeFrame = 4;
                break;
            case "5hr":
                timeFrame = 5;
                break;
            case "6hr":
                timeFrame = 6;
                break;
            case "7hr":
                timeFrame = 7;
                break;
            case "8hr":
                timeFrame = 8;
                break;
            case "9hr":
                timeFrame = 9;
                break;
            case "10hr":
                timeFrame = 10;
                break;
            case "11hr":
                timeFrame = 11;
                break;
            case "12hr":
                timeFrame = 12;
                break;

            default:
                timeFrame = 1;
        }

        this.packet = new TSPacket(this.tasks, timeFrame);
        try {
            client.startClient(this.packet);
            this.secPerTask = Integer.parseInt(client.getSecPerTask());
            setTaskNum(0);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @FXML
    private void handleSkip() {
        if (this.taskNum + 1 > this.tasks.size() - 1) {
            currTask.setText("Completed!");
            timePer.setText("");
        } else {
            this.setTaskNum(this.taskNum + 1);
        }

    }
}
