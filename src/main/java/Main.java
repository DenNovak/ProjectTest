import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        EntityManager entityManager = null;

        EntityManagerFactory entityManagerFactory = null;

        entityManagerFactory = Persistence.createEntityManagerFactory("hibernate-dynamic");
        //utworz entityManagera
        entityManager = entityManagerFactory.createEntityManager();

        //rozpocznij transakcje
        entityManager.getTransaction().begin();

        entityManager.getTransaction().commit();

        System.out.println("Done");

        entityManager.close();

    }
}
