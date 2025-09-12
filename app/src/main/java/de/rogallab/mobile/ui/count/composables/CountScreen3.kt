package de.rogallab.mobile.ui.count.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import de.rogallab.mobile.domain.utilities.logDebug

@Composable
fun CountScreen3(
   count: Int,                                  // State ↓
   onIncrementCount: () -> Unit,                // Event ↑
   modifier: Modifier                           // Value
) {

   logDebug("<-CountScreen3", "Composition $count")

   ScreenContent(
      count = count,                             // State ↓
      onIncrementCount = { onIncrementCount() }, // Event ↑
      modifier = modifier
   )

}