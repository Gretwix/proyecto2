/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ucr.ac.cr.view;

import java.awt.event.ActionListener;

/**
 *
 * @author Jason
 */
public class CombosGUI extends javax.swing.JFrame {

    private int combo;
    /**
     * Creates new form CombosGUI
     */
    public CombosGUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        combo=1;
        inicio();
    }

     public void listen(ActionListener controller)
    {
        this.btnExit.addActionListener(controller);
        this.btnNext.addActionListener(controller);
    }
    
    public void nextcombo(){
         combo++;
         
         if(combo==1){
            inicio();
         }
         if(combo==2){
             jLabelText.setText("Combo 2");
             jLabel1.setVisible(false);
             jLabel2.setVisible(true);
             jLabel3.setVisible(false);
         }
         if(combo==3){
             jLabelText.setText("Combo 3");
             jLabel1.setVisible(false);
             jLabel2.setVisible(false);
             jLabel3.setVisible(true);
         }
         
         if(combo==4){
             inicio();
             combo=1;
         }
         
     }
     
     public void inicio(){
          jLabelText.setText("Combo 1");
             jLabel1.setVisible(true);
             jLabel2.setVisible(false);
             jLabel3.setVisible(false);
             
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelText = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelText.setFont(new java.awt.Font("Segoe UI Semibold", 3, 24)); // NOI18N
        jLabelText.setText("Combos");
        getContentPane().add(jLabelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 240, 40));

        btnNext.setText("Next");
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 75, -1));

        btnExit.setText("Exit");
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/combo 1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 450));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/combo 2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 450));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/combo 3.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelText;
    // End of variables declaration//GEN-END:variables
}
