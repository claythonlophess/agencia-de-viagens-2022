package table.cell;

import model.ModelName;
import model.ModelStudent;
import table.model.TableRowData;
import table.TableCustom;
import java.awt.Component;
import model.funcionario;

public class CellNome1 extends TableCustomCell {

    public CellNome1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        image = new swing.ImageAvatar();
        cmdSave = new javax.swing.JButton();
        txtLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cartaojTextField6 = new javax.swing.JTextField();
        telefonejTextField = new javax.swing.JTextField();
        apelidojTextField = new javax.swing.JTextField();
        moradajTextField6 = new javax.swing.JTextField();
        nomejTextField1 = new javax.swing.JTextField();

        jLabel4.setText("Image");

        image.setBorderSize(2);
        image.setBorderSpace(0);
        image.setGradientColor1(new java.awt.Color(1, 232, 70));
        image.setGradientColor2(new java.awt.Color(101, 0, 255));
        image.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/p2.jpg"))); // NOI18N

        cmdSave.setText("Save");

        jLabel3.setText("Last Name");

        jLabel2.setText("First Name");

        telefonejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonejTextFieldActionPerformed(evt);
            }
        });

        apelidojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apelidojTextFieldActionPerformed(evt);
            }
        });

        nomejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomejTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(172, 172, 172))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cartaojTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(cmdSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apelidojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moradajTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(apelidojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(telefonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(moradajTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(cartaojTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmdSave)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void telefonejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonejTextFieldActionPerformed

    private void apelidojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apelidojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apelidojTextFieldActionPerformed

    private void nomejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomejTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apelidojTextField;
    private javax.swing.JTextField cartaojTextField6;
    private javax.swing.JButton cmdSave;
    private swing.ImageAvatar image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField moradajTextField6;
    private javax.swing.JTextField nomejTextField1;
    private javax.swing.JTextField telefonejTextField;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables

    public void addEventSave(TableCustom table) {
        
    }

    @Override
    public void setData(Object data) {
        if (data != null) {
            ModelName d = (ModelName) data;
            txtFirstName.setText(d.getFirstName());
            txtLastName.setText(d.getLastName());
        }
    }

    @Override
    public Object getData() {
        return new ModelName(txtFirstName.getText().trim(), txtLastName.getText().trim(), null);
    }

    @Override
    public Component createComponentCellRender(TableCustom table, TableRowData data, int row, int colum) {
       ModelStudent student = null;
        funcionario student1 = null;
       try {
            student = (ModelStudent) data;
             return new CellNameRender(student.getName());
        } catch (Exception e) {
            student1 = (funcionario) data;
             return new CellNameRender(student1.getName());
        }
       
    }

    @Override
    public TableCustomCell createComponentCellEditor(TableCustom table, TableRowData data, Object object, int row, int column) {
        CellNome1 cell = new CellNome1();
        cell.addEventSave(table);
        cell.setData(object);
        return cell;
    }
}
