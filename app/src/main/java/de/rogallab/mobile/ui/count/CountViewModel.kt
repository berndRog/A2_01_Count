package de.rogallab.mobile.ui.count

import androidx.lifecycle.ViewModel
import de.rogallab.mobile.domain.utilities.logDebug
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CountViewModel: ViewModel() {

   // Define a MutableStateFlow with the initial CountUiState
   private val _countUiStateFlow: MutableStateFlow<Int> =
      MutableStateFlow(0)  // factory method
   // Expose MutableStateFlow as a read-only StateFlow to the UI
   val countUiStateFlow: StateFlow<Int> =
      _countUiStateFlow.asStateFlow()

   // Increment the count value and update the MutableStateFlow
   // with a new CountUiState
   fun onIncrementCount() {
      _countUiStateFlow.update { count ->
         count + 1
      }
      logDebug(TAG, "onIncrementCount() count=${_countUiStateFlow.value}")

   }

   override fun onCleared() {
      super.onCleared()
   }

   companion object {
      private const val TAG = "<-CountViewModel"
   }

}