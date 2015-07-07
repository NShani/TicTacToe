/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictac;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dell
 */
public class Result
{
    DataBase db=new DataBase();
    public void resultPlay() throws SQLException, ClassNotFoundException
    {
        ResultSet rs1;
        Connection con=db.connection();
        rs1=db.readName(con);
        while(rs1.next())
            {
                System.out.print(rs1.getString("name")+"/t");
                System.out.println("");
//                rs1.close();
//                System.out.print(rs1.getInt("success")+"/t");
//                System.out.println("");
//                System.out.print(rs3.getInt("losses")+"/t");
//                System.out.println("");
            }
    }
    
}
