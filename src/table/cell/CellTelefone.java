package table.cell;

import table.model.TableRowData;
import table.TableCustom;

public class CellTelefone extends TableCustomCell {

    public CellTelefone() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();

        jLabel2.setText("telefone:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTel, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setData(Object data) {
        if (data != null) {
            txtTel.setText(data.toString());
        }
    }

    @Override
    public Object getData() {
        return txtTel.getText().trim();
    }

    @Override
    public TableCustomCell createComponentCellEditor(TableCustom table, TableRowData data, Object cellData, int row, int column) {
        CellTelefone cell = new CellTelefone();
        cell.setData(cellData);
        return cell;
    }
}
