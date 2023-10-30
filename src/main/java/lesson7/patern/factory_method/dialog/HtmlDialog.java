package lesson7.patern.factory_method.dialog;

import lesson7.patern.factory_method.button.Button;
import lesson7.patern.factory_method.button.HtmlButton;
import lesson7.patern.factory_method.dialog.Dialog;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
