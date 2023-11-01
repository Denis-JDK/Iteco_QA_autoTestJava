package lesson7.patern.abstract_factory;

import lesson7.patern.abstract_factory.button.Button;
import lesson7.patern.abstract_factory.button.WindowsButton;
import lesson7.patern.abstract_factory.checkbox.Checkbox;
import lesson7.patern.abstract_factory.checkbox.WindowsCheckbox;

/**
 * Каждая конкретная фабрика знает и создает только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
