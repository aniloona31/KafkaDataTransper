package com.realworlddatatransfer.dataconsumer.Consumers;

import com.realworlddatatransfer.dataconsumer.Service.wikimediaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class WikimediaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(WikimediaConsumer.class);

    @Autowired
    private wikimediaService service;

    @KafkaListener(topics = "wikimediaChanges",groupId = "myGroup")
    public void consumeEvents(String data){
        LOGGER.info(String.format("data is -> {}"),data);

        service.addData(data);
    }
}
