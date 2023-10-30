package lesson7.patern.factory_method.dialog;

import lesson7.patern.factory_method.button.Button;
import lesson7.patern.factory_method.button.WindowsButton;
import lesson7.patern.factory_method.dialog.Dialog;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
