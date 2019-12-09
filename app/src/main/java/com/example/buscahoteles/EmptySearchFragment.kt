package com.example.buscahoteles


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_empty_search.view.*

/**
 * A simple [Fragment] subclass.
 */
class EmptySearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater!!.inflate(R.layout.fragment_empty_search, container, false)
        view.buttonFind.setOnClickListener{ view ->
            // Change fragment view
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_empty_search, container, false)
    }


}
