package application;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.Window;

	public class ControlFX {

	    @FXML
	    private JFXButton idVentana;

	    /**
    	 * Abre ventana.
    	 *
    	 * @param event the event
    	 */
    	@FXML
	    void abreVentana(ActionEvent event) {
	    	try {
	    		   // Load the fxml file and create a new stage for the popup.
	    		
	    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FreeSolo.fxml"));
	    		   AnchorPane page = (AnchorPane) fxmlLoader.load();
	    		   Stage sendStage = new Stage();
	    		   sendStage.setTitle("Main Menu");
	    		   Scene scene=new Scene(page);
	    		   sendStage.setScene(scene);
	    		   sendStage.show();
	    		   System.out.println("second stage ok");

	    		  } catch (IOException e) {
	    		   e.printStackTrace();
	    		  }
	    }
	}
	    



