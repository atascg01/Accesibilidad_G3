package com.example.buscahoteles


import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

/**
 * A simple [Fragment] subclass.
 */
class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater!!.inflate(R.layout.fragment_register, container, false)
        val buttonRegister = view.findViewById<View>(R.id.buttonRegister_register) as Button
        val tvLogin = view.findViewById<View>(R.id.tvLogin_register) as TextView
        val checkBoxTerms = view.findViewById<View>(R.id.checkBoxTerms) as CheckBox
        val etName = view.findViewById<View>(R.id.etUsername_register) as EditText
        val etMobile = view.findViewById<View>(R.id.etMobile_register) as EditText
        val etEmail = view.findViewById<View>(R.id.etEmail_register) as EditText
        val etPasswd = view.findViewById<View>(R.id.etPassword_register) as EditText
        val tvForcedText = view.findViewById<View>(R.id.tvForcedText) as TextView
        buttonRegister.setOnClickListener {
            if(checkBoxTerms.isChecked && etName.text.isNotEmpty()&&
            etMobile.text.isNotEmpty() && etEmail.text.isNotEmpty() && etPasswd.text.isNotEmpty()){
                val fragment = LoginFragment()
                val fragmentManager = activity!!.supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.fragmentContainer, fragment)
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commit()
            }else{
                val builder = AlertDialog.Builder(context)
                builder.setTitle("Error")
                builder.setMessage("Por favor, rellene todos los campos.")
                builder.setPositiveButton(android.R.string.yes) { dialog, which ->
                    Toast.makeText(context,
                        android.R.string.yes, Toast.LENGTH_SHORT).show()
                }
                builder.show()
                tvForcedText.setTextColor(Color.RED)
                val components: Array<EditText> = arrayOf(etName, etMobile, etEmail, etPasswd)
                for (i in components){
                    if(i.text.isEmpty()){
                        i.setHintTextColor(Color.RED)
                    }else{
                        i.setHintTextColor(Color.BLACK)
                    }
                }
                if(!checkBoxTerms.isChecked){
                    checkBoxTerms.setTextColor(Color.RED)
                }else{
                    checkBoxTerms.setTextColor(Color.BLACK)
                }
            }
        }

        tvLogin.setOnClickListener {
            val fragment = LoginFragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        return view
    }
}