package lesson7.patern.abstract_factory;

import lesson7.patern.abstract_factory.button.Button;
import lesson7.patern.abstract_factory.button.MasOsButton;
import lesson7.patern.abstract_factory.checkbox.Checkbox;
import lesson7.patern.abstract_factory.checkbox.MasOSCCheckbox;

/**
 * Каждая конкретная фабрика знает и создает только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MasOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MasOSCCheckbox();
    }
}
