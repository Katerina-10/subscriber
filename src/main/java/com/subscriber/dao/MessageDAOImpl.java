package com.subscriber.dao;

import com.subscriber.entity.Message;
import com.subscriber.entity.Purchase;
import com.subscriber.entity.Subscripton;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageDAOImpl implements MessageDAO {

    @Autowired
    private SessionFactory sessionFactory;  // подключение к БД

    @Override
    public void saveMessage(Message message) { // парсинг и сохранение в БД
        Session session = sessionFactory.getCurrentSession();
        if (message.getAction().equals("PURCHASE")) {
            Purchase purchase = new Purchase(message.getMsisdn(), message.getTimestamp());
            session.save(purchase);
        }
        else if (message.getAction().equals("SUBSCRIPTION")) {
            Subscripton subscripton = new Subscripton(message.getMsisdn(), message.getTimestamp());
            session.save(subscripton);
        }
    }
}
