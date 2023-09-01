package mathreepayyt;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author Matiko's PC
 */
//@Override
    //public void actionPerformed(ActionEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}
public class Add_Mathree_Driver extends JFrame implements ActionListener 
{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JButton bt1,bt2;
    JPanel p1,p2,p3;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    Font f,f1;
    
    Add_Mathree_Driver()
    {
        super("Add Mathree Driver");
        setLocation(450,50);
        setSize(450,400);
        
        f=new Font("Arial",Font.BOLD,20);
        f1=new Font("Arial",Font.BOLD,15);
        
        l1=new JLabel("Add Mathree Driver");
        l2=new JLabel("Driver Name");
        l3=new JLabel("Route Start");
        l4=new JLabel("Route Destination");
        l5=new JLabel("Car");
        l6=new JLabel("Price");
        
        tf1=new JTextField();
        tf2=new JTextField();
        tf3=new JTextField();
        tf4=new JTextField();
        tf5=new JTextField();
        
        bt1= new JButton("Add Mathree Driver");
        bt2= new JButton("Back");
        
        l1.setHorizontalAlignment(JLabel.CENTER);
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        l1.setForeground(Color.RED);
        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);
        l4.setFont(f1);
        l5.setFont(f1);
        l6.setFont(f1);
        
        tf1.setFont(f1);
        tf2.setFont(f1);
        tf3.setFont(f1);
        tf4.setFont(f1);
        tf5.setFont(f1);
        
        bt1.setFont(f1);
        bt2.setFont(f1);
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);
        p1.setBackground(Color.BLACK);
        
        p2= new JPanel();
        p2.setLayout(new GridLayout(6,2,10,10));
        
        p2.add(l2);
        p2.add(tf1);
        p2.add(l3);
        p2.add(tf2);
        p2.add(l4);
        p2.add(tf3);
        p2.add(l5);
        p2.add(tf4);
        p2.add(l6);
        p2.add(tf5);
        p2.add(bt1);
        p2.add(bt2);
        
        setLayout(new BorderLayout(10,10));
        add(p1,"North");
        add(p2,"Center");
        
    }
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource()==bt1)
        {
            String name=tf1.getText();
            String start=tf2.getText();
            String destination=tf3.getText();
            String car=tf4.getText();
            String price=tf5.getText();
            
            try
            {
                ConnectionClass obj=new ConnectionClass();
                String q="insert into mathree_driver(driver,start,destination,car,price) values('"+name+"','"+start+"','"+destination+"','"+car+"','"+price+"')";
                int aa=obj.stm.executeUpdate(q);
                if (aa==1)
                {
                    JOptionPane.showMessageDialog(null,"your data was successfully inserted");
                    this.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Please! Fill all details carefully");
                }
            }
            catch (Exception ee)
            {
                ee.printStackTrace();
            }
        }
        if(e.getSource()==bt2)
        {
            this.setVisible(false);
            new AdminSection().setVisible(true); 
        }
    }
    public static void main(String[] args)
    {
        new Add_Mathree_Driver().setVisible(true);
    }
    
}
