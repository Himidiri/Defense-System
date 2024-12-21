package defensesystem;

import defensesystem.controller.Observable;
import defensesystem.view.Helicopter;
import defensesystem.view.MainController;
import defensesystem.view.Submarine;
import defensesystem.view.Tank;

/**
 *
 * @author Himidiri Himakanika
 */
public class Starter {

    public static void main(String[] args) {
        Observable observable = new Observable();
        MainController mainController = new MainController(observable);
        observable.addObserver(new Helicopter(mainController));
        observable.addObserver(new Submarine(mainController));
        observable.addObserver(new Tank(mainController));
    }
}
