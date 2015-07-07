package tictac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;


public class TicTac {
    public static void main(String[] args) throws SQLException, ClassNotFoundException 
    {
        DataBase db=new DataBase();
        Connection cn=db.connection();
        Tic tic=new Tic();
    }
}

class DataBase
{
        public Connection connection() throws SQLException, ClassNotFoundException 
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/ticTacGame","root","1234");
        return con;
    }
        public void add(Connection con, String name) throws SQLException 
     {
        Statement add = con.createStatement();
        add.executeUpdate("INSERT INTO player(name)VALUES('" + name + "')");
    }
        public ResultSet readName(Connection con) throws SQLException
        {
            int index=0;
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("Select name from player");
           // ResultSet rs2=st.executeQuery("Select success from player");
//            ResultSet rs3=st.executeQuery("Select losses from player");
            //System.out.println(rs2);
            
            
//            while(rs1.next())
//            {
////                System.out.print(rs1.getString("name")+"/t");
////                System.out.println("");
////                rs1.close();
//                System.out.print(rs1.getInt("success")+"/t");
//                System.out.println("");
////                System.out.print(rs3.getInt("losses")+"/t");
////                System.out.println("");
//            }
            return  rs1;
        }
        public int read(Connection con,String name) throws SQLException
        {
            Statement add = con.createStatement();
            int success=0;
            ResultSet rs=add.executeQuery("Select success from player where name='"+name+"'");
            while(rs.next())
            {
                success=rs.getInt("success");
            }
            return success;
        }
        public int readLosses(Connection con,String name) throws SQLException
        {
            Statement add = con.createStatement();
            int losses=0;
            ResultSet rs=add.executeQuery("Select losses from player where name='"+name+"'");
            while(rs.next())
            {
                losses=rs.getInt("losses");
            }
            return losses;
        }
        
        public void addScores(Connection con,String name,int success) throws SQLException
        {
            Statement add = con.createStatement();
            add.executeUpdate("UPDATE player SET success="+success+" WHERE name='"+name+"'");
        }
        public void removeScores(Connection con,String name,int losses) throws SQLException
        {
            Statement add = con.createStatement();
            add.executeUpdate("UPDATE player SET losses="+losses+" WHERE name='"+name+"'");
        }
}