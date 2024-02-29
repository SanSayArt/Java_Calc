package views;

import core.ControllerForUsers;

import java.util.Scanner;

public class View {
    private final ControllerForUsers controllerForUsers;

    public View(ControllerForUsers controllerForUsers) {
        this.controllerForUsers = controllerForUsers;
    }

    public void run() {
        controllerForUsers.prepare();
    }

}
