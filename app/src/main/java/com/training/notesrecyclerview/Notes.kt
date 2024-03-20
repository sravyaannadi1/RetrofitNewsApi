package com.training.notesrecyclerview
import java.io.Serializable

enum class Priority{
    LOW, MEDIUM, HIGH
}
data class Notes (val notes:String,
                   val title:String,
                   val body: String,
                   val date_time: String,
                   val priority:Priority):Serializable