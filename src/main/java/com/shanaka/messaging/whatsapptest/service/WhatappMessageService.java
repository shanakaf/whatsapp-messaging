package com.shanaka.messaging.whatsapptest.service;

import com.twilio.rest.api.v2010.account.Message;
import org.springframework.stereotype.Service;

/**
 * Created by shanaka on 7/8/19.
 */

@Service
public class WhatappMessageService {

    public void sendMessage(String to, String from, String messageBody) {

        String toNumber = "whatsapp:" + to;
        String fromNumber = "whatsapp:" + from;

        Message.creator(
                new com.twilio.type.PhoneNumber(toNumber),
                new com.twilio.type.PhoneNumber(fromNumber),
                messageBody)
                .create();
    }


}
