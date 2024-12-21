/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defensesystem.controller;

/**
 *
 * @author Himidiri Himakanika
 */
public interface Observer {

    public void updateAreaClear(boolean isClear);

    public void btnEnable(int Value);

    public void receiveMessage(String message, boolean isPrivate, String senderOrTarget);
}
