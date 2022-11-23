package project;

import java.sql.Connection;

public class Work {

    public void insert(Listofpeopleinspace work) {
        Session session = Connection.getSession();
        session.getTransaction().begin();
        session.persist(worker);
        session.getTransaction().commit();
        session.close();
    }
}
