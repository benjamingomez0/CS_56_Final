import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("FE_index.fxml"));
        TimeSplitterClient client = new TimeSplitterClient();
        loader.setController(new indexController(client));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) throws Exception {
        launch(args);

    }
}
