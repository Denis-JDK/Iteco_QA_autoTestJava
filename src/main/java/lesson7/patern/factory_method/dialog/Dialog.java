package lesson7.patern.factory_method.dialog;

import lesson7.patern.factory_method.button.Button;

/**
 * Базовый класс фабрики. Заметьте, что фабрика - это всего лишь
 * дополнительная роль для класса. Он уже имеет какую-то бизнес-логику, в
 * которой требуется создание разнообразных продуктов.
 */
public abstract class Dialog {

    public void renderWindow(){
        //........остальной код диалога.....

        Button okButton = createButton();
        okButton.render();
    }

    /**
     *Подклассы будут переопределять этот метод, чтобы создать конкретные
     * обьекты продуктов, разные для каждой фабрики.
     */
    public abstract Button createButton();
}
