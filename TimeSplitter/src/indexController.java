import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import java.util.*;

public class indexController {

    // Info to be sent to back-end
    private ArrayList<String> tasks = new ArrayList<String>();
    private int timeFrame;
    private timeFrameTasks packet;
    // Left Anchor Pane
    @FXML
    private TextField taskInput;
    @FXML
    private ListView taskList;

    @FXML
    private void addTask() {
        String text = taskInput.getText();
        tasks.add(text);
        text = "Task " + tasks.size() + ": " + text;
        taskList.getItems().add(new Label(text));
        taskInput.setText("");
    }

    /* time frame Choice box variable and handling */
    @FXML
    private ChoiceBox timeBox;

    @FXML
    private void onTimeBoxClick() {
        timeBox.setItems(FXCollections.observableArrayList("1hr", "2hr", "3hr", "4hr", "5hr", "6hr", "7hr", "8hr",
                "9hr", "10hr", "11hr", "12hr"));
    }

    @FXML
    private void handleTaskSubmit() {

        String time = (String) timeBox.getValue();
        timeFrame = 1;
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

        this.packet = new timeFrameTasks(this.tasks, this.timeFrame);

    }

    // Right Anchor Pane
    @FXML
    private Label currTask;

}
