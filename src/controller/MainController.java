package controller;

import form.MainForm;

public class MainController {
    public static void main(String[] args) {
        MainForm mainForm = new MainForm();
        mainForm.setVisible(true);
        EditController edit = new EditController();
        edit.controller(mainForm);
        FileController file = new FileController();
        file.controller(mainForm);
    }
}
