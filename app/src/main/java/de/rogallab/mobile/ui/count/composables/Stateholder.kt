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
   initCount: Int,
   modifier: Modifier
) {
   // Observable State,  state by delegate
   var count: Int by rememberSaveable {
      mutableIntStateOf(initCount) // value: observable
   }
   // State change
   fun onIncrementCount() {
      logDebug("<-StateHolder", "onIncrementCount()")
      count = count+1
   }

   CountScreen3(
      count = count,                             // State ↓
      onIncrementCount = { onIncrementCount() }, // Event ↑
      modifier = modifier
   )

}