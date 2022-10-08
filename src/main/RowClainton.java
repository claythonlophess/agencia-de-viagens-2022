package main;

import claitonSwing.ClaitonRow;
import claitonSwing.ClaitonColumm;
import claitonSwing.ClaitonTitleColumm;
import java.util.ArrayList;
import javax.swing.JPanel;

public class RowClainton {

    private int index;
    private ClaitonTitleColumm title;
    private  ClaitonRow row;
    private  JPanel jpanel;
    private  ArrayList<ClaitonColumm> listaColumRow = new ArrayList<>();

    public RowClainton() {
        title = new ClaitonTitleColumm();
        row = new ClaitonRow();
    }
    public RowClainton(JPanel jPanel) {
        title = new ClaitonTitleColumm();
        row = new ClaitonRow();
        this.jpanel = jPanel;
    }

    public void setJpanel(JPanel jpanel) {
        this.jpanel = jpanel;
    }

    public JPanel getJpanel() {
        return jpanel;
    }

    public void setRow(ClaitonRow row) {
        this.row = row;
    }

    public void setListaColumRow(ArrayList<ClaitonColumm> listaColumRow) {
        this.listaColumRow = listaColumRow;
    }

    public int getIndex() {
        return index;
    }

    public ClaitonTitleColumm getTitle() {
        return title;
    }

    public ClaitonRow getRow() {
        return row;
    }

    public ArrayList<ClaitonColumm> getListaColumRow() {
        return listaColumRow;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setTitle(ClaitonTitleColumm title) {
        this.title = title;
    }

}
