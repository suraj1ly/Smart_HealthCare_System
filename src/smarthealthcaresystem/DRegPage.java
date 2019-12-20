
package smarthealthcaresystem;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DRegPage {
    Parent drpage;
    Scene dregpageScene;
    
    public void startReg(Stage window) throws IOException {
        drpage = FXMLLoader.load(getClass().getResource("DRegPageView.fxml"));
        dregpageScene = new Scene(drpage, window.getWidth(), window.getHeight());
        window.setScene(dregpageScene);
        window.show();
    }
}
