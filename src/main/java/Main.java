import Entity.*;
import persistence.*;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Shop shop = new Shop();

        shop.setName("Molotok");
        shop.setRoom_area(60);
        shop.setShop_location("Something");

        session.save(shop);

        session.getTransaction().commit();
        System.out.println("Done");


    }
}
