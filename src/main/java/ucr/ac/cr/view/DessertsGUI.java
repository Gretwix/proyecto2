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
public class DessertsGUI extends javax.swing.JFrame {

    private int dessert;
    /**
     * Creates new form DessertsGUI
     */
    public DessertsGUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        dessert=1;
        inicio();
    }

    public void listen(ActionListener controller)
    {
        this.btnExit.addActionListener(controller);
        this.btnNext.addActionListener(controller);
    }
     
     public void nextDessert(){
         dessert++;
         
         if(dessert==1){
            inicio();
         }
         if(dessert==2){
             jLabelText.setText("Napoleón");
             jLabel1.setVisible(false);
             jLabel2.setVisible(true);
         }
         if(dessert==3){
             inicio();
             dessert=1;
         }
         
     }
     
     public void inicio(){
          jLabelText.setText("Chesscurds");
             jLabel1.setVisible(true);
             jLabel2.setVisible(false);
             
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
        btnExit = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelText.setFont(new java.awt.Font("Segoe UI Semibold", 3, 24)); // NOI18N
        jLabelText.setText("Desserts");
        getContentPane().add(jLabelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, 40));

        btnExit.setText("Exit");
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 75, -1));

        btnNext.setText("Next");
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chesscurds.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 390));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Napoleón.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 390));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 530));

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
    private javax.swing.JLabel jLabelText;
    // End of variables declaration//GEN-END:variables
}
