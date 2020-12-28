import javafx.stage.Stage;
import view.home.HomeView;
import view.home.HomeViewModel;

import java.io.IOException;

import de.saxsys.mvvmfx.FluentViewLoader;
import de.saxsys.mvvmfx.ViewTuple;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class App extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		stage.setTitle("Tagal S.A. de C.V.");
		ViewTuple<HomeView, HomeViewModel> viewTuple = FluentViewLoader.fxmlView(HomeView.class).load();
		Parent root = viewTuple.getView();
		stage.setScene(new Scene(root));
		stage.show();
	}
}
