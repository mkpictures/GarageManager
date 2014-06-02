/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import view.GarageFrame;

public class DispShowroomAction implements ActionListener{

    private JPanel parentPanel;
    private JPanel showroomPanel;
    private GarageFrame parentFrame;
    
    public DispShowroomAction(JPanel parentPanel, JPanel showroomPanel){
        this.showroomPanel = showroomPanel;
        this.parentPanel = parentPanel;
    }
    
    public DispShowroomAction(GarageFrame parentFrame, JPanel parentPanel, JPanel showroomPanel){
        this(parentPanel, showroomPanel);
        this.parentFrame = parentFrame;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(parentFrame.getVendorsPanel().isVisible())
            parentFrame.getVendorsPanel().setVisible(false);
        if(!showroomPanel.isVisible()) {
            //parentPanel.remove(showroomPanel);
            showroomPanel.setVisible(true);
        }
        parentPanel.add(showroomPanel);
    }
    
}
