import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;
import javafx.collections.FXCollections;

public class indexController {

    // Left Anchor Pane
    @FXML
    private TextField taskInput;
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

    // @FXML
    // private void onButtonClick() {
    // String text = inputField.getText();
    // wlcmText.setText(text);
    // inputField.setText("");
    // }

}
