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
             lbNameCombos.setText("Combo 2");
             lbCombo1.setVisible(false);
             lbCombo2.setVisible(true);
             lbCombo3.setVisible(false);
         }
         if(combo==3){
             lbNameCombos.setText("Combo 3");
             lbCombo1.setVisible(false);
             lbCombo2.setVisible(false);
             lbCombo3.setVisible(true);
         }
         
         if(combo==4){
             inicio();
             combo=1;
         }
         
     }
     
     public void inicio(){
          lbNameCombos.setText("Combo 1");
             lbCombo1.setVisible(true);
             lbCombo2.setVisible(false);
             lbCombo3.setVisible(false);
             
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNameCombos = new javax.swing.JLabel();
        lbBackgroundRed1 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lbBackgroundRed2 = new javax.swing.JLabel();
        lbCombo1 = new javax.swing.JLabel();
        lbCombo2 = new javax.swing.JLabel();
        lbCombo3 = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNameCombos.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        lbNameCombos.setForeground(new java.awt.Color(238, 236, 208));
        lbNameCombos.setText("Combos");
        getContentPane().add(lbNameCombos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 450, 40));

        lbBackgroundRed1.setBackground(new java.awt.Color(160, 40, 38));
        lbBackgroundRed1.setOpaque(true);
        getContentPane().add(lbBackgroundRed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 60));

        btnNext.setBackground(new java.awt.Color(149, 38, 36));
        btnNext.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnNext.setForeground(new java.awt.Color(238, 236, 208));
        btnNext.setText("Next");
        btnNext.setBorder(null);
        btnNext.setBorderPainted(false);
        btnNext.setFocusPainted(false);
        btnNext.setOpaque(true);
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 70, 40));

        btnExit.setBackground(new java.awt.Color(149, 38, 36));
        btnExit.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(238, 236, 208));
        btnExit.setText("Exit");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setOpaque(true);
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 60, 40));

        lbBackgroundRed2.setBackground(new java.awt.Color(160, 40, 38));
        lbBackgroundRed2.setOpaque(true);
        getContentPane().add(lbBackgroundRed2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 550, 60));

        lbCombo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/combo 1.jpg"))); // NOI18N
        getContentPane().add(lbCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 450));

        lbCombo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/combo 2.jpg"))); // NOI18N
        getContentPane().add(lbCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 450));

        lbCombo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/combo 3.jpg"))); // NOI18N
        getContentPane().add(lbCombo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        lbBackground.setBackground(new java.awt.Color(255, 255, 255));
        lbBackground.setOpaque(true);
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbBackgroundRed1;
    private javax.swing.JLabel lbBackgroundRed2;
    private javax.swing.JLabel lbCombo1;
    private javax.swing.JLabel lbCombo2;
    private javax.swing.JLabel lbCombo3;
    private javax.swing.JLabel lbNameCombos;
    // End of variables declaration//GEN-END:variables
}
