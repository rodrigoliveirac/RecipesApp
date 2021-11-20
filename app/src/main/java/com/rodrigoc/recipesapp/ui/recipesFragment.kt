package com.rodrigoc.recipesapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rodrigoc.recipesapp.R
import kotlinx.android.synthetic.main.fragment_recipes.view.*

class recipesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recipes, container, false)

        view.recyclerview.showShimmer()

        return view
    }
}