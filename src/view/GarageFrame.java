package view;

import view.actionListeners.DispVendorsAction;
import garage.Garage;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import view.actionListeners.AddCarAction;
import view.actionListeners.AddVendorAction;
import view.actionListeners.DispShowroomAction;
import view.actionListeners.ExitAction;
import view.actionListeners.LoadGarageAction;

public class GarageFrame extends JFrame {

    private JPanel contentPane = new JPanel();
    private ShowroomPanel showroomPanel;
    private VendorsPanel vendorsPanel;
    private JMenuBar menuBar = new JMenuBar();
    private JMenu garageMenu = new JMenu("Garage");
    private JMenuItem newGarageItem = new JMenuItem("New Garage");
    private Garage model;
    private MousePositionPanel mousePosPan = new MousePositionPanel();

    /**
     * Create the frame.
     */
    public GarageFrame() throws GarageFrameException {
        this(new Garage());
    }

    public GarageFrame(Garage model) throws GarageFrameException {
        setModel(model);
        init();
        repaint();
    }

    public ShowroomPanel getShowroom() {
        return this.showroomPanel;
    }
    
    public VendorsPanel getVendorsPanel(){
        return this.vendorsPanel;
    }

    public final void setModel(Garage model) throws GarageFrameException {
        if (null == model) {
            throw new GarageFrameException("You must give a model to work with");
        }
        this.model = model;
    }

    private void init() {

        contentPane.setLayout(new BorderLayout(0, 0));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 325);

        showroomPanel = new ShowroomPanel(this.model);
        showroomPanel.setVisible(false);
        contentPane.add(showroomPanel, BorderLayout.NORTH);

        setJMenuBar(menuBar);

        menuBar.add(garageMenu);
        garageMenu.add(newGarageItem);

        JMenuItem loadGarageItem = new JMenuItem("Load Garage");
        loadGarageItem.addActionListener(new LoadGarageAction(this, model));
        garageMenu.add(loadGarageItem);

        JMenuItem saveGarageItem = new JMenuItem("Save Garage");
        garageMenu.add(saveGarageItem);

        JSeparator separator = new JSeparator();
        garageMenu.add(separator);

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ExitAction(this, model));
        garageMenu.add(exitItem);

        JMenu manageMenu = new JMenu("Manage");
        menuBar.add(manageMenu);

        JMenuItem addCarItem = new JMenuItem("Add Car");
        addCarItem.addActionListener(new AddCarAction(this, model));
        manageMenu.add(addCarItem);

        JMenuItem addVendorItem = new JMenuItem("Add Vendor");
        addVendorItem.addActionListener(new AddVendorAction(model, this));
        manageMenu.add(addVendorItem);

        JMenuItem dispShowroomItem = new JMenuItem("Display Showroom");
        dispShowroomItem.addActionListener(new DispShowroomAction(this, this.contentPane, this.showroomPanel));
        manageMenu.add(dispShowroomItem);

        vendorsPanel = new VendorsPanel(model);
        vendorsPanel.setVisible(false);
        contentPane.add(vendorsPanel, BorderLayout.NORTH);
        JMenuItem dispVendorsItem = new JMenuItem("Display Vendors");
        dispVendorsItem.addActionListener(new DispVendorsAction(this, this.contentPane, this.vendorsPanel));
        manageMenu.add(dispVendorsItem);

        contentPane.setBorder(new TitledBorder(""));
        contentPane.add(mousePosPan, BorderLayout.SOUTH);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPane);
        
        this.addMouseMotionListener(mousePosPan);

        setVisible(true);
        //pack();
    }
}
