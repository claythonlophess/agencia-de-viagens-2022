
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class NewClass {

    static ArrayList<Integer> c = new ArrayList();
    static ArrayList<Integer> b = new ArrayList();

    public static void cam(ArrayList<Integer> c1, ArrayList<Integer> b1) {

        // 0123456789
        // 9012345678
        b.add(c1.get(c1.size() - 1));

        for (int i = 0; i < 9; i++) {
            b1.add(c1.get(i));
        }
        
        String str = "";
        for (Integer integer : b1) {
            str += integer + ", ";
        }
        System.out.println(str);
        System.out.println("====");
        
        ArrayList<Integer> axu = c1;
        c = b1;
        for (int i = 0; i < b1.size(); i++) {
            b1.remove(i);
        }
        System.out.println(b1.size() + " jkkkkk");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }

        for (int i = 0; i < 3; i++) {
            cam(c, b);
        }

    }

}
