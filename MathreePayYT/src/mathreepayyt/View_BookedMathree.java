package mathreepayyt;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author Matiko's PC
 */

public class View_BookedMathree extends JFrame
{
    Font f;
    JTable t1;
    String x[]={"Book ID","Username","Driver Name","Car","Start","Destination","Price"};
    String y[][]=new String [20][7];
    int i=0,j=0;
    
    View_BookedMathree()
    {
        super("All Booked Mathree Records");
        setSize(1300,400);
        setLocation(0,10);
        f=new Font("MS UI Gothic",Font.BOLD,17);
        
        try
        {
            ConnectionClass obj=new ConnectionClass();
            String q="select* from nairobimathree";
            ResultSet rest = obj.stm.executeQuery(q);
            while(rest.next())
            {
                y[i][j++]=rest.getString("Book Id");
                y[i][j++]=rest.getString("Username");
                y[i][j++]=rest.getString("Driver Name");
                y[i][j++]=rest.getString("Car");
                y[i][j++]=rest.getString("Start");
                y[i][j++]=rest.getString("Destinaition");
                y[i][j++]=rest.getString("Price");
                i++;
                j=0;
            }
            t1=new JTable(y,x);
        
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        
        t1.setFont(f);
        t1.setBackground(Color.BLACK);
        t1.setForeground(Color.WHITE);
        
        JScrollPane js=new JScrollPane(t1);
        add(js);
        
    }
    
    public static void main(String[] args)
    {
        new View_BookedMathree().setVisible(true);
    
    }
}
