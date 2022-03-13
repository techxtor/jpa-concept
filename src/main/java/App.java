import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {

        Alien a1 = new Alien();
        a1.setaId(103);
        a1.setaName("Tiwari");
        a1.setaTech("Dot Net");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        // persist
        em.getTransaction().begin();
        em.persist(a1);
        em.getTransaction().commit();

        // fetch
        Alien a = em.find(Alien.class, 101);
        System.out.println(a);

    }
}
