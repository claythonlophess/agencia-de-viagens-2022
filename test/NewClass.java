
import Dao.CarroDao;
import Dao.JpaUtil;
import bean.Carro;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
 *  Autor:    Claiton Lopes Matavele 
 *  LinkedIn: https://www.linkedin.com/in/claiton-lopes-b47095160} 
 *  GitHub:   https://github.com/claythonlophess} 
 */
/**
 *
 * @author Administrator
 */
public class NewClass {

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
