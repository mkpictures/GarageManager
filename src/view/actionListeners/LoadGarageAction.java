package view.actionListeners;

import garage.Garage;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;

public class LoadGarageAction implements ActionListener {

    private Garage model;
    private Component parent;
    private JFileChooser jfc = new JFileChooser();

    public LoadGarageAction(Component parent, Garage model) {
        this.model = model;
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
        jfc.showOpenDialog(parent);
        String path = "";
        if (jfc.getSelectedFile() != null) {
            try {
                path = jfc.getSelectedFile().getPath();
                model.loadCars(path);
            } catch (Exception ex) {
                System.out.println("erreur:" + path);
            }
        }
    }
}
