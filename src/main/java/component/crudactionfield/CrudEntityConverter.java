package component.crudactionfield;

import javafx.util.StringConverter;

public class CrudEntityConverter extends StringConverter<CrudEntity> {

	@Override
	public CrudEntity fromString(String value) {
		// Not an editable field
		return null;
	}

	@Override
	public String toString(CrudEntity value) {
		String entityString = null;
		// Field with no default value calls null the first time
		if (value != null)
			switch (value) {
				case PRODUCT_TYPE:
					entityString = "TIPO DE PRODUCTO";
					break;
				case USER:
					entityString = "USUARIO";
					break;
				case CONSUMABLE:
					entityString = "CONSUMIBLE";
					break;
				case EQUIPMENT:
					entityString = "EQUIPO";
					break;
			}
		return entityString;
	}

}
