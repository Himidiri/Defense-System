/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package defensesystem.utils;

/**
 *
 * @author Himidiri Himakanika
 */
public enum Strength {
    LOW(20), MEDIUM(40), HIGH(60), STRONG(80), CLOSED(0);

    public int value;

    Strength(int value) {
        this.value = value;
    }
}
