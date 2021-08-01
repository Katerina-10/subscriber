package com.subscriber.dao;

import com.subscriber.entity.Message;

public interface MessageDAO {
    public void saveMessage(Message message);  // парсинг и сохранение сообщений в таблицы БД
}
