package com.example.manyfieldsandkeyboard;

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ManyTextFields () {
    val scrollState = rememberScrollState()
    var focusedField by remember { mutableStateOf<Int?>(null) }
    var fieldValue by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize().verticalScroll(scrollState)) {


        Box (Modifier.height(90.dp)) {
            TextField(value = "0", onValueChange = {})
        }

        Box (Modifier.height(70.dp)) {
            Row(){
                Column {
                    Text("Hello Hello")
                    TextField(value = "1", onValueChange = {})
                }

            TextField(value = "2", onValueChange = {})
        }}

        Box (modifier = Modifier.height(105.dp)) {
            TextField(value = "3", onValueChange = {})
        }

        Box (modifier = Modifier.height(60.dp)) {
        Row () {
            TextField(value = "4", onValueChange = {}, modifier = Modifier.weight(1f))
            TextField(value = "5", onValueChange = {}, modifier = Modifier.weight(1f))
            TextField(value = "6", onValueChange = {}, modifier = Modifier.weight(1f))
        }}

        Box (Modifier.height(115.dp)) {
            Row(){
                TextField(value = "2", onValueChange = {})
                Column {
                    Text("Hello Hello")
                    TextField(value = "1", onValueChange = {})
                }
            }}

        Box (Modifier.height(50.dp)) {
            TextField(value = "10", onValueChange = {})
        }

        Box (modifier = Modifier.height(160.dp)) {
            Row () {
                TextField(value = "11", onValueChange = {}, modifier = Modifier.weight(1f))
                TextField(value = "12", onValueChange = {}, modifier = Modifier.weight(1f))
                TextField(value = "13", onValueChange = {}, modifier = Modifier.weight(1f))
                TextField(value = "14", onValueChange = {}, modifier = Modifier.weight(1f))
            }}

        Box (modifier = Modifier.height(75.dp)) {
            TextField(value = "3", onValueChange = {})
        }

        Box (Modifier.height(45.dp)) {
            TextField(value = "10", onValueChange = {})
        }

        Box (Modifier.height(70.dp)) {
            TextField(value = "10", onValueChange = {})
        }

        Box (modifier = Modifier.height(60.dp)) {
            Row () {
                TextField(value = "22", onValueChange = {}, modifier = Modifier.weight(1f))
                TextField(value = "23", onValueChange = {}, modifier = Modifier.weight(1f))
            }}

        Box (Modifier.height(115.dp)) {
            Row(){
                TextField(value = "24", onValueChange = {})
                Column {
                    Text("Hello Hi")
                    TextField(value = "25", onValueChange = {})
                }
            }}

        Box (Modifier.height(90.dp)) {
            TextField(value = "0", onValueChange = {})
        }

        Box (Modifier.height(70.dp)) {
            Row(){
                Column {
                    Text("Hello Hello")
                    TextField(value = "1", onValueChange = {})
                }

                TextField(value = "2", onValueChange = {})
            }}

        Box (modifier = Modifier.height(105.dp)) {
            TextField(value = "3", onValueChange = {})
        }

        Box (modifier = Modifier.height(60.dp)) {
            Row () {
                TextField(value = "4", onValueChange = {}, modifier = Modifier.weight(1f))
                TextField(value = "5", onValueChange = {}, modifier = Modifier.weight(1f))
                TextField(value = "6", onValueChange = {}, modifier = Modifier.weight(1f))
            }}

        Box (Modifier.height(115.dp)) {
            Row(){
                TextField(value = "2", onValueChange = {})
                Column {
                    Text("Hello Hello")
                    TextField(value = "1", onValueChange = {})
                }
            }}

        Box (Modifier.height(50.dp)) {
            TextField(value = "10", onValueChange = {})
        }

        Box (modifier = Modifier.height(160.dp)) {
            Row () {
                TextField(value = "11", onValueChange = {}, modifier = Modifier.weight(1f))
                TextField(value = "12", onValueChange = {}, modifier = Modifier.weight(1f))
                TextField(value = "13", onValueChange = {}, modifier = Modifier.weight(1f))
                TextField(value = "14", onValueChange = {}, modifier = Modifier.weight(1f))
            }}

        Box (modifier = Modifier.height(75.dp)) {
            TextField(value = "3", onValueChange = {})
        }

        Box (Modifier.height(45.dp)) {
            TextField(value = "10", onValueChange = {})
        }

        Box (Modifier.height(70.dp)) {
            TextField(value = "10", onValueChange = {})
        }

        Box (modifier = Modifier.height(60.dp)) {
            Row () {
                TextField(value = "22", onValueChange = {}, modifier = Modifier.weight(1f))
                TextField(value = "23", onValueChange = {}, modifier = Modifier.weight(1f))
            }}

        Box (Modifier.height(115.dp)) {
            Row(){
                TextField(value = "24", onValueChange = {})
                Column {
                    Text("Hello Hi")
                    TextField(value = "25", onValueChange = {})
                }
            }}



    }
}