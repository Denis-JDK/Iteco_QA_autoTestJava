package lesson7.patern.abstract_factory.button;

import lesson7.patern.abstract_factory.button.Button;

/**
 * Все семейства продуктов имеют одни и те же вариации (Mac/Windows).
 *
 * Это вариант кнопки под MacOs.
 */
public class MasOsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
