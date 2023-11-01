package lesson7.patern.abstract_factory;

import lesson7.patern.abstract_factory.button.Button;
import lesson7.patern.abstract_factory.checkbox.Checkbox;

/**
 * Код использующий фабрику, не волнует с какой конкретной фабрикой он работает,
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application (GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }


}
