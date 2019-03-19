package it.tdg.gestionestudenti;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import it.tdg.gestionestudenti.model.Model;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("GestioneStudenti.fxml"));

			BorderPane root = (BorderPane) loader.load();
			Scene scene = new Scene(root);

			GestioneStudentiController controller = loader.getController();

			Model model = new Model();
			controller.setModel(model);

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

			// BorderPane root =
			// (BorderPane)FXMLLoader.load(getClass().getResource("GestioneStudenti.fxml"));
			// Scene scene = new Scene(root);
			// scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			// primaryStage.setScene(scene);
			// primaryStage.show();
			//

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
	/**
	 * In quest classe, bisogna mettere a posto la questione MODEL->CONTROLLER
	 * 
	 * 
	 * 
	 */

}
