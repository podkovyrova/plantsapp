package com.example.plants.screen

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.plants.MainActivity
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KButton
import com.example.plants.R
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView

object MainScreen : KScreen<MainScreen>() {
    override val layoutId: Int? = R.layout.activity_main
    override val viewClass: Class<*>? = MainActivity::class.java

    val button = KButton { withId(R.id.button) }
}