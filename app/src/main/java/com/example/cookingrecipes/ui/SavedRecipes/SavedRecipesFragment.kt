package com.example.cookingrecipes.ui.SavedRecipes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.cookingrecipes.R

class SavedRecipesFragment : Fragment() {

    private lateinit var savedRecipesModel: SavedRecipesModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        savedRecipesModel =
                ViewModelProviders.of(this).get(SavedRecipesModel::class.java)
        val root = inflater.inflate(R.layout.fragment_savedrecipes, container, false)
        val textView: TextView = root.findViewById(R.id.text_savedRecipes)
        savedRecipesModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}