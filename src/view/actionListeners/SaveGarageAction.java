package view.actionListeners;

import garage.Garage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JPanel;


public class SaveGarageAction implements ActionListener{

    private Garage model;
    private JPanel parentPanel;
    private JFileChooser jfc = new JFileChooser();
    
    public SaveGarageAction(JPanel parent, Garage model){
        this.model = model;
        this.parentPanel = parent;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not implemented yet.");
        this.model.save();
    }
    
}
