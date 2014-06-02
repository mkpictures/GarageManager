/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

/**
 *
 * @author Arakhnor
 */
public class MousePositionPanel extends JPanel implements MouseInputListener{
    
    private int xPos;
    private int yPos;
    private JLabel xPosLabel;
    private JLabel yPosLabel;
    
    public MousePositionPanel(){
        xPos = 0;
        yPos = 0;
        init();
    }
    
    private void init(){
        
        xPosLabel = new JLabel("x: " + xPos);
        yPosLabel = new JLabel("y: " + yPos);
        
        this.add(xPosLabel);
        this.add(yPosLabel);
        
        setSize(new Dimension(250, 20));
        
    }

    private void update(){
        xPosLabel.setText("x: " + xPos);
        yPosLabel.setText("y: " + yPos);
        repaint();
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
       
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        xPos = me.getX();
        yPos = me.getY();
        update();
    }


}
