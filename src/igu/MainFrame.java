/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igu;

import igu.compras.ComprasMainPanel;

/**
 *
 * @author Asullom
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        new ChangePanel(mainPanel, new ComprasMainPanel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        menubar = new javax.swing.JPanel();
        theButton3 = new igu.util.buttons.TheButton();
        theButton2 = new igu.util.buttons.TheButton();
        dp = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        theButton3.setBackground(new java.awt.Color(239, 238, 244));
        theButton3.setForeground(new java.awt.Color(128, 128, 131));
        theButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/icons/collection.png"))); // NOI18N
        theButton3.setText("NO REALIZADO");
        theButton3.setColorHover(new java.awt.Color(204, 204, 204));
        theButton3.setColorNormal(new java.awt.Color(239, 238, 244));
        theButton3.setColorPressed(new java.awt.Color(204, 204, 204));
        theButton3.setColorTextHover(new java.awt.Color(128, 128, 131));
        theButton3.setColorTextNormal(new java.awt.Color(128, 128, 131));
        theButton3.setColorTextPressed(new java.awt.Color(128, 128, 131));
        theButton3.setFocusable(false);
        theButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theButton3ActionPerformed(evt);
            }
        });

        theButton2.setForeground(new java.awt.Color(128, 128, 131));
        theButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/imgs/icons/market.png"))); // NOI18N
        theButton2.setText("TAREAS");
        theButton2.setColorHover(new java.awt.Color(204, 204, 204));
        theButton2.setColorNormal(new java.awt.Color(204, 204, 204));
        theButton2.setColorPressed(new java.awt.Color(204, 204, 204));
        theButton2.setColorTextHover(new java.awt.Color(128, 128, 131));
        theButton2.setColorTextNormal(new java.awt.Color(128, 128, 131));
        theButton2.setColorTextPressed(new java.awt.Color(128, 128, 131));
        theButton2.setFocusable(false);
        theButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                theButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menubarLayout = new javax.swing.GroupLayout(menubar);
        menubar.setLayout(menubarLayout);
        menubarLayout.setHorizontalGroup(
            menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menubarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(theButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(theButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menubarLayout.setVerticalGroup(
            menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(theButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(theButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dp.setBackground(new java.awt.Color(204, 204, 204));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new javax.swing.BoxLayout(mainPanel, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(mainPanel);

        javax.swing.GroupLayout dpLayout = new javax.swing.GroupLayout(dp);
        dp.setLayout(dpLayout);
        dpLayout.setHorizontalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
        );
        dpLayout.setVerticalGroup(
            dpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menubar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(menubar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void theButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theButton2ActionPerformed
        // TODO add your handling code here:
        new ChangePanel(mainPanel, new ComprasMainPanel());
    }//GEN-LAST:event_theButton2ActionPerformed

    private void theButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_theButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_theButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dp;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menubar;
    private igu.util.buttons.TheButton theButton2;
    private igu.util.buttons.TheButton theButton3;
    // End of variables declaration//GEN-END:variables
}
