package com.example.astonintensiv5.utils

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.astonintensiv5.MainActivity
import com.example.astonintensiv5.R

fun Fragment.addFragment(fragment: Fragment) {
    val activity = requireActivity() as? MainActivity ?: error(getString(R.string.smth_went_wrong))
    activity
        .supportFragmentManager
        .beginTransaction()
        .replace(R.id.container, fragment)
        .addToBackStack(null)
        .commit()
}

fun RecyclerView.space(context: Context) {
    addItemDecoration(
        object : RecyclerView.ItemDecoration() {
            override fun getItemOffsets(
                outRect: Rect,
                view: View,
                parent: RecyclerView,
                state: RecyclerView.State
            ) {
                outRect.bottom =
                    context.resources.getDimension(R.dimen.everywhere_default_padding)
                        .toInt()
            }
        }
    )
}

fun RecyclerView.divider(context: Context) {
    val itemDecoration = DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
    ContextCompat.getDrawable(context, R.drawable.divider)?.let { itemDecoration.setDrawable(it) }
    addItemDecoration(itemDecoration)

}
