package com.example.flightpasscollector

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.flightpasscollector.ui.theme.FlightPassCollectorTheme
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FlightPassCollectorTheme {
                Surface(color = androidx.compose.ui.graphics.Color.White) {
                    Greeting("FlightPass Collector")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Welcome, $name! ✈️")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FlightPassCollectorTheme {
        Greeting("FlightPass Collector")
    }
}