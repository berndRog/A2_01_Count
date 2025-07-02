package de.rogallab.mobile.ui.count.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.add
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.captionBar
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeGestures
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import de.rogallab.mobile.domain.utilities.logDebug
import de.rogallab.mobile.ui.count.CountViewModel

@Composable  // Stateless
fun CountScreen4(
   viewModel: CountViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
   modifier: Modifier
) {

   // Observe state changes of count, via StateFlow
   val countState: State<Int> =
      viewModel.countUiStateFlow.collectAsStateWithLifecycle()

   Column(
      modifier = modifier.fillMaxSize(),
   ) {
      logDebug("<-CountScreen4", "Composition ${countState.value}")

//      Text(
//         text = "${countState.value}",  // State
//         textAlign = TextAlign.Center,
//         modifier = Modifier
//            .border(border = BorderStroke(3.dp, Color.Gray))
//            .padding(vertical = 8.dp)
//            .fillMaxWidth()
//      )
//
//      Button(
//       //onClick = { viewModel.onIncrementCount() },  // Event
//         onClick =   viewModel::onIncrementCount,
//         modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth()
//      ) {
//         Text ( text = "Hochzählen" )
//      }


      ScreenContent(
         count = countState.value,                            // State ↓
         onCountIncrement = { viewModel.onIncrementCount() } // Event ↑
      )

   }
}
