package view;

import garage.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import view.actionListeners.AddCarAction;

public class ShowroomPanel extends JPanel implements PropertyChangeListener{

    Garage model;
    
    private JPanel showPanel;
    private JLabel label;
    private DefaultListModel<Car> carsList = new DefaultListModel<>();
    private JList list;
    
    private JButton viewButton;
    private JButton addButton;
    private JPanel buttonPanel;
    
    public ShowroomPanel() {
        
    }

    public ShowroomPanel(Garage model) {
        

        this.model = model;
        
        this.showPanel = new JPanel();
        this.showPanel.setBorder(new TitledBorder("Showroom"));
        
        loadCarList();

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                viewButton.setEnabled(true);
            }
        });
                     
        JScrollPane listScrollPane = new JScrollPane(list);
        
        this.showPanel.add(listScrollPane);
        
        this.setLayout(new BorderLayout());
        
        this.add(showPanel, BorderLayout.NORTH);
        
        init();
        //throw new UnsupportedOperationException("Not yet implemented");
    }
    
    private void loadCarList(){
        //carsList = new DefaultListModel<>();
        carsList.clear();
        for(Car car : model.getCars()){
            carsList.addElement(car);
        }
        list = new JList(carsList);
    }
    
    private void init(){
        
        viewButton = new JButton("View/Edit");
        viewButton.setEnabled(false);
        viewButton.addActionListener(new ViewCarAction()); 
        
        addButton = new JButton("Add car");
        addButton.addActionListener(new AddCarAction((GarageFrame) this.getParent(), this, model ));
        
        buttonPanel = new JPanel();
        buttonPanel.add(viewButton);
        //buttonPanel.add(addButton);
        
        this.add(buttonPanel, BorderLayout.CENTER);
        
    }

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
        if(pce.getPropertyName().equals("CAR_ADDED") ){
            loadCarList();
            System.out.println("Car added");
            repaint();
        }
    }

    private class ViewCarAction implements ActionListener {

        
        public ViewCarAction() {
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            ViewCarDialog viewCarDialog = new ViewCarDialog(model, (Car)list.getSelectedValue());
        }
    }
    
}
