package kenazCode;
import javax.swing.*;

public class ListGUI extends JComboBox {
    private JComboBox listButton;

    public ListGUI(){
        JComboBox listButton = new JComboBox();
        listButton.setBounds(400,50,100,20);

        add(listButton);

    }

}
