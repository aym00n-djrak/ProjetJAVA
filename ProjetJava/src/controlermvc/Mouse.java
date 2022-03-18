/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlermvc;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author remyj
 */
public class Mouse implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
    System.out.println("Appuyé");
        }

    @Override
    public void mouseReleased(MouseEvent e) {
    System.out.println("Relaché");
        }

    @Override
    public void mouseEntered(MouseEvent e) {
    System.out.println("Entré");
        }

    @Override
    public void mouseExited(MouseEvent e) {
    System.out.println("Sortie");
        }
    
}
