package main;

import controller.Controller;
import view.View;
import model.Notebook;
/**
 * Created by wookie on 4/29/16.
 */
public class Main {
    public static void main(String[] args) {
        View view = new View();
        Notebook notebook = new Notebook();

        Controller controller = new Controller(notebook, view);
        controller.processUser();
    }
}
