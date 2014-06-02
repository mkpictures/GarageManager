/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.actionListeners;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Arakhnor
 */
public class CancelAction implements ActionListener{

    private Window window;
    
    public CancelAction(Window window){
        this.window = window;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        window.dispose();
    }
    
}
