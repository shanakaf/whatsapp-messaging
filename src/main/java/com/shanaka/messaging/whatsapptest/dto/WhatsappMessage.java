package com.shanaka.messaging.whatsapptest.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by shanaka on 7/8/19.
 */
@Getter
@Setter
public class WhatsappMessage {
    private String toNumber;
    private String message;
}
