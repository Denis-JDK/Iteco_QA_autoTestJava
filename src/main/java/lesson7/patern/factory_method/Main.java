package lesson7.patern.factory_method;

import lesson7.patern.factory_method.dialog.HtmlDialog;
import lesson7.patern.factory_method.dialog.WindowsDialog;

public class Main {
    public static void main(String[] args) {

        //логика создания кнопок инкапсулирована в отдельном классе и не видна в майн
        //для расширения кнопок просто необходимо добавить класс NewDialog implements Dialog и класс самой кнопки, в майн ничего не поменяеться
        //инкапсуляция создания кнопок защищает от ошибок в логике создания в майн без всяких if else итп.
        HtmlDialog htmlDialog = new HtmlDialog();
        htmlDialog.renderWindow();//createButton()

        WindowsDialog windowsDialog = new WindowsDialog();
        windowsDialog.renderWindow(); //createButton() не вызываются методы кнопок, но создается обьект


        }
}
