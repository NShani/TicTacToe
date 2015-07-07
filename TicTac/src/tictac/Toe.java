package tictac;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import tictac.Board;
import tictac.Board2;

public class Toe extends javax.swing.JFrame {

     DataBase db=new DataBase();
     Connection con;
    
    public Toe()  {
        initComponents();
        try
        {
        con=db.connection();
        }
        catch(Exception e)
        {
            
        }
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 490));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel2.setText("Player Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 100, 140, 30);

        jTextField1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(470, 90, 200, 50);

        jButton3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 48)); // NOI18N
        jButton3.setText("Start");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(370, 240, 160, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictac/chicken rabbit.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 490));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        try {
            // TODO add your handling code here:
            db.add(con,jTextField1.getText());
        } catch (SQLException ex) {
            
        }
        Board2 b=new Board2(jTextField1.getText());
        b.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
