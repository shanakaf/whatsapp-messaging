package com.shanaka.messaging.whatsapptest.controller;

import com.shanaka.messaging.whatsapptest.dto.WhatsappMessage;
import com.shanaka.messaging.whatsapptest.service.WhatappMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shanaka on 7/8/19.
 */

@RestController
@RequestMapping("/whatsapp")
public class WhatsappMessageController {

    @Value("${whatsapp.from.number}")
    String fromNumber;

    @Autowired
    private WhatappMessageService whatappMessageService;

    @PostMapping
    public void sendMessage(@RequestBody WhatsappMessage whatsappMessage){
        whatappMessageService.sendMessage(whatsappMessage.getToNumber(), fromNumber, whatsappMessage.getMessage());
    }
}
