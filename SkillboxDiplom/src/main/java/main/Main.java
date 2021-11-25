package main;

import main.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main
{

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
//        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
//                .addAnnotatedClass(User.class)
//                .buildSessionFactory();
//        Session session = factory.openSession();
//
//        session.save(new User(1,"Ivan"));

    }
}
