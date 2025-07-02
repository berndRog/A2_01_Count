package de.rogallab.mobile.ui.count.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
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
fun ScreenContent(
   count: Int,                   // state ↓
   onCountIncrement: () -> Unit  // event ↑
) {

   logDebug("<-ScreenContent", "Composition $count")

   Text(
      text = "$count",      // getter
      textAlign = TextAlign.Center,
      modifier = Modifier
         .border(border = BorderStroke(3.dp, Color.Gray))
         .padding(vertical = 8.dp)
         .fillMaxWidth()
   )

   Button(
      onClick = { onCountIncrement() },  // setter
      modifier = Modifier
         .padding(vertical = 8.dp)
         .fillMaxWidth()
   ) {
      Text ( text = "Hochzählen" )
   }

}