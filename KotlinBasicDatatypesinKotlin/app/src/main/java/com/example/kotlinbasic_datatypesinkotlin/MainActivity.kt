package com.example.kotlinbasic_datatypesinkotlin

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
import com.example.kotlinbasic_datatypesinkotlin.ui.theme.KotlinBasicDataTypesInKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinBasicDataTypesInKotlinTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Integer data types
    val byteValue: Byte = 42
    val shortValue: Short = 100
    val intValue: Int = 1000
    val longValue: Long = 1000000000L // Note the 'L' suffix for Long literals

    // Floating-point data types
    val floatValue: Float = 3.14f // Note the 'f' suffix for Float literals
    val doubleValue: Double = 2.71828

    // Boolean data type
    val isKotlinAwesome: Boolean = true

    // Character data type
    val grade: Char = 'A'

    // String data type
    val greeting: String = "Hello, Kotlin!"

    // Arrays
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val fruits: Array<String> = arrayOf("Apple", "Banana", "Cherry")

    // Nullable data types
    val nullableValue: String? = null

    // Printing values
    println("Byte: $byteValue")
    println("Short: $shortValue")
    println("Int: $intValue")
    println("Long: $longValue")
    println("Float: $floatValue")
    println("Double: $doubleValue")
    println("Boolean: $isKotlinAwesome")
    println("Char: $grade")
    println("String: $greeting")
    println("IntArray: ${numbers.joinToString()}")
    println("Array<String>: ${fruits.joinToString()}")
    println("Nullable Value: $nullableValue")
}

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinBasicDataTypesInKotlinTheme {
        Greeting("Android")
    }
}