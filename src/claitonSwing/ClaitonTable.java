/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claitonSwing;

import javax.swing.JLabel;

/**
 *
 * @author Administrator
 */
public class ClaitonTable extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public ClaitonTable() {
        initComponents();
        model(this);
    }

    public ClaitonTableModel getClaitonTable1() {
        return claitonTable1;
    }
    final void model(ClaitonTable claitonTable){
        claitonTable1.set(claitonTable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        claitonTable1 = new claitonSwing.ClaitonTableModel();
        scroll = new javax.swing.JPanel();
        up = new javax.swing.JLabel();
        down = new javax.swing.JLabel();

        setOpaque(false);

        scroll.setBackground(new java.awt.Color(0, 255, 102));
        scroll.setOpaque(false);

        up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/up_squared_20px.png"))); // NOI18N
        up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                upMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                upMouseExited(evt);
            }
        });

        down.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/drop_down_20px.png"))); // NOI18N
        down.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                downMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                downMouseExited(evt);
            }
        });

        javax.swing.GroupLayout scrollLayout = new javax.swing.GroupLayout(scroll);
        scroll.setLayout(scrollLayout);
        scrollLayout.setHorizontalGroup(
            scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(down)
            .addComponent(up, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        scrollLayout.setVerticalGroup(
            scrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scrollLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(up)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(down))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(claitonTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(claitonTable1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void upMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upMouseEntered
        up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/up_squared_20px_selected.png")));
    }//GEN-LAST:event_upMouseEntered

    private void downMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downMouseEntered
        down.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/drop_down_20px_Selected.png")));
    }//GEN-LAST:event_downMouseEntered

    private void downMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_downMouseExited
        down.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/drop_down_20px.png")));
    }//GEN-LAST:event_downMouseExited

    private void upMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upMouseExited
        up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/up_squared_20px.png")));
    }//GEN-LAST:event_upMouseExited

    public JLabel getDown() {
        return down;
    }

    public JLabel getUp() {
        return up;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private claitonSwing.ClaitonTableModel claitonTable1;
    private javax.swing.JLabel down;
    private javax.swing.JPanel scroll;
    private javax.swing.JLabel up;
    // End of variables declaration//GEN-END:variables

}
