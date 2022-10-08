 //Claiton lopes matavele info: LinkedIn: Quality and Reality
package view.adm;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JPopupMenu;
import swing.search.DataSearch;
import swing.search.EventClick;
import swing.search.PanelSearch;

 //Claiton lopes matavele info: LinkedIn: Quality and Reality
public class MotoristasJpanel extends javax.swing.JPanel {

    private JPopupMenu menu;
    private PanelSearch search;

    public MotoristasJpanel() {
        initComponents();
        initComponents();
        initComponents();
        connectToDatabase();
        menu = new JPopupMenu();
        search = new PanelSearch();
        menu.setBorder(BorderFactory.createLineBorder(new Color(164, 164, 164)));
        menu.add(search);
        menu.setFocusable(false);
        search.addEventClick(new EventClick() {
            @Override
            public void itemClick(DataSearch data) {
                menu.setVisible(false);
                txtSearch.setText(data.getText());
                addStory(data.getText());
            }

            @Override
            public void itemRemove(Component com, DataSearch data) {
                search.remove(com);
                removeHistory(data.getText());
                menu.setPopupSize(menu.getWidth(), (search.getItemSize() * 35) + 2);
                if (search.getItemSize() == 0) {
                    menu.setVisible(false);
                }
            }
        });
    }

