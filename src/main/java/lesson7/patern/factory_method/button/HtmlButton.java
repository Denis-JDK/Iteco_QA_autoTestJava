package lesson7.patern.factory_method.button;

import lesson7.patern.factory_method.button.Button;

/**
 * Реализация HTML кнопки.
 */
public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello My New Level Teach Of Patterns Java!'");
    }
}
