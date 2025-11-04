/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum9;

/**
 *
 * @author acer
 */
public class MainHewan {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        kucing.suara();
        kucing.info();
        
        anjing.suara();
        anjing.info();
    }
}
