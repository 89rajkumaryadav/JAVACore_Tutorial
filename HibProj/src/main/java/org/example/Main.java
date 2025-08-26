package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setsName("Raj");
        student.setRollNo(104);
        student.setsAge(35);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Student.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student);
        transaction.commit();
        session.close();
        sf.close();
        System.out.println(student);


    }
}



