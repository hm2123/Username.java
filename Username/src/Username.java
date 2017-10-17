import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Username extends Application{
    @Override
    public void start (Stage primaryStage){
        TextInputDialog textinputdialog = new TextInputDialog();
        textinputdialog.setTitle("Verification!!");
        textinputdialog.setContentText("Enter your username and password");
        Optional <String> input = textinputdialog.showAndWait();
        String option = input.get();

        if(option.equals("Hamid,Hi")){
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("Welcome Hamid!");
            alert.showAndWait();

        }else {
            Alert hi = new Alert(AlertType.INFORMATION);
            hi.setContentText("Wrong Username and Password");
            hi.showAndWait();

        }

    }

}


