package mathreepayyt;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Matiko's PC
 */
public class HomePage extends JFrame implements ActionListener
{
    JLabel l1;
    Font f,f1,f2;
    JPanel p1,p2;
    
    HomePage()
    {
        super("Matatu Booking Home Page");
        setLocation(0,0);
        setSize(1550,800);
        
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("mathreepayyt/Icons/home.jpg"));
        Image img = ic.getImage() .getScaledInstance(1550, 800, Image.SCALE_DEFAULT);
        ImageIcon icl=new ImageIcon(img);
        l1 = new JLabel(icl);
        
        f = new Font("Lucida Fax", Font.BOLD,20);
        f2 = new Font("Gadugi", Font.BOLD,35);
        f1 = new Font("MS UI Gothic",Font.BOLD,18);
        
        JMenuBar m1=new JMenuBar();
        
        JMenu men1=new JMenu("Customer Profile");
        JMenuItem ment1=new JMenuItem("Add Customer Profile");
        JMenuItem ment2=new JMenuItem("View Customer Profile");
        
        JMenu men2=new JMenu("Manage Customer");
        JMenuItem ment3=new JMenuItem("Update Customer Details");
        
        JMenu men3=new JMenu("Book Nairobi Mathree");
        JMenuItem ment5=new JMenuItem("Book Mathree");
        JMenuItem ment6=new JMenuItem("View Booked Mathree");
        
        JMenu men6=new JMenu("Fare");
        JMenuItem ment11=new JMenuItem("Check Fare");
        
        JMenu men7=new JMenu("Delete");
        JMenuItem ment12=new JMenuItem("Delete Customer");
        
        JMenu men8=new JMenu("About");
        JMenuItem ment13=new JMenuItem("About");
        JMenuItem ment14=new JMenuItem("Exit");
        
        men1.add(ment1);
        men1.add(ment2);
        men2.add(ment3);
        men3.add(ment5);
        men3.add(ment6);
        men6.add(ment11);
        men7.add(ment12);
        men8.add(ment13);
        men8.add(ment14);
        
        m1.add(men1);
        m1.add(men2);
        m1.add(men3);
        m1.add(men6);
        m1.add(men7);
        m1.add(men8);
        
        m1.setBackground(Color.BLACK);
        
        men1.setForeground(Color.GRAY);
        men2.setForeground(Color.GRAY);
        men3.setForeground(Color.GRAY);
        men6.setForeground(Color.GRAY);
        men7.setForeground(Color.GRAY);
        men8.setForeground(Color.RED);
        
        ment1.setBackground(Color.BLACK);
        ment2.setBackground(Color.BLACK);
        ment3.setBackground(Color.BLACK);
        ment5.setBackground(Color.BLACK);
        ment6.setBackground(Color.BLACK);
        ment6.setBackground(Color.BLACK);
        ment11.setBackground(Color.BLACK);
        ment12.setBackground(Color.BLACK);
        ment13.setBackground(Color.BLACK);
        ment14.setBackground(Color.BLACK);
        
        ment1.setForeground(Color.YELLOW);
        ment2.setForeground(Color.YELLOW);
        ment3.setForeground(Color.YELLOW);
        ment5.setForeground(Color.YELLOW);
        ment6.setForeground(Color.YELLOW);
        ment6.setForeground(Color.YELLOW);
        ment11.setForeground(Color.YELLOW);
        ment12.setForeground(Color.YELLOW);
        ment13.setForeground(Color.RED);
        ment14.setForeground(Color.RED);
        
        setJMenuBar(m1);
        add(l1);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String comnd=e.getActionCommand();
        if(comnd.equals("Add Customer Profile"))
        {
            new Add_Customer();
        }
        else if(comnd.equals("View Customer Profile"))
        {
            new View_Customer().setVisible(true);
        }
        else if(comnd.equals("Update Customer Details"))
        {
            new Update_Customer().setVisible(true);
        }
        else if(comnd.equals("Book Nairobi Mathree"))
        {
            new Book_Matatu().setVisible(true);
        }
        else if(comnd.equals("View Booked Mathree"))
        {
            new View_BookedMathree().setVisible(true);
        }
        else if(comnd.equals("Check Bill"))
        {
            new CheckBill().setVisible(true);
        }
        else if(comnd.equals("Delete Customer"))
        {
            new Delete_Customer().setVisible(true);
        }
        else if(comnd.equals("About"))
        {
            new About().setVisible(true);
        }
        else if(comnd.equals("Exit"))
        {
            System.exit(0);
        }
    }
    
    public static void main(String [] args)
    {
        new HomePage().setVisible(true);
    }
    
}
