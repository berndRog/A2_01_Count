package de.rogallab.mobile.ui.count.composables

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import de.rogallab.mobile.ui.count.CountViewModel

@Composable  // Stateless
fun CountScreen4(
   viewModel: CountViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
   modifier: Modifier
) {

   // Observe state changes of count, via StateFlow
   val countState: State<Int> =
      viewModel.countUiStateFlow.collectAsStateWithLifecycle()


   ScreenContent(
      count = countState.value,                            // State ↓
      onIncrementCount = { viewModel.onIncrementCount() }, // Event ↑
      modifier = modifier
   )


}
