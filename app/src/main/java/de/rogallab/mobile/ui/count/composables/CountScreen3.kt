package de.rogallab.mobile.ui.count.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import de.rogallab.mobile.domain.utilities.logDebug

@Composable
fun CountScreen3(
   count: Int,                    // State ↓
   onIncrementCount: () -> Unit,  // Event ↑
   modifier: Modifier
) {
   Column(
      modifier = modifier.fillMaxSize()
   ) {
      logDebug("<-CountScreen3", "Composition $count")

//      Text(
//         text = "$count",
//         textAlign = TextAlign.Center,
//         modifier = Modifier
//            .border(border = BorderStroke(3.dp, Color.Gray))
//            .padding(vertical = 8.dp)
//            .fillMaxWidth()
//      )
//
//      Button(
//         onClick = { onIncrementCount() },
//         modifier = Modifier
//            .padding(vertical = 8.dp)
//            .fillMaxWidth()
//      ) {
//         Text ( text = "Hochzählen" )
//      }

      ScreenContent(
         count = count,                            // State ↓
         onCountIncrement = { onIncrementCount() } // Event ↑
      )
   }
}