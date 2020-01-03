package com.example.buscahoteles

import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
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
        val etPassword1 = view.findViewById<View>(R.id.etPassword1_edit) as EditText
        val etPassword2 = view.findViewById<View>(R.id.etPassword2_edit) as EditText

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

            if((!etPassword1.text.toString().equals(etPassword2.text.toString()))){
                if (!etPassword1.text.toString().equals(etPassword2.text.toString())) {
                    val builder = AlertDialog.Builder(context)
                    builder.setTitle("Error")
                    builder.setMessage("Las contraseñas no coinciden.")
                    builder.setPositiveButton(android.R.string.yes) { dialog, which ->
                    }
                    builder.show()
                }
            }
            else{
                val fragment = ProfileFragment()
                val fragmentManager = activity!!.supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.fragmentContainer, fragment)
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commit()
            }


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
