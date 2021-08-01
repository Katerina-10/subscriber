package com.subscriber.service;

import com.subscriber.dao.MessageDAO;
import com.subscriber.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class MessageServiceImpl implements MessageService{

    @Autowired
    private MessageDAO messageDAO;

    @Override
    @Transactional
    public void saveMessage(Message message)  {
        messageDAO.saveMessage(message);
    }
}
