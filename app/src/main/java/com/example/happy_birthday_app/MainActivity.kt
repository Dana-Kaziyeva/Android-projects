package com.example.happy_birthday_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happy_birthday_app.ui.theme.Happy_Birthday_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Happy_Birthday_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    GreetingText(message = "Happy Birthday Teacher!", from = "from Dana")
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
@Composable
fun GreetingText(message : String, from: String = "from Dana", modifier: Modifier = Modifier){
    Column (modifier = modifier.padding(8.dp), verticalArrangement = Arrangement.Center){
        Text(
            text = message,
            fontSize = 97.sp,
            lineHeight = 100.sp,
            color = Color.Red,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            color = Color.White,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    Happy_Birthday_appTheme {
        GreetingText(message = "Happy Birthday Teacher!")

    }
}