package com.subscriber.controller;

import com.subscriber.entity.Message;
import com.subscriber.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/messages") //url адрес post запроса
    public Message addMessage(@RequestBody Message message) {
        messageService.saveMessage(message);
        return message;
    }
}
