package com.example.manyfieldsandkeyboard;

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@Composable
fun ManyTextFields () {
    val scrollState = rememberScrollState()

Box(){
    Column() {
        Column(
            modifier = Modifier
                .verticalScroll(scrollState)
        ) {


            Box(Modifier.height(90.dp)) {
                BasicTextField(
                    value = "0",
                    onValueChange = {},
                )
            }

            Box(Modifier.height(70.dp)) {
                Row() {
                    Column {
                        Text("Hello Hello")
                        BasicTextField(value = "1", onValueChange = {})
                    }

                    BasicTextField(value = "2", onValueChange = {})
                }
            }

            Box(modifier = Modifier.height(105.dp)) {
                BasicTextField(value = "3", onValueChange = {})
            }

            Box(modifier = Modifier.height(60.dp)) {
                Row() {
                    BasicTextField(value = "4", onValueChange = {}, modifier = Modifier.weight(1f))
                    BasicTextField(value = "5", onValueChange = {}, modifier = Modifier.weight(1f))
                    BasicTextField(value = "6", onValueChange = {}, modifier = Modifier.weight(1f))
                }
            }

            Box(Modifier.height(115.dp)) {
                Row() {
                    BasicTextField(value = "2", onValueChange = {})
                    Column {
                        Text("Hello Hello")
                        BasicTextField(value = "1", onValueChange = {})
                    }
                }
            }

            Box(Modifier.height(50.dp)) {
                BasicTextField(value = "10", onValueChange = {})
            }

            Box(modifier = Modifier.height(160.dp)) {
                Row() {
                    BasicTextField(value = "11", onValueChange = {}, modifier = Modifier.weight(1f))
                    BasicTextField(value = "12", onValueChange = {}, modifier = Modifier.weight(1f))
                    BasicTextField(value = "13", onValueChange = {}, modifier = Modifier.weight(1f))
                    BasicTextField(value = "14", onValueChange = {}, modifier = Modifier.weight(1f))
                }
            }

            Box(modifier = Modifier.height(75.dp)) {
                BasicTextField(value = "3", onValueChange = {})
            }

            Box(Modifier.height(45.dp)) {
                BasicTextField(value = "10", onValueChange = {})
            }

            Box(Modifier.height(70.dp)) {
                BasicTextField(value = "10", onValueChange = {})
            }

            Box(modifier = Modifier.height(60.dp)) {
                Row() {
                    BasicTextField(value = "22", onValueChange = {}, modifier = Modifier.weight(1f))
                    BasicTextField(value = "23", onValueChange = {}, modifier = Modifier.weight(1f))
                }
            }

            Box(Modifier.height(115.dp)) {
                Row() {
                    BasicTextField(value = "24", onValueChange = {})
                    Column {
                        Text("Hello Hi")
                        BasicTextField(value = "25", onValueChange = {})
                    }
                }
            }

            Box(Modifier.height(90.dp)) {
                BasicTextField(value = "0", onValueChange = {})
            }

            Box(Modifier.height(70.dp)) {
                Row() {
                    Column {
                        Text("Hello Hello")
                        BasicTextField(value = "1", onValueChange = {})
                    }

                    BasicTextField(value = "2", onValueChange = {})
                }
            }

            Box(modifier = Modifier.height(105.dp)) {
                BasicTextField(value = "3", onValueChange = {})
            }

            Box(modifier = Modifier.height(60.dp)) {
                Row() {
                    BasicTextField(value = "4", onValueChange = {}, modifier = Modifier.weight(1f))
                    BasicTextField(value = "5", onValueChange = {}, modifier = Modifier.weight(1f))
                    BasicTextField(value = "6", onValueChange = {}, modifier = Modifier.weight(1f))
                }
            }

            Box(Modifier.height(115.dp)) {
                Row() {
                    BasicTextField(value = "2", onValueChange = {})
                    Column {
                        Text("Hello Hello")
                        BasicTextField(value = "1", onValueChange = {})
                    }
                }
            }

            Box(Modifier.height(50.dp)) {
                BasicTextField(value = "10", onValueChange = {})
            }

            Box(modifier = Modifier.height(160.dp)) {
                Row() {
                    BasicTextField(value = "11", onValueChange = {}, modifier = Modifier.weight(1f))
                    BasicTextField(value = "12", onValueChange = {}, modifier = Modifier.weight(1f))
                    BasicTextField(value = "13", onValueChange = {}, modifier = Modifier.weight(1f))
                    BasicTextField(value = "14", onValueChange = {}, modifier = Modifier.weight(1f))
                }
            }

            Box(modifier = Modifier.height(75.dp)) {
                BasicTextField(value = "3", onValueChange = {})
            }

            Box(Modifier.height(45.dp)) {
                BasicTextField(value = "10", onValueChange = {})
            }

            Box(Modifier.height(70.dp)) {
                BasicTextField(value = "10", onValueChange = {})
            }

            Box(modifier = Modifier.height(60.dp)) {
                Row() {
                    BasicTextField(value = "22", onValueChange = {}, modifier = Modifier.weight(1f))
                    BasicTextField(value = "23", onValueChange = {}, modifier = Modifier.weight(1f))
                }
            }

            Box(Modifier.height(115.dp)) {
                Row() {
                    BasicTextField(value = "24", onValueChange = {})
                    Column {
                        Text("Hello Hi")
                        BasicTextField(value = "25", onValueChange = {})
                    }
                }
            }


        }
        Box(
            modifier = Modifier.border(
                width = 5.dp, brush = SolidColor(Color.Red),
                shape = RoundedCornerShape(3.dp)).height(130.dp)
        ) {
            Button(onClick = { /*TODO*/ }, modifier = Modifier.height(200.dp)) {
                Text(text = "I'm a button", modifier = Modifier.height(200.dp))
            }
        }
    } //конец внешней колонки
    } //конец внешнего бокса

} //конец функции