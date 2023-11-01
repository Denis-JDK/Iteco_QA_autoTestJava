package lesson7.patern.abstract_factory;

import lesson7.patern.abstract_factory.button.Button;
import lesson7.patern.abstract_factory.checkbox.Checkbox;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
