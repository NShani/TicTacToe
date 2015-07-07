/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictac;

import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Board2 extends javax.swing.JFrame {

    Btn btnArr[][]=new Btn[3][3];
    PlayCom pyr=new PlayCom();
    DataBase db=new DataBase();
     Connection con;
     String player;
     int p=0,c=0;
    public Board2(String player)  {
        initComponents();
        this.player=player;
        jLabel4.setText(player);
        jLabel6.setText("0");
        jLabel7.setText("0");
        try
        {
        con=db.connection();
        }
        catch(Exception e)
        {
            
        }
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j <3; j++) 
            {
                btnArr[i][j]=new Btn();
            }
            
        }
        btnArr[0][0].btn=jButton1;
        btnArr[0][1].btn=jButton2;
        btnArr[0][2].btn=jButton3;
        btnArr[1][0].btn=jButton4;
        btnArr[1][1].btn=jButton5;
        btnArr[1][2].btn=jButton6;
        btnArr[2][0].btn=jButton7;
        btnArr[2][1].btn=jButton8;
        btnArr[2][2].btn=jButton9;
    }

    
    ImageIcon img = new ImageIcon("G:\\Java\\javaPrgrm\\TicTac\\src\\tictac\\Layer 1.png");
    ImageIcon img1 = new ImageIcon("G:\\Java\\javaPrgrm\\TicTac\\src\\tictac\\Layer 2.png");
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 490));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton1.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(390, 30, 80, 80);

        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton2.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(490, 30, 80, 80);

        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton3.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(590, 30, 80, 80);

        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setFocusPainted(false);
        jButton4.setFocusable(false);
        jButton4.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton4.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(390, 130, 80, 80);

        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton5.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(490, 130, 80, 80);

        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton6.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(590, 130, 80, 80);

        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);
        jButton7.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton7.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(390, 230, 80, 80);

        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setFocusPainted(false);
        jButton8.setFocusable(false);
        jButton8.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton8.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(490, 230, 80, 80);

        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setFocusPainted(false);
        jButton9.setFocusable(false);
        jButton9.setMaximumSize(new java.awt.Dimension(80, 80));
        jButton9.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(590, 230, 80, 80);

        jButton10.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jButton10.setText("RESTART");
        jButton10.setFocusPainted(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(100, 200, 200, 60);

        jLabel4.setBackground(new java.awt.Color(255, 0, 102));
        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 102));
        jLabel4.setText("jLabel4");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 20, 150, 40);

        jLabel5.setBackground(new java.awt.Color(255, 0, 102));
        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 102));
        jLabel5.setText("Computer");
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 20, 140, 40);

        jLabel6.setBackground(new java.awt.Color(255, 0, 102));
        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 102));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 70, 90, 80);

        jLabel7.setBackground(new java.awt.Color(255, 0, 102));
        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 102));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 70, 90, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictac/Tic-Tac-Toe-Pro-icon copy.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 10, 310, 310);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 320, 450, 60);

        jLabel2.setForeground(new java.awt.Color(255, 0, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictac/chicken rabbit.jpg"))); // NOI18N
        jLabel2.setText(" ");
        jLabel2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jLabel2.setPreferredSize(new java.awt.Dimension(1238, 900));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-120, -230, 1238, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int row=0,clm=0,rowVal=0,clmVal=0,dia=0,diaVal=0,diaNo=0;
    int row1[]=new int[3],clm1[]=new int[3];
    int[] dia1 = new int[3];   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!btnArr[0][0].status)
        {
            btnArr[0][0].status=true;
            btnArr[0][0].btn.setIcon(img);
            btnArr[0][0].value=1;
            
            checkRow();
            checkClm();
            checkDiagonal();
            putSign();
            checkWin();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(!btnArr[0][1].status)
        {
            btnArr[0][1].status=true;
            btnArr[0][1].btn.setIcon(img);
            btnArr[0][1].value=1;
            checkRow();
            checkClm();
            checkDiagonal();
            putSign();
            checkWin();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(!btnArr[0][2].status)
        {
            btnArr[0][2].status=true;
            btnArr[0][2].btn.setIcon(img);
            btnArr[0][2].value=1;
            checkRow();
            checkClm();
            checkDiagonal();
            putSign();
             checkWin();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(!btnArr[1][0].status)
        {
            btnArr[1][0].status=true;
            btnArr[1][0].btn.setIcon(img);
            btnArr[1][0].value=1;
            checkRow();
            checkClm();
            checkDiagonal();
            putSign();
             checkWin();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(!btnArr[1][1].status)
        {
            btnArr[1][1].status=true;
            btnArr[1][1].btn.setIcon(img);
            btnArr[1][1].value=1;
            checkRow();
            checkClm();
            checkDiagonal();
            putSign();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(!btnArr[1][2].status)
        {
            btnArr[1][2].status=true;
            btnArr[1][2].btn.setIcon(img);
            btnArr[1][2].value=1;
            checkRow();
            checkClm();
            checkDiagonal();
            putSign();
             checkWin();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(!btnArr[2][0].status)
        {
            btnArr[2][0].status=true;
            btnArr[2][0].btn.setIcon(img);
            btnArr[2][0].value=1;
            checkRow();
            checkClm();
            checkDiagonal();
            
            putSign();
            checkWin();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(!btnArr[2][1].status)
        {
            btnArr[2][1].status=true;
            btnArr[2][1].btn.setIcon(img);
            btnArr[2][1].value=1;
            checkRow();
            checkClm();
            checkDiagonal();
            putSign();
             checkWin();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(!btnArr[2][2].status)
        {
            btnArr[2][2].status=true;
            btnArr[2][2].btn.setIcon(img);
            btnArr[2][2].value=1;
            checkRow();
            checkClm();
            checkDiagonal();
            putSign();
             checkWin();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        Tic tt;
        
            tt = new Tic();
            tt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed
    
    public boolean checkDraw()
    {
        int tot=0;
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
        {
            if(btnArr[i][j].status)
            tot++;
            if (tot==9)
            {
                return true;
            }
        }
        }
        
        return false;
        
    }

    
    private void checkWin()
    {
        
        if((btnArr[0][0].value+btnArr[0][1].value+btnArr[0][2].value)==3 ||(btnArr[1][0].value+btnArr[1][1].value+btnArr[1][2].value)==3 || (btnArr[2][0].value+btnArr[2][1].value+btnArr[2][2].value)==3 || (btnArr[0][0].value+btnArr[1][0].value+btnArr[2][0].value)==3 || (btnArr[0][1].value+btnArr[1][1].value+btnArr[2][1].value)==3 || (btnArr[0][2].value+btnArr[1][2].value+btnArr[2][2].value)==3 || (btnArr[0][0].value+btnArr[1][1].value+btnArr[2][2].value)==3 || (btnArr[0][2].value+btnArr[1][1].value+btnArr[2][0].value)==3)
        {
            jLabel1.setText(player+" Won");
            try
               {
                     p++;
                     jLabel6.setText(Integer.toString(p));
                     int success=db.read(con, player)+1;
                     db.addScores(con,player, success);
                     if(checkDraw())
                        {
                            jLabel1.setBackground(Color.red);
                            jLabel1.setText("DRAWN");
                        }
               }
               catch(Exception ep)
               {
                   
               }
        }
        else if((btnArr[0][0].value+btnArr[0][1].value+btnArr[0][2].value)==-3 ||(btnArr[1][0].value+btnArr[1][1].value+btnArr[1][2].value)==-3 || (btnArr[2][0].value+btnArr[2][1].value+btnArr[2][2].value)==-3 || (btnArr[0][0].value+btnArr[1][0].value+btnArr[2][0].value)==-3 || (btnArr[0][1].value+btnArr[1][1].value+btnArr[2][1].value)==-3 || (btnArr[0][2].value+btnArr[1][2].value+btnArr[2][2].value)==-3 || (btnArr[0][0].value+btnArr[1][1].value+btnArr[2][2].value)==-3 || (btnArr[0][2].value+btnArr[1][1].value+btnArr[2][0].value)==-3)
        {
            
            jLabel1.setText("Computer Won");
            
            try
               {
                     c++;
                     jLabel7.setText(Integer.toString(c));
                     int losses=db.readLosses(con, player)+1;
                     db.removeScores(con, player, losses);
                     if(checkDraw())
                        {
                            jLabel1.setText("DRAWN");
                        }
               }
               catch(Exception ep)
               {
                   
               }
        }
        
        
    }
//    private void checkWon()
//    {
//        if()
//    }
    private void putSign()
    {
        int times=0;
        if(rowVal>=clmVal && rowVal>=diaVal)
        {
            try
            {
            for (int i = 0; i < 3; i++) {
                if(!btnArr[row][i].status)
                {
                    btnArr[row][i].status=true;
                    btnArr[row][i].value=-1;
                    btnArr[row][i].btn.setIcon(img1);
                    System.out.println("1");
                    break;
                }
            }
            }
            catch(Exception e)
            {
              for (int i = 0; i < 3; i++) {
                if(!btnArr[i][clm].status)
                {
                    btnArr[i][clm].status=true;
                    btnArr[i][clm].value=-1;
                    btnArr[i][clm].btn.setIcon(img1);
                    System.out.println("2");
                    break;
                }
            }  
            }
        }
        else if(clmVal>=diaVal)
        {
            try
            {
             for (int i = 0; i < 3; i++) {
                if(!btnArr[i][clm].status)
                {
                    System.out.println("bbbb"+clm);
                    btnArr[i][clm].status=true;
                    btnArr[i][clm].value=-1;
                    btnArr[i][clm].btn.setIcon(img1);
                    System.out.println("3");
                    break;
                }
               }  
            }
            catch(Exception e)
            {
                if(diaNo==1)
          {
              for (int i = 0; i < 3; i++) {
                  
                  if(!btnArr[i][i].status)
                  {
                      btnArr[i][i].status=true;
                    btnArr[i][i].value=-1;
                    btnArr[i][i].btn.setIcon(img1);
                    System.out.println("4");
                    //times++;
                    break;
                  }
              }
              
              
          }
          else
          {
              for (int i = 0; i < 3; i++) {
                  for (int j = 2; j >=0; j--) {
                      if(!btnArr[i][j].status)
                  {
                      btnArr[i][j].status=true;
                    btnArr[i][j].value=-1;
                    btnArr[i][j].btn.setIcon(img1);
                    System.out.println("5");
                    times++;
                    break;
                  }
                      
                  }
                  if(times==1)
              {
                  break;
              }
              }
          }
            }
        }
        else if(diaVal>rowVal && diaVal>clmVal)
        {
          if(diaNo==1)
          {
              for (int i = 0; i < 3; i++) {
                  
                  if(!btnArr[i][i].status)
                  {
                      btnArr[i][i].status=true;
                    btnArr[i][i].value=-1;
                    btnArr[i][i].btn.setIcon(img1);
                    System.out.println("6");
                    //times++;
                    break;
                  }
              }
              
              
          }
          else
          {
              for (int i = 0; i < 3; i++) {
                  for (int j = 2; j >=0; j--) {
                      if(!btnArr[i][j].status)
                  {
                      btnArr[i][j].status=true;
                    btnArr[i][j].value=-1;
                    btnArr[i][j].btn.setIcon(img1);
                    System.out.println("7");
                    times++;
                    break;
                  }
                      
                  }
                  if(times==1)
              {
                  break;
              }
              }
          }
        }
        else
        {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    
                      btnArr[i][j].status=true;
                    btnArr[i][j].value=-1;
                    btnArr[i][j].btn.setIcon(img1);
                    System.out.println("8");
                    times++;
                    break;
                }
                 if(times==1)
              {
                  break;
              }
            }
        }
//                  btnArr[row-1][i].status=true;
//                  btnArr[row-1][i].btn.setIcon(img1);
//                  btnArr[row-1][i].value=-1;
//                  btnArr[row-1][i].status=true;
//            break;
//              }
//            }
//        }
//        
//        else if(clmVal > diaVal && clm!=0){
//            for(int i=0;i<3;i++){
//              if(!(btnArr[i][clm-1].status)){
//                  btnArr[i][clm-1].status=true;
//                  btnArr[i][clm-1].btn.setIcon(img1);
//            btnArr[i][clm-1].value=-1;
//                  btnArr[i][clm-1].status=true;
//            break;
//              }
//            }
//        }
//        
//        else {
//            for(int i=0;i<3;i++){
//                for(int j=0;j<3;j++){
//                    if(diaNo==1){
//                    if(i==j ){
//                   if(!(btnArr[i][j].status)){
//                        btnArr[i][j].status=true;
//                        btnArr[i][j].btn.setIcon(img1);
//                        btnArr[i][j].value=-1;
//                        btnArr[i][j].status=true;
//                        times++;
//                        break;
//              }
//                    }
//                }
//                    else if((i==0 && j==2) || (i==2 && j==0) || (i==1 && j==1)){
//                      if(!(btnArr[i][j].status)){
//                         btnArr[i][j].status=true;
//                         btnArr[i][j].btn.setIcon(img1);
//                         btnArr[i][j].value=-1;
//                         btnArr[i][j].status=true;
//                         times++;
//                        break;  
//                    }
//            }
//            
//        }
//                if(times==1)
//                {
//                    break;
//                }
//    }
//        }
    }
    private int checkRow()
    {   
        int tot[]=new int[3];
        tot[0]=0;
        tot[1]=0;
        tot[2]=0;
        int max=0;
                int totr2=0,totr3=0,tot1=0,numOfTrue=0;
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++) 
            {
                if (btnArr[i][j].value==1) 
                {
                 tot[i]++; 
                }
            }
            if(tot[i]>max)
            {
                max=tot[i];
                row=i;
                rowVal=max;
            }
        }
//              if(btnArr[0][i].value==-1){
//                    numOfTrue++;
//                }
//           
//            if(numOfTrue==2){
//                totr1=0;
//                break;
//            }
//            if(btnArr[0][i].value>0)
//           totr1 += btnArr[0][i].value;
//        }
//        numOfTrue=0;
//        for(int i=0;i<3;i++){
//           
//                if(btnArr[1][i].status){
//                    numOfTrue++;
//                }
//            
//            if(numOfTrue==3){
//                totr2=0;
//                break;
//            }
//            if(btnArr[1][i].value>0)
//                  totr2 += btnArr[1][i].value;
//        }
//        numOfTrue=0;
//        for(int i=0;i<3;i++){
//            
//                if(btnArr[2][i].status){
//                    numOfTrue++;
//                }
//            
//            if(numOfTrue==3){
//                totr3=0;
//                break;
//            }
//            if(btnArr[2][i].value>0)
//           totr3 += btnArr[2][i].value;
//        }
//        
//if(totr1>totr2 && totr1>totr3){
//    tot=totr1;
//}else if(totr2>totr1 && totr2>totr3){
//    tot=totr2;
//}else{
//    tot=totr3;
//}
//rowVal=tot;
//        
//        if(tot==totr1){
//       return 1;}
//       else if(tot==totr2){
//               return 2;}
//               else if(tot==totr3){
//               return 3;
//               
//               }      
//       else
        return 0;
        
    }
    private int checkClm()
    {
        
        int tot[]=new int[3];
        tot[0]=0;
        tot[1]=0;
        tot[2]=0;
        int max=0;
                int totr2=0,totr3=0,tot1=0,numOfTrue=0;
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++) 
            {
                if (btnArr[j][i].value==1) 
                {
                 tot[i]++; 
                }
            }
            if(tot[i]>max)
            {
                
                max=tot[i];
                System.out.println(max+"fxfh"+i);
                clm=i;
                clmVal=max;
            }
        }
        
//        int totc1=0,totc2=0,totc3=0,tot=0,numOfTrue=0;
//        for(int i=0;i<3;i++){
//           
//              if(btnArr[i][0].status){
//                    numOfTrue++;
//                }
//           
//            if(numOfTrue==3){
//                totc1=0;
//                break;
//            }
//            if(btnArr[i][0].value>0)
//           totc1 += btnArr[i][0].value;
//        }
//        numOfTrue=0;
//        for(int i=0;i<3;i++){
//           
//                if(btnArr[i][1].status){
//                    numOfTrue++;
//                }
//            
//            if(numOfTrue==3){
//                totc2=0;
//                break;
//            }
//            if(btnArr[i][1].value>0)
//                  totc2 += btnArr[i][1].value;
//        }
//        numOfTrue=0;
//        for(int i=0;i<3;i++){
//            
//                if(btnArr[i][2].status){
//                    numOfTrue++;
//                }
//            
//            if(numOfTrue==3){
//                totc3=0;
//                break;
//            }
//            if(btnArr[i][2].value>0)
//           totc3 += btnArr[i][2].value;
//        }
//        
//if(totc1>totc2 && totc1>totc3){
//    tot=totc1;
//}else if(totc2>totc1 && totc2>totc3){
//    tot=totc2;
//}else{
//    tot=totc3;
//}
//clmVal=tot;
//        
//        
//      if(tot==totc1){
//       return 1;}
//       else if(tot==totc2){
//               return 2;}
//               else if(tot==totc3){
//               return 3;
//               
//               }      
//       else
        return 0;
        
    }
    
    public int checkDiagonal()
    {
        int dia1=0,dia2=0;
        for (int i = 0; i < 3; i++) {
            if (btnArr[i][i].value==1) {
                dia1++;
            }
        }
//        for (int i = 0; i < 3; i++) 
//        {
        int i=0,j=0;
            for (i=0,j = 2; j >=0; i++,j--) 
            {
                if (btnArr[i][i].value==1) 
                {
                dia2++;
            }
            }
            if(dia1>dia2)
            {
                diaVal=dia1;
                diaNo=1;
                dia=i;
            }
            else
            {
                diaVal=dia2;
                diaNo=2;
                dia=i;
            }
//        }
        
//         int totd1=0,totd2=0,totd3=0,tot=0,numOfTrue=0;
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                if(i==j){
//                if(btnArr[i][j].status){
//                    numOfTrue++;
//                }
//                
//            
//        
//           
//            if(numOfTrue==3){
//                totd1=0;
//                break;
//            }
//    
//            if(btnArr[i][j].value>0)
//           totd1 += btnArr[i][j].value;
//        }
//            }
//            
//        }
//        numOfTrue=0;
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                if((i==0 && j==2) || (i==1 && j==1) || (i==2 && j==0)){
//                         
//                if(btnArr[i][j].status){
//                    numOfTrue++;
//                }
//            
//            if(numOfTrue==3){
//                totd2=0;
//                break;
//            }
//            if(btnArr[i][j].value>0)
//                  totd2 += btnArr[i][j].value;
//        }
//                         
//        }
//        }
//        
//if(totd1>totd2 ){
//    tot=totd1;
//}else {
//    tot=totd2;
//}
//diaVal=tot;
//        
//        
//      if(tot==totd1){
//       return 1;}
//       else if(tot==totd2){
//               return 2;}
//               
//       else
        return 0;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}

class Btn
{
    JButton btn=new JButton();
    boolean status=false;
    int value=0;
}
class PlayCom
{
    String name;
    int val=1;
}