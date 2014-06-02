package view;

import garage.Vendor;
import java.awt.Dimension;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class VendorInformationsPanel extends JPanel {

    private DefaultListModel<Vendor> vendors = new DefaultListModel<>();
    private JList list;
    private JTextField nameTF;
    private JTextField firstnameTF;
    private JTextField mailTF;
    private JTextField carsSoldTF;

    /**
     * Create the panel.
     */
    public VendorInformationsPanel() {

        setBorder(new TitledBorder(null, "Vendor Informations", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        setLayout(null);

        JLabel lblName = new JLabel("Name: ");
        lblName.setBounds(20, 40, 46, 14);
        add(lblName);

        JLabel lblFirstname = new JLabel("Firstname: ");
        lblFirstname.setBounds(20, 75, 65, 14);
        add(lblFirstname);

        JLabel lblMail = new JLabel("Mail: ");
        lblMail.setBounds(20, 114, 46, 14);
        add(lblMail);

        JLabel lblCarsSold = new JLabel("Cars sold: ");
        lblCarsSold.setBounds(20, 153, 65, 14);
        add(lblCarsSold);

        nameTF = new JTextField();
        nameTF.setBounds(95, 37, 266, 20);
        add(nameTF);
        nameTF.setColumns(10);

        firstnameTF = new JTextField();
        firstnameTF.setBounds(95, 72, 266, 20);
        add(firstnameTF);
        firstnameTF.setColumns(10);

        mailTF = new JTextField();
        mailTF.setBounds(95, 111, 266, 20);
        add(mailTF);
        mailTF.setColumns(10);

        carsSoldTF = new JTextField();
        carsSoldTF.setBounds(95, 150, 266, 20);
        add(carsSoldTF);
        carsSoldTF.setColumns(10);

        this.setPreferredSize(new Dimension(400, 250));
        this.setSize(getPreferredSize());

    }

    public String getName(){
        return this.nameTF.getText();
    }
    
    public void setName(String name){
        this.nameTF.setText(name); 
    }
    
    public String getFirstname(){
        return this.firstnameTF.getText();
    }
    
    public void setFirstname(String firstname){
        this.firstnameTF.setText(firstname);
    }
    
    public String getMail(){
        return this.mailTF.getText();
    }
    
    public void setMail(String mail){
        this.mailTF.setText(mail);
    }
    
    public int getCarsSold(){
        return Integer.parseInt(this.carsSoldTF.getText());
    }

}
