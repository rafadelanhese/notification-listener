package com.c6.notification_listener.message

data class NoteCreateMessage(
        val student: StudentMessage,
        val note: Int
){

}
