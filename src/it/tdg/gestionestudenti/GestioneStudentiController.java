/**
 * Sample Skeleton for 'GestioneStudenti.fxml' Controller Class
 */

package it.tdg.gestionestudenti;

import java.net.URL;
import java.util.ResourceBundle;

import it.tdg.gestionestudenti.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GestioneStudentiController {
	
	private Model model;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtTesto"
    private TextField txtTesto; // Value injected by FXMLLoader

    @FXML // fx:id="txtLog"
    private TextArea txtLog; // Value injected by FXMLLoader

    @FXML
    void handleCerca(ActionEvent event) {
    	
    	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtTesto != null : "fx:id=\"txtTesto\" was not injected: check your FXML file 'GestioneStudenti.fxml'.";
        assert txtLog != null : "fx:id=\"txtLog\" was not injected: check your FXML file 'GestioneStudenti.fxml'.";

    }

	public void setModel(Model model) {
		this.model = model;
	}
}
