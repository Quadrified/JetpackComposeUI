package com.quadrified.jetpackcomposeui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.quadrified.jetpackcomposeui.ui.theme.JetpackComposeUiTheme

@Composable
fun ColumnRowBox(modifier: Modifier = Modifier) {
//    RowCompose()
//    ColumnCompose()
    BoxCompose()
}

@Composable
fun RowCompose(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Button(onClick = {}) {
            Text(text = "Button 1")
        }
        Button(onClick = {}) {
            Text(text = "Button 2")
        }
        Button(onClick = {}) {
            Text(text = "Button 3")
        }
    }
}

@Composable
fun ColumnCompose(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {}) {
            Text(text = "Button 1")
        }
        Button(onClick = {}) {
            Text(text = "Button 2")
        }
        Button(onClick = {}) {
            Text(text = "Button 3")
        }
    }
}

@Composable
fun BoxCompose(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
    ) {
        Button(modifier = Modifier.align(Alignment.Center), onClick = {}) {
            Text(text = "Button 1")
        }
        Button(modifier = Modifier.align(Alignment.TopStart), onClick = {}) {
            Text(text = "Button 2")
        }
        Button(modifier = Modifier.align(Alignment.TopEnd),onClick = {}) {
            Text(text = "Button 3")
        }
        Button(modifier = Modifier.align(Alignment.BottomStart),onClick = {}) {
            Text(text = "Button 4")
        }
        Button(modifier = Modifier.align(Alignment.BottomEnd),onClick = {}) {
            Text(text = "Button 5")
        }
        Button(modifier = Modifier.align(Alignment.CenterStart),onClick = {}) {
            Text(text = "Button 6")
        }
        Button(modifier = Modifier.align(Alignment.CenterEnd),onClick = {}) {
            Text(text = "Button 7")
        }
    }
}

@Preview
@Composable
private fun ColumnRowBoxPreview() {
    JetpackComposeUiTheme {
        ColumnRowBox()
    }
}