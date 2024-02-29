import core.Calculator;
import core.ControllerForUsers;
import core.Logger;
import views.View;

public class Main {
    public static void main(String[] args) {
        View view = new View(new ControllerForUsers(new Logger(new Calculator())));
        view.run();
    }
}