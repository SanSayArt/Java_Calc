package views;

import core.ControllerForUsers;

import java.util.Scanner;

public class View {
    private final ControllerForUsers controllerForUsers;

    public View(ControllerForUsers controllerForUsers) {
        this.controllerForUsers = controllerForUsers;
    }

    public void run() {
        while(true) {
            controllerForUsers.prepare();
            String action = prompt();
            if (!action.equalsIgnoreCase("y")) {
                System.exit(0);
            }
        }
    }

    private String prompt() {
        Scanner in = new Scanner(System.in);
        System.out.println("Вы хотите продолжить?... (y/n)");
        return in.nextLine();
    }
}
