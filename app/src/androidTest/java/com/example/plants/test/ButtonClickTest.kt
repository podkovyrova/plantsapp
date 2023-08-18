package com.example.plants.test

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.plants.MainActivity
import com.example.plants.screen.MainScreen
import com.example.plants.screen.PlantListScreen
import com.kaspersky.kaspresso.kaspresso.Kaspresso
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest : TestCase(
    kaspressoBuilder = Kaspresso.Builder.simple()
) {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun buttonClickTest() = run {
        step("Найти кнопку и кликнуть на нее") {
            MainScreen {
                button {
                    isDisplayed()
                    hasText("ADD PLANT")
                    click()
                }
            }
        }

        step("Проверить, что появился новый элемент на экране") {
            PlantListScreen {
                Assert.assertEquals(1, rvPlants.getSize())
            }
        }
    }
}