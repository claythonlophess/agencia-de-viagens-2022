package view.adm;

import view.clientes.voosSugestao;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        //for (int i = 0; i < 4; i++) {
        newJPanel1.getClaitonTable1().addTitleColum("novo ");
        //    }
        voosSugestao linha;
        //   for (int i = 0; i < 2; i++) {

        voosSugestao linha1 = new voosSugestao();
        newJPanel1.getClaitonTable1().addRowJpanel(linha1,74);

        voosSugestao linha2 = new voosSugestao();
        newJPanel1.getClaitonTable1().addRowJpanel(linha2,74);
        linha = new voosSugestao();
        newJPanel1.getClaitonTable1().addRowJpanel(linha,74);

        //   }
//
//        newJPanel1.getClaitonTable1().getRowElement(0, 0, "bom dia " + 0, "/com/raven/icon/up_squared_20px.png");
//        newJPanel1.getClaitonTable1().getRowElement(0, 1, "bom dia " + 0, "/com/raven/icon/up_squared_20px.png");
//        newJPanel1.getClaitonTable1().getRowElement(0, 2, "bom dia " + 0, "/com/raven/icon/up_squared_20px.png");
//        newJPanel1.getClaitonTable1().getRowElement(0, 3, "bom dia " + 0, "/com/raven/icon/up_squared_20px.png");
//        
//        newJPanel1.getClaitonTable1().getRowElement(1, 0, "bom dia " + 1, null);
//        newJPanel1.getClaitonTable1().getRowElement(2, 0, "bom dia " + 2, null);
//        newJPanel1.getClaitonTable1().getRowElement(3, 0, "bom dia " + 3, null);
//        newJPanel1.getClaitonTable1().getRowElement(4, 0, "bom dia " + 4, null);
//        newJPanel1.getClaitonTable1().getRowElement(5, 0, "bom dia " + 5, null);
//        newJPanel1.getClaitonTable1().getRowElement(6, 0, "bom dia " + 6, null);
//        newJPanel1.getClaitonTable1().getRowElement(4, 0, "bom dia " + 4,null);
//        newJPanel1.getClaitonTable1().getRowElement(4, 0, "bom dia " + 4,null);
//        newJPanel1.getClaitonTable1().getRowElement(4, 0, "bom dia " + 4,"/com/raven/icon/up_squared_20px.png");
//        for (int i = 0; i < 9; i++) {
//            ClaitonNotification d = new ClaitonNotification("dskjfgvkgsxzlukcshdslkshdauilsagfuygsauydghajssgs");
//            d.setBounds(0, i * 40, 500, 30);
//            add(d);
//            d.setVisible(true);
//        }
//        ClaitonPersonalDate v = new ClaitonPersonalDate();
//        int x = newJPanel1.getClaitonTable1().getRow(1).getX();
//        int x1 = newJPanel1.getClaitonTable1().getRow(1).getY();
//        int x2 = newJPanel1.getClaitonTable1().getRow(1).getWidth();
//        int x3 = 300;
//        v.setBounds(x, x1, x2, x3);
//        v.setVisible(true);
//        newJPanel1.getClaitonTable1().getTabble().add(v);
//        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newJPanel1 = new claitonSwing.ClaitonTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(newJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(newJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private claitonSwing.ClaitonTable newJPanel1;
    // End of variables declaration//GEN-END:variables
}
