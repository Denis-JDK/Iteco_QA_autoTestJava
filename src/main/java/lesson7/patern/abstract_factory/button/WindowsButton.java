package lesson7.patern.abstract_factory.button;

import lesson7.patern.abstract_factory.button.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
