package table.cell;

import table.model.TableRowData;
import table.TableCustom;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CellAction extends TableCustomCell {

    public CellAction() {
        initComponents();
    }

    private void addEvent(TableCustom table, TableRowData data, int row) {
        cmdUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (data.isEditing()) {
                    table.cancelEditRowAt(row);
                    cmdUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png")));
                } else {
                    table.editRowAt(row);
                    cmdUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png")));
                }

            }
        });
        cmdDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                table.deleteRowAt(getRow(), true);
            }
        });
    }

    private void checkIcon(TableRowData data) {
        if (data.isEditing()) {
            cmdUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png")));
        } else {
            cmdUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png")));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdUpdate = new swing.Button();
        cmdDelete = new swing.Button();

        cmdUpdate.setText("Edit");

        cmdDelete.setText("delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cmdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button cmdDelete;
    private swing.Button cmdUpdate;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setData(Object data) {}

    @Override
    public Object getData() {
        return null;
    }

    @Override
    public Component createComponentCellRender(TableCustom table, TableRowData data, int row, int clumn) {
        CellAction cell = new CellAction();
        cell.checkIcon(data);
        cell.addEvent(table, data, row);
        return cell;
    }

    @Override
    public Component createComponentCellRenderOnEditor(TableCustom table, TableRowData data, int row, int column) {
        return null;
    }

    @Override
    public TableCustomCell createComponentCellEditor(TableCustom table, TableRowData data, Object cellData, int row, int column) {
        CellAction cell = new CellAction();
        cell.checkIcon(data);
        cell.addEvent(table, data, row);
        return cell;
    }
}
