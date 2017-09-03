/**
 * Copyright (c) 2010-present Abixen Systems. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.abixen.platform.core.application.service.impl;

import com.abixen.platform.common.interfaces.queue.message.QueueMessage;

import com.abixen.platform.core.application.service.QueueOperations;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.AmqpException;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RabbitMQOperationsImpl implements QueueOperations {

    @Override
    public void convertAndSend(String routingKey, QueueMessage rabbitMQMessage) throws AmqpException {
        log.info("This is mockup. The message has been sent.");
    }

}