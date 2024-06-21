    package com.example.manyfieldsandkeyboard;

    import androidx.compose.foundation.background
    import androidx.compose.foundation.border
    import androidx.compose.foundation.layout.*
    import androidx.compose.foundation.rememberScrollState
    import androidx.compose.foundation.shape.RoundedCornerShape
    import androidx.compose.foundation.text.BasicTextField
    import androidx.compose.foundation.verticalScroll
    import androidx.compose.material3.Button
    import androidx.compose.material3.Text
    import androidx.compose.runtime.*
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.focus.onFocusChanged
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.graphics.SolidColor
    import androidx.compose.ui.platform.LocalDensity


    import androidx.compose.ui.unit.dp
    import kotlinx.coroutines.launch


    @Composable
    fun ManyTextFields () {
        val scrollState = rememberScrollState()

        val coroutineScope = rememberCoroutineScope()
        val imePadding = WindowInsets.ime


        BoxWithConstraints(modifier = Modifier
        .fillMaxSize())
    {//Самый внешний бокс
        val screenHeightPx = constraints.maxHeight.toFloat()
        val density = LocalDensity.current


        Box(modifier = Modifier.background(Color.Yellow).fillMaxWidth().height(50.dp)) {
            Text("Я заголовок")
        }
            Column(
                modifier = Modifier
                    .verticalScroll(scrollState)
                    .fillMaxSize()
            ) {

                Spacer(modifier = Modifier.height(200.dp))

                Box(Modifier.height(90.dp)) {
                    BasicTextField(
                        value = "0",
                        onValueChange = {},
                        modifier = Modifier
                            .onFocusChanged { focusState ->
                                if (focusState.isFocused) {
                                    coroutineScope.launch {

                                        val imeHeightPx =  imePadding.getBottom(density)
                                        //val scrollPosition = screenHeightPx - imeHeightPx - {90.dp.toPx()}
                                        val scrollPosition = screenHeightPx - imeHeightPx - density.run {90.dp.toPx()}
                                        scrollState.animateScrollTo(scrollPosition.toInt())
                                    }
                                }
                            }
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
                        BasicTextField(value = "24", onValueChange = {},
                            modifier = Modifier.onFocusChanged { focusState ->
                            if (focusState.isFocused) {
                                coroutineScope.launch {
                                    val imeHeightPx =  imePadding.getBottom(density)

                                    val scrollPosition = screenHeightPx - imeHeightPx - density.run {90.dp.toPx()}
                                    scrollState.animateScrollTo(scrollPosition.toInt())
                                }
                            }
                        }
                            )
                        Column {
                            Text("Hello Hi")
                            BasicTextField(value = "25", onValueChange = {})
                        }
                    }
                }
//                Spacer(modifier = Modifier.height(200.dp))

            }

       Box(
            modifier = Modifier
                .imePadding()
                .border(width = 5.dp, brush = SolidColor(Color.Red),shape = RoundedCornerShape(3.dp)                )
                .height(100.dp)
                .align(Alignment.BottomCenter)
                .background(Color.Blue)
        ) {

            Button(onClick = { /*TODO*/ }, modifier = Modifier.height(130.dp).fillMaxWidth()
            ) {
                Text(text = "I'm a button")
            }
        }

        } //конец внешнего бокса

    } //конец функции