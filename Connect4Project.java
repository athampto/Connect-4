package connect4project;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Connect4Project extends Application{

   
   
    public static void main(String[] args) {
        launch(args);
       
    }

   
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Connect4FXML.fxml"));
        stage.setTitle("Connect 4 Project");
        stage.setScene(new Scene(root));
        stage.show();
    }
    
}
