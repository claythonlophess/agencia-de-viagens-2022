package form;

import component.Card;
import component.EditorCard;
import java.awt.Component;
import java.util.ArrayList;
import model.Model_Card;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import swing.ErrorJTextfield;
import swing.WrapLayout;
import swing.ScrollBar;

/**
 * painel uasado para desenhar os cards
 */
public class Form_Home extends javax.swing.JPanel {

    private ArrayList<Component> components;
    private ArrayList<ErrorJTextfield> ErrorJTextfield_List;
    private ArrayList<Component> componentsAux;

    public Form_Home() {
        initComponents();
        init();
    }

    private void init() {
        panel.setLayout(new WrapLayout(WrapLayout.LEADING));
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
        components = new ArrayList();
        for (int i = 0; i < 10; i++) {
            Card card = null;
            if (i % 2 == 0) {
                card = new Card(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/testing/1.jpg")), "Motortista " + i, "Leaning java\nswing ui design\nlike and Subscribe\nthank for watch"));
            } else {
                card = new Card(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/testing/2.jpg")), "Motortista " + i, "Leaning java\nswing ui design\nlike and Subscribe\nthank for watch"));
            }
            panel.add(card);
            components.add(card);
            card.getAcao1().getLblEditar().addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    isEditar();
                }
            });
            card.getAcao1().getLblApagar().addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    removerCard();
                }
            });
        }

        panel.revalidate();
        panel.repaint();
    }

    public void addCard() {
        panel.add(new Card(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/testing/2.jpg")), "Lean Java UI", "Leaning java\nswing ui design\nlike and Subscribe\nthank for watch")));
        panel.revalidate();
        panel.repaint();
    }
  

    public void remove() {
        panel.removeAll();
        panel.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(242, 242, 242));

        jScrollPane1.setBorder(null);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 895, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    public void isEditar() {
        EditorCard user = new EditorCard();
        user.editar();
        addLimparCampos(user);
        Component[] c = user.getComponents();
        ArrayList<ErrorJTextfield> d = user.getLista();
        user.getBtnEditar().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boolean validar = false;
                for (Component component : c) {
                    if (component instanceof JTextField) {
                        JTextField v = (JTextField) component;
                        if (v.getText().equals("")) {
                            Border b = v.getBorder();
                            v.setText("Campo Obrigatorio");
                            v.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 51, 0)));
                            v.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseEntered(java.awt.event.MouseEvent evt) {
                                    v.setBorder(b);
                                    v.setText("");
                                }
                            });
                            user.repaint();
                            validar = false;
                        }
                    } else {
                        validar = true;
                    }

                }
                if (validar) {
                    JOptionPane.showMessageDialog(null, "editado com sucesso");
                }

            }
        });
        user.getBtnCancelar().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerCard();
            }
        });

        int x = components.indexOf(obterCard());
        componentsAux = new ArrayList();
        panel.removeAll();
        components.forEach((component) -> {
            panel.add(component);
        });
        for (int i = 0; i < x; i++) {
            componentsAux.add(components.get(i));
        }
        componentsAux.add(user);
        for (int i = x + 1; i < components.size(); i++) {
            componentsAux.add(components.get(i));
        }
        panel.removeAll();
        for (int i = 0; i < componentsAux.size(); i++) {
            panel.add(componentsAux.get(i));
        }
        panel.repaint();
    }

    public void addNovo() {
        EditorCard user = new EditorCard();
        addLimparCampos(user);
        user.gravar();
        user.getBtnGravar().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                for (Component component : user.getComponents()) {
                    if (component instanceof JTextField) {
                        JTextField v = (JTextField) component;
                        if (v.getText().equals("")) {
                            Border b = v.getBorder();
                            v.setText("Campo Obrigatorio");
                            v.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 51, 0)));
                            v.addMouseListener(new java.awt.event.MouseAdapter() {
                                public void mouseEntered(java.awt.event.MouseEvent evt) {
                                    v.setBorder(b);
                                    v.setText("");
                                }
                            });
                            user.repaint();
                        }
                    }
                }
                addCard();
            }
        });
        user.getBtnCancelar().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerCard();
            }
        });

        panel.removeAll();
        panel.add(user);
        components.forEach((component) -> {
            panel.add(component);
        });
        panel.repaint();
        panel.updateUI();
    }

    public void addLimparCampos(EditorCard user) {
        user.getBtnLimpar().addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                for (Component component : user.getComponents()) {
                    if (component instanceof JTextField) {
                        JTextField v = (JTextField) component;
                        v.setText("");
                    }
                }
            }
        });

    }

    /**
     * apager card
     */
    public void removerCard() {
        components.remove(obterCard());
        panel.remove(obterCard());
        panel.repaint();
        panel.updateUI();
    }

    Component obterCard() {
        return panel.getComponentAt(panel.getMousePosition());
    }

}
