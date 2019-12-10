package com.example.buscahoteles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

/**
 * A simple [Fragment] subclass.
 */
class ProfileEditFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater!!.inflate(R.layout.fragment_profile_edit, container, false)

        val buttonCancel = view.findViewById<View>(R.id.buttonCancel) as Button
        val buttonConfirm = view.findViewById<View>(R.id.buttonConfirm) as Button
        val edUsername_edit = view.findViewById<View>(R.id.edUsername_edit) as EditText
        val edName_edit = view.findViewById<View>(R.id.edName_edit) as EditText
        val edSurname_edit = view.findViewById<View>(R.id.edSurname_edit) as EditText
        val edEmail_edit = view.findViewById<View>(R.id.edEmail_edit) as EditText
        val edPhone_edit = view.findViewById<View>(R.id.edPhone_edit) as EditText
        val edAge_edit = view.findViewById<View>(R.id.edAge_edit) as EditText
        val edAddress_edit = view.findViewById<View>(R.id.edAddress_edit) as EditText

        val editTexts: Array<EditText> = arrayOf(edUsername_edit, edName_edit, edSurname_edit, edEmail_edit,
            edPhone_edit, edAge_edit, edAddress_edit)

        buttonCancel.setOnClickListener {
            val fragment = ProfileFragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        buttonConfirm.setOnClickListener {
            //TODO Change profile data
            val fragment = ProfileFragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()

            /*
            val viewProfile: View = inflater!!.inflate(R.layout.fragment_profile, container, false)
            val tvUsername_profile = viewProfile.findViewById<View>(R.id.tvUsername_profile) as TextView
            val tvName_profile = viewProfile.findViewById<View>(R.id.tvName_profile) as TextView
            val tvSurname_profile = viewProfile.findViewById<View>(R.id.tvSurname_profile) as TextView
            val tvEmail_profile = viewProfile.findViewById<View>(R.id.tvEmail_profile) as TextView
            val tvPhone_profile = viewProfile.findViewById<View>(R.id.tvPhone_profile) as TextView
            val tvAge_profile = viewProfile.findViewById<View>(R.id.tvAge_profile) as TextView
            val tvAddress_profile = viewProfile.findViewById<View>(R.id.tvAddress_profile) as TextView
            val textViews: Array<TextView> = arrayOf(tvUsername_profile, tvName_profile, tvSurname_profile,
                tvEmail_profile, tvPhone_profile, tvAge_profile, tvAddress_profile)

            for(i in 0 until editTexts.size){
                textViews[i].text = editTexts[i].text
            }
            */
             
        }

        return view
    }
}
