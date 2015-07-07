/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictac;

import static java.awt.Component.TOP_ALIGNMENT;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Tac extends javax.swing.JFrame {

     Player pl[]=new Player[2];
     DataBase db=new DataBase();
     Connection con;
    public Tac() throws SQLException, ClassNotFoundException {
        initComponents();
        pl[0]=new Player();
        pl[1]=new Player();
       
        con=db.connection();
        this.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 490));
        setPreferredSize(new java.awt.Dimension(700, 490));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 270, 120, 60);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel1.setText("Player 1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 60, 130, 50);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel2.setText("Player 2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 150, 120, 50);

        jTextField1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(451, 60, 190, 40);

        jTextField2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(450, 150, 190, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictac/chicken rabbit.jpg"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(700, 490));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 700, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pl[0].name=jTextField1.getText();
        pl[1].name=jTextField2.getText();
        
        try
        {
            Board b=new Board(pl[0].name,pl[1].name);
            b.setVisible(true);
            this.setVisible(false);
            db.add(con,pl[0].name);
            db.add(con,pl[1].name);
        }
        catch(Exception e)
        {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
class Player
{
    int no=0;
    String name;
}