package com.example.buscahoteles


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

/**
 * A simple [Fragment] subclass.
 */
class ProfileFragment : Fragment() {

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        val view: View = inflater!!.inflate(R.layout.fragment_profile, container, false)
        val buttonLogOut = view.findViewById<View>(R.id.buttonConfirm) as Button
        val buttonEditProfile = view.findViewById<View>(R.id.buttonCancel) as Button
        buttonLogOut.setOnClickListener {
            val fragment = LoginFragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        buttonEditProfile.setOnClickListener{
            val fragment = ProfileEditFragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }


        return view
    }
}
