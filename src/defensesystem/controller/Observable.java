package defensesystem.controller;

import java.util.ArrayList;

/**
 *
 * @author Himidiri Himakanika
 */
public class Observable {

    private boolean status;
    private int value;
    private final ArrayList<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer ob) {
        observerList.add(ob);
    }

    public void setArea(boolean status) {
        if (this.status != status) {
            this.status = status;
            notifyArea();
        }
    }

    public void notifyArea() {
        for (Observer ob : observerList) {
            ob.updateAreaClear(status);
        }
    }

    public void SetBtnEnable(int Value) {
        if (this.value != Value) {
            this.value = Value;
            notifyBtnEnable();
        }
    }

    public void notifyBtnEnable() {
        for (Observer ob : observerList) {
            ob.btnEnable(value);
        }
    }

    public void broadcastMessage(String message, boolean isPrivate, String targetDefense) {
        for (Observer observer : observerList) {
            if (!isPrivate || targetDefense.equals(observer.getClass().getSimpleName())) {
                observer.receiveMessage(message, isPrivate, targetDefense.equals("All") ? "MainController" : targetDefense);
            }
        }
    }
}
