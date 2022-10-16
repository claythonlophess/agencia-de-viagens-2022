
import Dao.JpaUtil;
import bean.AeroportoMoz;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/*
 *  Autor:    Claiton Lopes Matavele 
 *  LinkedIn: https://www.linkedin.com/in/claiton-lopes-b47095160} 
 *  GitHub:   https://github.com/claythonlophess} 
 */

/**
 *
 * @author Administrator
 */
public class AdicionarAeroportos {
    public static void main(String[] args) {
         EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();

        AeroportoMoz v = new AeroportoMoz();
        v.setAeroporto("Pemba (POL, Moçambique)");
        v.setCapital("Pema");
        v.setProvincia("Cabo Delgado");
        v.setRegiao("Norte");
        manager.persist(v);
        
        tx.commit();
        manager.close();
        JpaUtil.close();
    }
}
