package com.mansi.composedemo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mansi.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TextInput()
        }
    }

    @Composable
    fun DemoText(name: String) {
        Text(
            text = "Hello $name!"
        )
    }

    @Preview(showBackground = true, widthDp = 300, heightDp = 500)
    @Composable
    fun DemoTextPreview() {
         ComposeDemoTheme {
            DemoText("Android")
        }
    }

@Composable
fun TextInput(){
    val state = remember {
        mutableStateOf(" ")
    }
    TextField(value = state.value,
        onValueChange = {
           state.value = it
        },
        label = { Text(text = "Enter Message")}
        )
    }
}