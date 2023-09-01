package mathreepayyt;

import java.sql.*;

/**
 *
 * @author Matiko's PC
 */
public class ConnectionClass 
{
    Connection con;
    Statement stm;
    
    ConnectionClass()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc.mysql://localhost:19/mathreepayyt","root","Nyamani#98");
            stm=con.createStatement();
            
            if (con.isClosed())
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    public static void main (String args[])
    {
        new ConnectionClass();
    }
}
