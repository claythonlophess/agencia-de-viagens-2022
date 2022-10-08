/*
 *  Autor:    Claiton Lopes Matavele 
 *  LinkedIn: https://www.linkedin.com/in/claiton-lopes-b47095160} 
 *  GitHub:   https://github.com/claythonlophess} 
 */
package bean;

import Dao.JpaUtil;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Administrator
 */
public class jhjk {
    public static void main(String[] args) {
         EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();

        Carro c = new Carro();
        c.setMatricula("jn");
        c.setMarca("ds");
        c.setModelo("");
        
        manager.persist(c);
        tx.commit();
        manager.close();
        JpaUtil.close();
    }
}
