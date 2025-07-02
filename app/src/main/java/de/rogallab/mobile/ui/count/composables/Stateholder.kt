package de.rogallab.mobile.ui.count.composables

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import de.rogallab.mobile.domain.utilities.logDebug

@Composable  // Stateful
fun Stateholder(
   modifier: Modifier
) {

   // State: observer pattern, state by delegate
   var count: Int by rememberSaveable {
      mutableIntStateOf(0) // value: observable
   }
   // State change
   fun onIncrementCount(): Unit {
      logDebug("<-StateHolder", "onIncrementCount()")
      count = count+1
   }

   CountScreen3(
      count = count,                             // State ↓
      onIncrementCount = { onIncrementCount() }, // Event ↑
      modifier = modifier
   )

}