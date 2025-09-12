//import androidx.compose.ui.test.junit4.createComposeRule
//import androidx.compose.ui.test.onNodeWithText
//import androidx.compose.ui.test.performClick
//import androidx.compose.ui.test.assertIsDisplayed
//import androidx.test.ext.junit.runners.AndroidJUnit4
//import de.rogallab.mobile.ui.count.composables.CountScreen1
//import org.junit.Rule
//import org.junit.Test
//import org.junit.runner.RunWith
//
//@RunWith(AndroidJUnit4::class)
//class CountScreen2Test {
//
//   @get:Rule
//   val composeTestRule = createComposeRule()
//
//   @Test
//   fun testCountScreen2() {
//      // Starte die Bildschirmkomposition
//      composeTestRule.setContent {
//         CountScreen1()
//      }
//
//      // verify the initial value of the text
//      composeTestRule.onNodeWithText("0").assertIsDisplayed()
//
//      // click the button
//      composeTestRule.onNodeWithText("Hochzählen").performClick()
//
//      // check the updated value of the text after the first click
//      composeTestRule.onNodeWithText("1").assertIsDisplayed()
//
//      // click the button again
//      composeTestRule.onNodeWithText("Hochzählen").performClick()
//
//      // Überprüfe den aktualisierten Wert des Textes nach dem zweiten Klick
//      composeTestRule.onNodeWithText("2").assertIsDisplayed()
//   }
//}
