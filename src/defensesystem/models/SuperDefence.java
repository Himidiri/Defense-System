package defensesystem.models;

import defensesystem.controller.Observer;
import defensesystem.view.MainController;
import javax.swing.JFrame;

/**
 *
 * @author Himidiri Himakanika
 */
public abstract class SuperDefence extends JFrame implements Observer {

    protected MainController mainController;
    private final String name;

    public SuperDefence(MainController mainController, String name) {
        this.mainController = mainController;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
