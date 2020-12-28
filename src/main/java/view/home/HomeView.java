package view.home;

import component.crudactionfield.CrudActionField;
import de.saxsys.mvvmfx.FxmlView;
import javafx.fxml.FXML;

public class HomeView implements FxmlView<HomeViewModel> {

	@FXML private CrudActionField creationField;
    @FXML private CrudActionField deletionField;
    @FXML private CrudActionField updateField;
    @FXML private CrudActionField readingField;
    @FXML private CrudActionField reportsField;

	@FXML
	private void initialize() {
		creationField.setOnAction(e -> System.out.println("Pantalla altas"));
		deletionField.setOnAction(e -> System.out.println("Pantalla bajas"));
		updateField.setOnAction(e -> System.out.println("Pantalla modificaciones"));
		readingField.setOnAction(e -> System.out.println("Pantalla consultas"));
		reportsField.setOnAction(e -> System.out.println("Pantalla reportes"));
	}
}
