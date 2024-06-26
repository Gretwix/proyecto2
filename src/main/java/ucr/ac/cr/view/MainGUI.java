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
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

       public void listen(ActionListener controller)
    {
        this.miTacos.addActionListener(controller);
        this.miBurritos.addActionListener(controller);
        this.miBeverages.addActionListener(controller);
        this.miDesserts.addActionListener(controller);
        this.miCombos.addActionListener(controller);
        this.miExit.addActionListener(controller);
        this.miOrder.addActionListener(controller);
        this.miSearch.addActionListener(controller);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miSearch = new javax.swing.JMenuItem();
        miOrder = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miBurritos = new javax.swing.JMenuItem();
        miTacos = new javax.swing.JMenuItem();
        miBeverages = new javax.swing.JMenuItem();
        miDesserts = new javax.swing.JMenuItem();
        miCombos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoMenu.png"))); // NOI18N

        jMenu1.setBackground(new java.awt.Color(164, 42, 39));
        jMenu1.setForeground(new java.awt.Color(238, 236, 208));
        jMenu1.setText("Home");
        jMenu1.setOpaque(true);

        miSearch.setBackground(new java.awt.Color(238, 236, 208));
        miSearch.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        miSearch.setText("Search");
        miSearch.setOpaque(true);
        jMenu1.add(miSearch);

        miOrder.setBackground(new java.awt.Color(238, 236, 208));
        miOrder.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        miOrder.setText("My Order");
        miOrder.setOpaque(true);
        jMenu1.add(miOrder);

        miExit.setBackground(new java.awt.Color(238, 236, 208));
        miExit.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        miExit.setText("Exit");
        miExit.setOpaque(true);
        jMenu1.add(miExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(164, 42, 39));
        jMenu2.setForeground(new java.awt.Color(238, 236, 208));
        jMenu2.setText("Menu");
        jMenu2.setOpaque(true);

        miBurritos.setBackground(new java.awt.Color(238, 236, 208));
        miBurritos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        miBurritos.setText("Burritos");
        miBurritos.setOpaque(true);
        jMenu2.add(miBurritos);

        miTacos.setBackground(new java.awt.Color(238, 236, 208));
        miTacos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        miTacos.setText("Tacos");
        miTacos.setOpaque(true);
        jMenu2.add(miTacos);

        miBeverages.setBackground(new java.awt.Color(238, 236, 208));
        miBeverages.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        miBeverages.setText("Beverages");
        miBeverages.setOpaque(true);
        jMenu2.add(miBeverages);

        miDesserts.setBackground(new java.awt.Color(238, 236, 208));
        miDesserts.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        miDesserts.setText("Desserts");
        miDesserts.setOpaque(true);
        jMenu2.add(miDesserts);

        miCombos.setBackground(new java.awt.Color(238, 236, 208));
        miCombos.setFont(new java.awt.Font("Segoe UI Semibold", 3, 14)); // NOI18N
        miCombos.setText("Combos");
        miCombos.setOpaque(true);
        jMenu2.add(miCombos);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miBeverages;
    private javax.swing.JMenuItem miBurritos;
    private javax.swing.JMenuItem miCombos;
    private javax.swing.JMenuItem miDesserts;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miOrder;
    private javax.swing.JMenuItem miSearch;
    private javax.swing.JMenuItem miTacos;
    // End of variables declaration//GEN-END:variables
}
