package com.lab.jpa.repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CompanyDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (Exception e) {
            session = sessionFactory.openSession();
        }
        return session;
    }

    public List quaryAllDepts() {
        List list = getSession().createQuery("from Department d").list();
        return list;
    }

    public List quaryAllClub() {
        List list = getSession().createQuery("from Club c").list();
        return list;
    }

    public List quaryAllEmployee() {
        List list = getSession().createQuery("from Employee e").list();
        return list;
    }

}
