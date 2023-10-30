package lesson7.patern.abstract_factory.checkbox;

import lesson7.patern.abstract_factory.checkbox.Checkbox;

public class MasOSCCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
