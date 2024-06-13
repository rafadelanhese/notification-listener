package com.c6.notification_listener.listener

import com.c6.notification_listener.message.NoteCreateMessage
import com.fasterxml.jackson.databind.ObjectMapper
import io.awspring.cloud.sqs.annotation.SqsListener
import org.springframework.stereotype.Service

@Service
class Listener {

    val mapper = ObjectMapper()

    @SqsListener(value = ["\${aws.sqs.queue}"])
    fun notificationQueueListener(message: String){
        //val noteMessage = mapper.readValue(message, NoteCreateMessage::class.java)
        println("New message received: $message")
        //println("New message mapped: $noteMessage")
    }
}