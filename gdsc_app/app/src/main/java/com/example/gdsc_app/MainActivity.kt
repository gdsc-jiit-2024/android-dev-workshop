package com.example.gdsc_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdsc_app.ui.theme.Gdsc_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Gdsc_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun SplashScreen1(modifier: Modifier = Modifier){

    // load the image into a variable
    val image1 = painterResource(id = R.drawable.splash1)

    Box(
        // Box to encompass everything
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
    ){
        Column (

            // We have used Column widget to wrap the Texts
            // so we can modify its size and position
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            // Text Widget to show Text
            Text(
                text = "Buzz",
                color = Color.White,
                fontSize = 120.sp,
                fontWeight = FontWeight.Bold
            )


            // Text Widget to show Text
            Text(
                text = "Find people you vibe with!",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )
        }


            // Image widget to display Image
        Image(
            painter = image1,
            contentDescription = null,

            // Modifying the size of Image and position
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .align(Alignment.BottomCenter)
        )



        Column (
            // We have used Column widget to wrap the button
            // so we can modify its size and position
            // Modifying the size and positioning of the Button
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            // Button widget to show Button
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(10.dp)
                    .height(80.dp)
                    .fillMaxWidth()
            ) {

                // Text widget to show Text
                Text(
                    text = "Get Started Now!",
                    fontSize = 30.sp,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
    }

/** uncomment this to display another button in centre of the page
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(
            onClick = {},
            modifier = Modifier.height(60.dp)

            ) {
            Text(
                text = "Button 2",
                fontSize = 33.sp,
            )
        }
    } */

}


@Composable
fun SplashScreen2(modifier: Modifier = Modifier)
{
    Box {
        Column {
            Text(
                text = "Hello"
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Gdsc_appTheme {
        //Greeting("Android")

        // Write the name of fun here to preview
        SplashScreen1()
    }
}