/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictac;


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Board extends javax.swing.JFrame{

    boolean player;
    String player1=null,player2=null;
    Button []btnArr=new Button[9];
    DataBase db=new DataBase();
     Connection con;
     int s1=0,s2=0;
     int success=0,losses=0;
    public Board(String player1,String player2) throws SQLException, ClassNotFoundException {
        initComponents();
        this.player1=player1;
        this.player2=player2;
        this.setVisible(true);
        jLabel4.setBackground(Color.BLUE);
        jLabel5.setText(player1);
        jLabel6.setText(player2);
        jLabel7.setText("0");
        jLabel8.setText("0");
        con=db.connection();
        player=true;
        for(int i=0;i<9;i++)
        {
            btnArr[i]=new Button();
        }
        btnArr[0].btn=B1;
        btnArr[1].btn=B2;
        btnArr[2].btn=B3;
        btnArr[3].btn=B4;
        btnArr[4].btn=B5;
        btnArr[5].btn=B6;
        btnArr[6].btn=B7;
        btnArr[7].btn=B8;
        btnArr[8].btn=B9;
        
        
    }
 ImageIcon img = new ImageIcon("G:\\Java\\javaPrgrm\\TicTac\\src\\tictac\\Layer 1.png");
 ImageIcon img1 = new ImageIcon("G:\\Java\\javaPrgrm\\TicTac\\src\\tictac\\Layer 2.png");
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 728));
        setPreferredSize(new java.awt.Dimension(700, 490));
        setResizable(false);
        getContentPane().setLayout(null);

        B1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        B1.setBorderPainted(false);
        B1.setContentAreaFilled(false);
        B1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/tictac/Layer 1.png"))); // NOI18N
        B1.setFocusPainted(false);
        B1.setFocusable(false);
        B1.setMaximumSize(new java.awt.Dimension(80, 80));
        B1.setPreferredSize(new java.awt.Dimension(80, 80));
        B1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/tictac/Layer 1.png"))); // NOI18N
        B1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/tictac/Layer 1.png"))); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1);
        B1.setBounds(370, 30, 80, 80);

        B2.setBorderPainted(false);
        B2.setContentAreaFilled(false);
        B2.setFocusPainted(false);
        B2.setFocusable(false);
        B2.setMaximumSize(new java.awt.Dimension(80, 80));
        B2.setPreferredSize(new java.awt.Dimension(80, 80));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2);
        B2.setBounds(470, 30, 80, 80);

        B3.setBorderPainted(false);
        B3.setContentAreaFilled(false);
        B3.setFocusPainted(false);
        B3.setFocusable(false);
        B3.setMaximumSize(new java.awt.Dimension(80, 80));
        B3.setPreferredSize(new java.awt.Dimension(80, 80));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        getContentPane().add(B3);
        B3.setBounds(570, 30, 80, 80);

        B4.setBorderPainted(false);
        B4.setContentAreaFilled(false);
        B4.setFocusPainted(false);
        B4.setFocusable(false);
        B4.setMaximumSize(new java.awt.Dimension(80, 80));
        B4.setPreferredSize(new java.awt.Dimension(80, 80));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        getContentPane().add(B4);
        B4.setBounds(370, 130, 80, 80);

        B5.setBorderPainted(false);
        B5.setContentAreaFilled(false);
        B5.setFocusPainted(false);
        B5.setFocusable(false);
        B5.setMaximumSize(new java.awt.Dimension(80, 80));
        B5.setPreferredSize(new java.awt.Dimension(80, 80));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        getContentPane().add(B5);
        B5.setBounds(470, 130, 80, 80);

        B6.setBorderPainted(false);
        B6.setContentAreaFilled(false);
        B6.setFocusPainted(false);
        B6.setFocusable(false);
        B6.setMaximumSize(new java.awt.Dimension(80, 80));
        B6.setPreferredSize(new java.awt.Dimension(80, 80));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        getContentPane().add(B6);
        B6.setBounds(570, 130, 80, 80);

        B7.setBorderPainted(false);
        B7.setContentAreaFilled(false);
        B7.setFocusPainted(false);
        B7.setFocusable(false);
        B7.setMaximumSize(new java.awt.Dimension(80, 80));
        B7.setPreferredSize(new java.awt.Dimension(80, 80));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        getContentPane().add(B7);
        B7.setBounds(370, 230, 80, 80);

        B8.setBorderPainted(false);
        B8.setContentAreaFilled(false);
        B8.setFocusPainted(false);
        B8.setFocusable(false);
        B8.setMaximumSize(new java.awt.Dimension(80, 80));
        B8.setPreferredSize(new java.awt.Dimension(80, 80));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        getContentPane().add(B8);
        B8.setBounds(470, 230, 80, 80);

        B9.setBackground(new java.awt.Color(51, 51, 255));
        B9.setBorderPainted(false);
        B9.setContentAreaFilled(false);
        B9.setFocusPainted(false);
        B9.setFocusable(false);
        B9.setMaximumSize(new java.awt.Dimension(80, 80));
        B9.setPreferredSize(new java.awt.Dimension(80, 80));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        getContentPane().add(B9);
        B9.setBounds(570, 230, 80, 80);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jButton1.setText("RESTART");
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 260, 200, 50);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(250, 380, 73, 23);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 102));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 80, 70, 70);

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 102));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 90, 70, 70);

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 102));
        jLabel6.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 30, 150, 40);

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 102));
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 30, 150, 40);

        jLabel4.setBackground(new java.awt.Color(255, 204, 0));
        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 102));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 320, 420, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictac/Tic-Tac-Toe-Pro-icon copy.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 20, 300, 300);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictac/chicken rabbit.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel3.setPreferredSize(new java.awt.Dimension(700, 490));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 780, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed

        checkAvailable(0);

    }//GEN-LAST:event_B1ActionPerformed
    private void checkAvailable(int btnNo)
    {
        
        if(btnArr[btnNo].status==false)
        {
            btnArr[btnNo].status=true;
            if(player)
            {
                btnArr[btnNo].btn.setIcon(img);
                player=false;
                btnArr[btnNo].value=1;
            }
            else
            {
                btnArr[btnNo].btn.setIcon(img1);
                player=true;
                btnArr[btnNo].value=-1;
            }
            if((btnArr[0].value+btnArr[1].value+btnArr[2].value)==3 || (btnArr[3].value+btnArr[4].value+btnArr[5].value)==3 || (btnArr[6].value+btnArr[7].value+btnArr[8].value)==3 || (btnArr[0].value+btnArr[3].value+btnArr[6].value)==3 || (btnArr[1].value+btnArr[4].value+btnArr[7].value)==3 || (btnArr[2].value+btnArr[5].value+btnArr[8].value)==3 || (btnArr[0].value+btnArr[4].value+btnArr[8].value)==3 || (btnArr[2].value+btnArr[4].value+btnArr[6].value)==3)
            {
               jLabel4.setText(player1+" won !");
                for (int i = 0; i < 9; i++) {
                    btnArr[i].status=true;
                }
               try
               {
                   s1++;
                   jLabel7.setText(Integer.toString(s1));
               int success=db.read(con, player1)+1;
               int losses=db.readLosses(con, player2)+1;
                     db.addScores(con,player1, success);
                     db.removeScores(con, player2, losses);
               }
               catch(Exception ep)
               {
                   
               }
            }
            else if((btnArr[0].value+btnArr[1].value+btnArr[2].value)==-3 || (btnArr[3].value+btnArr[4].value+btnArr[5].value)==-3 || (btnArr[6].value+btnArr[7].value+btnArr[8].value)==-3 || (btnArr[0].value+btnArr[3].value+btnArr[6].value)==-3 || (btnArr[1].value+btnArr[4].value+btnArr[7].value)==-3 || (btnArr[2].value+btnArr[5].value+btnArr[8].value)==-3 || (btnArr[0].value+btnArr[4].value+btnArr[8].value)==-3 || (btnArr[2].value+btnArr[4].value+btnArr[6].value)==-3)
            {
                jLabel4.setBackground(Color.BLUE);
               jLabel4.setText(player2+" won !");
               try
               {
                   s2++;
                   jLabel8.setText(Integer.toString(s1));
                    int success=db.read(con, player2)+1;
                    int losses=db.read(con, player1)+1;
                    db.addScores(con,player2, success);
                    db.removeScores(con, player1, losses);
                    for (int i = 0; i < 9; i++) {
                    btnArr[i].status=true;
                }
               }
               catch(Exception ep)
               {
                   
               }
            }
          else  if(checkDraw())
        {
            jLabel4.setBackground(Color.red);
            jLabel4.setText("DRAWN");
        }
        }
        
        
    }
    
    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        
        checkAvailable(1);
        

    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed

        checkAvailable(2);
        
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed

        checkAvailable(3);
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        
        checkAvailable(4);
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
       
        checkAvailable(5);
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed

        
        checkAvailable(6);
        
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        
        checkAvailable(7);
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed

        checkAvailable(8);
    }//GEN-LAST:event_B9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Tic tt;
        
            tt = new Tic();
            tt.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            Result1 rs=new Result1();
            rs.setVisible(true);
            this.setVisible(false);
    //        try {
    //            rs.resul();
    //        } catch (SQLException ex) {
    //            Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
    //        } catch (ClassNotFoundException ex) {
    //        }
    //        }
        } catch (SQLException ex) {
            Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public boolean checkDraw()
    {
        int tot=0;
        for (int i = 0; i < 9; i++) 
        {
            if(btnArr[i].status)
            tot++;
            if (tot==9) {
                return true;
            }
        }
        return false;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

}
class Button
{
    JButton btn=new JButton();
    boolean status=false;
    int value=0;
}