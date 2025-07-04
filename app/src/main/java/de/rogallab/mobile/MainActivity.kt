package de.rogallab.mobile

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeGestures
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import de.rogallab.mobile.domain.utilities.logDebug
import de.rogallab.mobile.ui.count.composables.CountScreen1
import de.rogallab.mobile.ui.count.composables.CountScreen2
import de.rogallab.mobile.ui.count.composables.CountScreen4
import de.rogallab.mobile.ui.count.composables.Stateholder
import de.rogallab.mobile.ui.theme.AppTheme

class MainActivity : BaseActivity(TAG) {
   override fun onCreate(savedInstanceState: Bundle?) {

      super.onCreate(savedInstanceState)

      enableEdgeToEdge()

      setContent {
         logDebug(TAG,"setContent() Composition")

         AppTheme {
            Scaffold(
               contentColor = MaterialTheme.colorScheme.onBackground,
               //contentWindowInsets = WindowInsets.safeDrawing,
               //contentWindowInsets = WindowInsets.safeContent,
               contentWindowInsets = WindowInsets.safeGestures,
               //   .add(WindowInsets.ime),  // Optional, for IME inset
               modifier = Modifier.fillMaxSize()
            ) { innerPadding ->
                  logDebug(TAG, "before CountScreen() Composition")
                  CountScreen1(
                     initCount = 0,
                     modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxWidth()
                  )
                  CountScreen2(
                     initCount = 0,
                     modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxWidth()
                  )
                  Stateholder(
                     initCount = 0,
                     modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxWidth()
                  )
                  CountScreen4(
                     modifier = Modifier
                        .padding(innerPadding)  // StateFlow
                        .fillMaxWidth()
                  )
            }
         }
      }
   }

   companion object {
      private const val TAG = "<-MainActivity"
      const val IS_INFO = true
      const val IS_DEBUG = true
      const val IS_VERBOSE = true
   }
}


//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//   Text(
//      text = "Hello $name!",
//      modifier = modifier
//   )
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
   AppTheme {

   }
}
