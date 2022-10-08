package table.cell;

import table.model.TableRowData;
import table.TableCustom;

public class CellDisponibilidade extends TableCustomCell {

    public CellDisponibilidade() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jrNao = new javax.swing.JRadioButton();
        jrSim = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        buttonGroup1.add(jrNao);
        jrNao.setText("Nao");
        jrNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNaoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrSim);
        jrSim.setSelected(true);
        jrSim.setText("Sim");

        jLabel2.setText("Desponivel:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrNao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrSim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrNao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jrNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrNaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jrNao;
    private javax.swing.JRadioButton jrSim;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setData(Object data) {
        if (data.toString().equals("Sim")) {
            jrSim.setSelected(true);
        } else {
            jrNao.setSelected(true);
        }
    }

    @Override
    public Object getData() {
        return jrSim.isSelected() ? "Sim" : "Nao";
    }

    @Override
    public TableCustomCell createComponentCellEditor(TableCustom table, TableRowData data, Object cellData, int row, int column) {
        CellDisponibilidade cell = new CellDisponibilidade();
        cell.setData(cellData);
        return cell;
    }
}
