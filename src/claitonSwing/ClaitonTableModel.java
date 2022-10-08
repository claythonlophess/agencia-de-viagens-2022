/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claitonSwing;

import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import main.RowClainton;
import view.clientes.voosSugestao;

public class ClaitonTableModel extends javax.swing.JPanel {

    private ArrayList<ClaitonTitleColumm> TitleColumm = new ArrayList<>();
    private ArrayList<RowClainton> ListaRowClainton = new ArrayList<>();
    //  private RowClainton rowModel;
    private int yh = 0;
    private int yh0 = 0;
    private int yh1 = 0;
    private JScrollPane JScrollPane = new JScrollPane(this);
    private ClaitonTable claitonTable;
    private int index = 0;

    public ClaitonTableModel() {
        initComponents();;
        setOpaque(false);
        // rowModel = new RowClainton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        p2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        p2.setBackground(new java.awt.Color(0, 204, 255));

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    // End of variables declaration//GEN-END:variables
    /**
     * addiciona uma nova coluna
     *
     * @param Texto
     */
    public void addTitleColum(String Texto) {
        ClaitonTitleColumm t = new ClaitonTitleColumm();
        t.getjLabel1().setText(Texto);
        p1.add(t);
        TitleColumm.add(t);
        int j = 0;
        for (int i = 0; i < TitleColumm.size(); i++) {
            TitleColumm.get(i).setBounds(j, 0, getWidth() / TitleColumm.size(), 38);
            j += getWidth() / TitleColumm.size();
        }
        yh0 = TitleColumm.get(0).getHeight();

    }

    public ArrayList<ClaitonTitleColumm> getTitleColumm() {
        return TitleColumm;
    }

    /**
     * adiciona uma linha de texto
     */
    public void addRow() {
        int j = 0;
        RowClainton rowModel = new RowClainton();
        rowModel.setIndex(index);
        index++;
        ClaitonRow linha = new ClaitonRow();
        linha.setBounds(j, yh, getWidth(), 38);

        for (int i = 0; i < TitleColumm.size(); i++) {
            ClaitonColumm coluna = new ClaitonColumm();

            rowModel.getListaColumRow().add(coluna);
            coluna.setBounds(j, 0, (linha.getWidth() / TitleColumm.size()), 38);
            j += getWidth() / TitleColumm.size();
            linha.add(coluna);
        }

        rowModel.setRow(linha);

        p2.add(linha);

        yh += 38;
        ListaRowClainton.add(rowModel);

    }

    /**
     * adiciona uma linha de texto com altura definida
     */
    public void addRow(int altura) {
        int j = 0;
        RowClainton rowModel = new RowClainton();
        rowModel.setIndex(index);
        index++;
        ClaitonRow linha = new ClaitonRow();
        linha.setBounds(j, yh, getWidth(), altura);

        for (int i = 0; i < TitleColumm.size(); i++) {
            ClaitonColumm coluna = new ClaitonColumm();

            rowModel.getListaColumRow().add(coluna);
            coluna.setBounds(j, 0, (linha.getWidth() / TitleColumm.size()), altura);
            j += getWidth() / TitleColumm.size();
            linha.add(coluna);
        }

        rowModel.setRow(linha);

        p2.add(linha);

        yh += altura;
        ListaRowClainton.add(rowModel);

    }

    /**
     * adiciona uma linha com jpanel e altura
     *
     * @param jPanel
     * @param altura
     */
    public void addRowJpanel(JPanel jPanel, int altura) {
        int j = 0;
        RowClainton rowModel = new RowClainton();
        rowModel.setIndex(index);
        index++;
        ClaitonRow linha = new ClaitonRow(jPanel);
        linha.setBounds(j, yh, getWidth(), altura);
        jPanel.setBounds(j, 0, getWidth(), altura);
        for (int i = 0; i < TitleColumm.size(); i++) {
            ClaitonColumm coluna = new ClaitonColumm();

            rowModel.getListaColumRow().add(coluna);
            coluna.setBounds(j, 0, (linha.getWidth() / TitleColumm.size()), altura);
            j += getWidth() / TitleColumm.size();
            linha.add(coluna);
        }
        rowModel.setRow(linha);
        rowModel.setJpanel(jPanel);
        p2.add(linha);
        p2.repaint();
        yh += altura;
        ListaRowClainton.add(rowModel);
    }

    /**
     * atualiza os elementos da tabela
     */
    public void atualizar() {
        int j = 0;
        yh = 0;
        for (RowClainton rowClainton : ListaRowClainton) {
            rowClainton.getRow().setBounds(j, yh, getWidth(), rowClainton.getRow().getHeight());
            yh += rowClainton.getRow().getHeight();
        }
        removeAll1();
        for (RowClainton rowClainton : ListaRowClainton) {
            p2.add(rowClainton.getRow());
        }
        p2.repaint();
    }

    /**
     * retorna a tabela
     */
    public JPanel getTabble() {
        return p2;
    }

    /**
     *
     * @param row1 index da linha
     * @param columm imdex da coluna
     * @param texto o texto ou imagem
     * @param srcIcon o caminho da imagem
     */
    public void getRowElement(int row1, int columm, String texto, String srcIcon) {
        for (RowClainton rc : ListaRowClainton) {
            if (rc.getIndex() == row1) {
                rc.getListaColumRow().get(columm).getjLabel1().setText(texto);
                try {
                    rc.getListaColumRow().get(columm).getjLabel1().setIcon(new javax.swing.ImageIcon(getClass().getResource(srcIcon)));
                } catch (Exception e) {
                }
            }
        }
    }

    /**
     * adiciona bordas
     *
     * @param MatteBorder1
     */
    public void setRowBorder(Border MatteBorder1) {
        for (RowClainton rc : ListaRowClainton) {
            for (int i = 0; i < rc.getListaColumRow().size(); i++) {
                try {
                    rc.getListaColumRow().get(i).getjLabel1().setBorder(MatteBorder1);
                } catch (Exception e) {
                }
            }

        }
    }

    /**
     * retorna a linha de texto
     */
    public ClaitonRow getRow(int i) {
        for (RowClainton rc : ListaRowClainton) {
            if (rc.getIndex() == i) {
                return rc.getRow();
            }
        }
        return null;
    }

    /**
     * retorna a linha do jpanel
     */
    public JPanel getRowJpanel(int i) {
        for (RowClainton rc : ListaRowClainton) {
            if (rc.getIndex() == i) {
                return rc.getJpanel();

            }
        }
        return null;
    }

    /**
     * retorna a coluna
     *
     * @param i
     * @return ClaitonColumm
     */
    public ClaitonColumm getRowColuna(int i) {
        ListaRowClainton.get(i).getRow();
        for (RowClainton rc : ListaRowClainton) {
            if (rc.getIndex() == i) {
                return (ClaitonColumm) rc.getRow().getComponent(i);

            }
        }
        return null;
    }

    /**
     * remove o elemento na linha @param row1 e na coluna @param columm
     *
     * @param texto
     * @param srcIcon
     */
    public void removeRowElement(int row1, int columm, String texto, String srcIcon) {
        for (RowClainton rc : ListaRowClainton) {
            if (rc.getIndex() == row1) {
                ListaRowClainton.remove(rc);
            }
        }
    }

    /**
     * remove uma linha de painel
     *
     * @param index
     */
    public void removeRowElement(int index) {
        for (RowClainton rc : ListaRowClainton) {
            if (rc.getIndex() == index) {
                ListaRowClainton.remove(rc);
                atualizar();
                return;
            }
        }
    }

    void set(ClaitonTable claitonTable) {
        this.claitonTable = claitonTable;
        this.claitonTable.getUp().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moveUp();
            }
        });

        this.claitonTable.getDown().addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moveDown();

            }
        });
    }

    /**
     * remove todas as linhas
     */
    void removeAll1() {
        p2.removeAll();
        p2.repaint();
    }

    void moveUp() {
        ArrayList<RowClainton> lr = ListaRowClainton;
        int x = lr.size() - 1;
        Rectangle ultimo = lr.get(0).getRow().getBounds();
        lr.get(0).getRow().setBounds(lr.get(x).getRow().getBounds());
        for (RowClainton c : lr) {
            if (x != 1) {
                if (x != 0) {
                    lr.get(x).getRow().setBounds(lr.get(x - 1).getRow().getBounds());
                }
            } else if (x == 1) {
                lr.get(1).getRow().setBounds(ultimo);
            }
            x--;
        }

        ListaRowClainton = new ArrayList<>();

        for (int i = 1; i < lr.size(); i++) {
            ListaRowClainton.add(lr.get(i));
        }
        ListaRowClainton.add(lr.get(0));

        removeAll1();

        for (RowClainton rowClainton : ListaRowClainton) {
            p2.add(rowClainton.getRow());
        }
        p2.repaint();
    }

    void moveUp(int index) {
        ArrayList<RowClainton> lr = ListaRowClainton;
        
        for (RowClainton rc : ListaRowClainton) {
            if (rc.getIndex() == index) {
                ListaRowClainton.remove(rc);
                System.out.println(ListaRowClainton.size() + " tm");
                atualizar();
            }
        }
        int x = lr.size() - 1;
        Rectangle ultimo = lr.get(0).getRow().getBounds();
        lr.get(0).getRow().setBounds(lr.get(x).getRow().getBounds());
        
        
        for (RowClainton c : lr) {
            if (x != 1) {
                if (x != 0) {
                    lr.get(x).getRow().setBounds(lr.get(x - 1).getRow().getBounds());
                }
            } else if (x == 1) {
                lr.get(1).getRow().setBounds(ultimo);
            }
            x--;
        }

        ListaRowClainton = new ArrayList<>();

        for (int i = 1; i < lr.size(); i++) {
            ListaRowClainton.add(lr.get(i));
        }
        ListaRowClainton.add(lr.get(0));

        removeAll1();

        for (RowClainton rowClainton : ListaRowClainton) {
            p2.add(rowClainton.getRow());
        }
        p2.repaint();
    }

    void moveDown() {
        ArrayList<RowClainton> lr = ListaRowClainton;
        ListaRowClainton = new ArrayList<>();
        Rectangle ultimo = lr.get(lr.size() - 1).getRow().getBounds();
        lr.get(lr.size() - 1).getRow().setBounds(lr.get(0).getRow().getBounds());
        ListaRowClainton.add(lr.get(lr.size() - 1));
        for (int i = 0; i < lr.size() - 1; i++) {
            lr.get(i).getRow().setBounds(lr.get(i + 1).getRow().getBounds());
            if (i == lr.size() - 2) {
                lr.get(i).getRow().setBounds(ultimo);
            }
            ListaRowClainton.add(lr.get(i));
        }
        removeAll1();
        for (RowClainton rowClainton : ListaRowClainton) {
            p2.add(rowClainton.getRow());
        }
        p2.repaint();
    }

}