    //Claiton lopes matavele info: LinkedIn: Quality and Reality
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        MenuprinciparButton12 = new javax.swing.JButton();
        bilhetesjButton14 = new javax.swing.JButton();
        arquivosjButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        MenuButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        txtSearch = new swing.search.MyTextField();
        form_Home1 = new form.Form_Home();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        jLabel10.setText("Agencia de Viagens");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 180, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 189, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 204));
        jLabel8.setText("GLENTRAVEL");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 182, 34));

        jPanelMenu.setBackground(new java.awt.Color(153, 153, 153));
        jPanelMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelMenuMouseEntered(evt);
            }
        });

        MenuprinciparButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/home_40px.png"))); // NOI18N
        MenuprinciparButton12.setText("INICIO");
        MenuprinciparButton12.setBorder(null);
        MenuprinciparButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuprinciparButton12MouseEntered(evt);
            }
        });
        MenuprinciparButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuprinciparButton12ActionPerformed(evt);
            }
        });

        bilhetesjButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/ticket_50px_1.png"))); // NOI18N
        bilhetesjButton14.setText("BILHETES");
        bilhetesjButton14.setBorder(null);
        bilhetesjButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bilhetesjButton14MouseEntered(evt);
            }
        });
        bilhetesjButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilhetesjButton14ActionPerformed(evt);
            }
        });

        arquivosjButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/icons8_moleskine_48px_2.png"))); // NOI18N
        arquivosjButton15.setText("ARQUIVOS");
        arquivosjButton15.setBorder(null);
        arquivosjButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                arquivosjButton15MouseEntered(evt);
            }
        });
        arquivosjButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arquivosjButton15ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/Logout_50px_1.png"))); // NOI18N
        jButton16.setText("SAIR");
        jButton16.setBorder(null);
        jButton16.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton16MouseEntered(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/icons8_around_the_globe_48px.png"))); // NOI18N
        jButton1.setText("VIAGENS");
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuprinciparButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bilhetesjButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(arquivosjButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(MenuprinciparButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(bilhetesjButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(arquivosjButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 670, -1));

        MenuButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/toolbar_50px.png"))); // NOI18N
        MenuButton1.setText("MENU");
        MenuButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuButton1MouseExited(evt);
            }
        });
        MenuButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(MenuButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 120, 40));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 580, 100));

        jPanel5.setBackground(new java.awt.Color(102, 255, 51));
        jPanel5.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel5ComponentHidden(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Adicionar Motorista");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, -1, -1));

        txtSearch.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel5.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 310, -1));
        jPanel5.add(form_Home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 940, -1));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 300, 10));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/Fundo.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 1140, 470));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/formacao_motorista_profissional_destaque.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setMaximumSize(new java.awt.Dimension(1320, 510));
        jLabel4.setMinimumSize(new java.awt.Dimension(1320, 510));
        jLabel4.setPreferredSize(new java.awt.Dimension(1320, 510));
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1480, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MenuprinciparButton12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuprinciparButton12MouseEntered
        jPanelMenu.setVisible(true);        //Claiton lopes matavele info: LinkedIn: Quality and Reality
    }//GEN-LAST:event_MenuprinciparButton12MouseEntered

    private void MenuprinciparButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuprinciparButton12ActionPerformed

        this.setVisible(false);// //Claiton lopes matavele info: LinkedIn: Quality and Reality
    }//GEN-LAST:event_MenuprinciparButton12ActionPerformed

    private void bilhetesjButton14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bilhetesjButton14MouseEntered
        jPanelMenu.setVisible(true);        //Claiton lopes matavele info: LinkedIn: Quality and Reality
    }//GEN-LAST:event_bilhetesjButton14MouseEntered

    private void bilhetesjButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilhetesjButton14ActionPerformed

    }//GEN-LAST:event_bilhetesjButton14ActionPerformed

    private void arquivosjButton15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arquivosjButton15MouseEntered
        jPanelMenu.setVisible(true);        //Claiton lopes matavele info: LinkedIn: Quality and Reality
    }//GEN-LAST:event_arquivosjButton15MouseEntered

    private void arquivosjButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arquivosjButton15ActionPerformed

    }//GEN-LAST:event_arquivosjButton15ActionPerformed

    private void jButton16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseEntered
        jPanelMenu.setVisible(true);        //Claiton lopes matavele info: LinkedIn: Quality and Reality
    }//GEN-LAST:event_jButton16MouseEntered

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        System.exit(0);        //Claiton lopes matavele info: LinkedIn: Quality and Reality
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jPanelMenu.setVisible(true);         //Claiton lopes matavele info: LinkedIn: Quality and Reality
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanelMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMenuMouseEntered
        jPanelMenu.setVisible(true);  //Claiton lopes matavele info: LinkedIn: Quality and Reality
    }//GEN-LAST:event_jPanelMenuMouseEntered

    private void MenuButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuButton1MouseEntered
        jPanelMenu.setVisible(true);        //Claiton lopes matavele info: LinkedIn: Quality and Reality
    }//GEN-LAST:event_MenuButton1MouseEntered

    private void MenuButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuButton1MouseExited
        jPanelMenu.setVisible(true);        //Claiton lopes matavele info: LinkedIn: Quality and Reality
    }//GEN-LAST:event_MenuButton1MouseExited

    private void MenuButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButton1ActionPerformed
        //Claiton lopes matavele info: LinkedIn: Quality and Reality
    }//GEN-LAST:event_MenuButton1ActionPerformed

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jPanelMenu.setVisible(false);        //Claiton lopes matavele info: LinkedIn: Quality and Reality
    }//GEN-LAST:event_jLabel1MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        form_Home1.addNovo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        if (search.getItemSize() > 0) {
            menu.show(txtSearch, 0, txtSearch.getHeight());
            search.clearSelected();
        }
    }//GEN-LAST:event_txtSearchMouseClicked

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            search.keyUp();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            search.keyDown();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = search.getSelectedText();
            txtSearch.setText(text);
            menu.setVisible(false);
        }
    }//GEN-LAST:event_txtSearchKeyPressed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if (evt.getKeyCode() != KeyEvent.VK_UP && evt.getKeyCode() != KeyEvent.VK_DOWN && evt.getKeyCode() != KeyEvent.VK_ENTER) {
            String text = txtSearch.getText().trim().toLowerCase();
            search.setData(search(text));
            if (search.getItemSize() > 0) {
                //  * 2 top and bot border
                menu.show(txtSearch, 0, txtSearch.getHeight());
                menu.setPopupSize(menu.getWidth(), (search.getItemSize() * 35) + 2);
            } else {
                menu.setVisible(false);
            }
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jPanel5ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel5ComponentHidden
        //Claiton lopes matavele info: LinkedIn: Quality and Reality
    }//GEN-LAST:event_jPanel5ComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MenuButton1;
    private javax.swing.JButton MenuprinciparButton12;
    private javax.swing.JButton arquivosjButton15;
    private javax.swing.JButton bilhetesjButton14;
    private form.Form_Home form_Home1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private swing.search.MyTextField txtSearch;
    // End of variables declaration//GEN-END:variables
 private List<DataSearch> search(String search) {
        List<DataSearch> list = new ArrayList<>();
        try {
            PreparedStatement p = con.prepareStatement("select DISTINCT ProductName, coalesce((select StoryID from story where ProductName=StoryName limit 1),'') as Story from product where ProductName like ? order by Story DESC, ProductName limit 7");
            p.setString(1, "%" + search + "%");
            ResultSet r = p.executeQuery();
            while (r.next()) {
                String text = r.getString(1);
                boolean story = !r.getString(2).equals("");
                list.add(new DataSearch(text, story));
            }
            r.close();
            p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    private void removeHistory(String text) {
        try {
            PreparedStatement p = con.prepareStatement("delete from story where StoryName=? limit 1");
            p.setString(1, text);
            p.execute();
            p.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection con;

    private void connectToDatabase() {
//        try {
//            String server = "localhost";
//            String port = "3305"; //  Default 3306
//            String database = "test";
//            String user = "";
//            String pass = "";
////            con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    private void addStory(String text) {
        try {
            boolean add = true;
            PreparedStatement p = con.prepareStatement("select StoryID from story where StoryName=? limit 1");
            p.setString(1, text);
            ResultSet r = p.executeQuery();
            if (r.first()) {
                add = false;
            }
            r.close();
            p.close();
            if (add) {
                p = con.prepareStatement("insert into story (StoryName) values (?)");
                p.setString(1, text);
                p.execute();
                p.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
