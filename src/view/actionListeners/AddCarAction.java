/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.actionListeners;

import garage.Car;
import garage.Garage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.AddCarDialog;
import view.GarageFrame;
import view.ShowroomPanel;


public class AddCarAction implements ActionListener{
    
    private Garage model;
    private GarageFrame parentFrame;
    private ShowroomPanel showroomPanel;
    private AddCarDialog addCarDialog;
    
    public AddCarAction(){
        
    }
    
    public AddCarAction(GarageFrame parent, ShowroomPanel showPanel, Garage model){
        this(parent, model);
        this.showroomPanel = showPanel;
    }
    
    public AddCarAction(GarageFrame parent,  Garage model){
        this.model = model;
        this.parentFrame = parent;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Car car = null;
        addCarDialog = new AddCarDialog(model, parentFrame, true);
        addCarDialog.addListener(showroomPanel == null ? parentFrame.getShowroom() : showroomPanel);
        addCarDialog.setVisible(true);
        //car = new Car(addCarDialog.getMark(), null, null, kilometers, year, price);
        //model.addCar(car);
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
