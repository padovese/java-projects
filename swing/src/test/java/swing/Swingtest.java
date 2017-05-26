package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Swingtest extends JFrame implements ActionListener
{
    JTextField txtdata;
    JButton calbtn = new JButton("Coletar");
    JLabel texto = new JLabel("Digite seu parâmetro de coleta:");

    public Swingtest()
    {
        JPanel myPanel = new JPanel();
        add(myPanel);
        myPanel.setLayout(new GridLayout(3, 2));
        myPanel.add(texto);
        txtdata = new JTextField();
        myPanel.add(txtdata);
        myPanel.add(calbtn);
        calbtn.addActionListener(this);

        
        setLocationRelativeTo(null);
        setSize(300, 120);
        setTitle("Coletor de Tweets");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == calbtn) {
            String data = txtdata.getText(); //perform your operation
            System.out.println(data);
        }
    }

    public static void main(String args[])
    {
        Swingtest g = new Swingtest();
        //g.setLocation(10, 10);
        //g.setSize(300, 300);
        g.setVisible(true);
    }
}