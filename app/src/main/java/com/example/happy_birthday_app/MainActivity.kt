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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happy_birthday_app.ui.theme.Happy_Birthday_appTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.layout.ContentScale

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
//                    GreetingText(message = "Happy Birthday Teacher!", from = "from Dana")
                    GreetingImage(message = "Happy Birthday Teacher!", from = "from Dana")
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
fun GreetingText(message : String = "Happy Birthday Teacher!", from: String = "from Dana", modifier: Modifier = Modifier){
    Column (modifier = modifier.padding(7.dp), verticalArrangement = Arrangement.Center){
        Text(
            text = message,
            fontSize = 90.sp,
            lineHeight = 100.sp,
            color = Color.Red,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 34.sp,
            color = Color.Blue,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier=Modifier){
    val image = painterResource(id = R.drawable.androidparty)
    Box{
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.7F
        )
        GreetingText(modifier = Modifier.fillMaxSize().padding(8.dp).fillMaxWidth())
    }

}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    Happy_Birthday_appTheme {
//        GreetingText()
        GreetingImage(message = "Happy Birthday Teacher!", from = "from Dana")

    }
}