package javafx.jxml.aplicacion;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;


public class Principal extends Application {
	@Override
	public void start(Stage escenarioPrincipal) {
		try {
			VBox raiz = FXMLLoader.load(getClass().getResource("Ejemplo.fxml"));
			Scene escena = new Scene(raiz);
			escenarioPrincipal.setTitle("Ejemplo FXML");
			escenarioPrincipal.setScene(escena);
			escenarioPrincipal.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
