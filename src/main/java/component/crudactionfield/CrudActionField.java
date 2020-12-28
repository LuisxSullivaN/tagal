package component.crudactionfield;

import java.io.IOException;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class CrudActionField extends VBox {
	@FXML private Label lblLabel;
	@FXML private ComboBox<CrudEntity> cbxValue;

	private StringProperty label = new SimpleStringProperty();
	private ObjectProperty<CrudEntity> value = new SimpleObjectProperty<>();
	private ObjectProperty<EventHandler<ActionEvent>> onAction = new SimpleObjectProperty<>();

	public CrudActionField() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource(
					"/component/CrudActionField.fxml"));
		loader.setRoot(this);
		loader.setController(this);
		try {
			loader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}
	}

	@FXML
	public void initialize() {
		lblLabel.textProperty().bindBidirectional(label);
		cbxValue.valueProperty().bindBidirectional(value);
		cbxValue.onActionProperty().bindBidirectional(onAction);
		cbxValue.getItems().setAll(CrudEntity.values());
		cbxValue.setConverter(new CrudEntityConverter());
	}

	public StringProperty labelProperty() {
		return label;
	}

	public String getLabel() {
		return label.get();
	}

	public void setLabel(String label) {
		this.label.set(label);;
	}

	public ObjectProperty<CrudEntity> valueProperty() {
		return value;
	}

	public CrudEntity getValue() {
		return value.get();
	}

	public void setValue(CrudEntity value) {
		this.value.set(value);
	}

	public ObjectProperty<EventHandler<ActionEvent>> onActionProperty() {
		return onAction;
	}

	public EventHandler<ActionEvent> getOnAction() {
		return onAction.get();
	}

	public void setOnAction(EventHandler<ActionEvent> onAction) {
		this.onAction.set(onAction);
	}
}
