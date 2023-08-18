package com.example.plants.screen

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.plants.R
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher

object PlantListScreen : KScreen<PlantListScreen>()  {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val rvPlants = KRecyclerView(
        builder = { withId(R.id.recyclerView) },
        itemTypeBuilder = { itemType(::PlantItemScreen) }
    )

    class PlantItemScreen(matcher: Matcher<View>) : KRecyclerItem<PlantItemScreen>(matcher) {
        val tvPlantTitle = KTextView(matcher) { withId(R.id.textView_title) }
        val tvPlantImage = KImageView(matcher) { withId(R.id.imageView) }
    }
}