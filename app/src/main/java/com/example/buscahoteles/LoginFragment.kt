package com.example.buscahoteles


import android.graphics.Color
import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view : View = inflater!!.inflate(R.layout.fragment_login, container, false)
        val loginButton = view.findViewById<View>(R.id.buttonLogin) as Button
        val registerButton = view.findViewById<View>(R.id.buttonRegister) as Button
        val etUsername = view.findViewById<View>(R.id.etUsername_login) as EditText
        val etPasswd = view.findViewById<View>(R.id.etPasswd_login) as EditText
        loginButton.setOnClickListener{
            if(etUsername.text.isNotEmpty() && etPasswd.text.isNotEmpty()){
                val fragment = SearchFragment()
                val fragmentManager = activity!!.supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.fragmentContainer, fragment)
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commit()
            }else{
                etUsername.setHintTextColor(Color.RED)
                etPasswd.setHintTextColor(Color.RED)
            }

        }
        registerButton.setOnClickListener{
            val fragment = RegisterFragment()
            val fragmentManager = activity!!.supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, fragment)
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        return view
    }


}
