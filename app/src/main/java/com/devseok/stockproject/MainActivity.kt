package com.devseok.stockproject

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
import com.devseok.stockproject.db.StockDatabase
import com.devseok.stockproject.feature.home.HomePage
import com.devseok.stockproject.feature.main.MainPage
import com.devseok.stockproject.feature.main.MainPageBaseVM
import com.devseok.stockproject.ui.theme.StockProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            MainPage()
           /* StockProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }*/
        }

        // ex
        /*var db: StockDatabase? = StockDatabase.getInstance(this)
        val stockData = db!!.stockRepository().findByAll()*/

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StockProjectTheme {
        Greeting("Android")
    }
}