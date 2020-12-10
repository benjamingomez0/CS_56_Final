import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import java.util.ArrayList;

public class indexController {

    // Info to be sent to back-end
    private ArrayList<String> tasks = new ArrayList<String>();

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

    // Right Anchor Pane
    @FXML
    private Label currTask;



}
