package mathreepayyt;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author Matiko's PC
 */

public class View_Customer extends JFrame
{
    Font f;
    JTable t1;
    String x[]={"Username","Name","Age","Date Of Birth","Address","Phone","Email","Country","Gender","ID Number"};
    String y[][]=new String [20][10];
    int i=0,j=0;
    
    View_Customer()
    {
        super("All customer details");
        setSize(1300,400);
        setLocation(0,10);
        f=new Font("MS UI Gothic",Font.BOLD,17);
        
        try
        {
            ConnectionClass obj=new ConnectionClass();
            String q="select* from customer";
            ResultSet rest = obj.stm.executeQuery(q);
            while(rest.next())
            {
                y[i][j++]=rest.getString("username");
                y[i][j++]=rest.getString("name");
                y[i][j++]=rest.getString("age");
                y[i][j++]=rest.getString("dateofbirth");
                y[i][j++]=rest.getString("address");
                y[i][j++]=rest.getString("phone");
                y[i][j++]=rest.getString("email");
                y[i][j++]=rest.getString("country");
                y[i][j++]=rest.getString("gender");
                y[i][j++]=rest.getString("idnumber");
                i++;
                j=0;
            }
            t1=new JTable(y,x);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        t1.setFont(f);
        t1.setBackground(Color.BLACK);
        t1.setForeground(Color.WHITE);
        
        JScrollPane js=new JScrollPane(t1);
        add(js);
    }
    public static void main(String[] args)
    {
        new View_Customer().setVisible(true);
    }
    
    
    
}
