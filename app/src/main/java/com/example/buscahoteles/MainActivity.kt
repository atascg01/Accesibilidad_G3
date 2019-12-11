package com.example.buscahoteles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var logged : Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Load first fragment by default
        loadFragment(EmptySearchFragment())

        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when {
                menuItem.itemId == R.id.navigationSearch -> {
                    loadFragment(SearchFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                menuItem.itemId == R.id.navigationCalendar -> {
                    loadFragment(CalendarFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                menuItem.itemId == R.id.navigationFavorites -> {
                    loadFragment(FavoritesFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                menuItem.itemId == R.id.navigationProfile -> {
                    if(logged){
                        val storageIntent = Intent(this, ProfileFragment::class.java)
                        storageIntent.putExtra("login", logged)
                        loadFragment(ProfileFragment())
                        return@setOnNavigationItemSelectedListener true
                    }else{
                        loadFragment(LoginFragment())
                        return@setOnNavigationItemSelectedListener true
                    }
                }
                else -> {
                    return@setOnNavigationItemSelectedListener false
                }
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().also { fragmentTransaction ->
            fragmentTransaction.replace(R.id.fragmentContainer, fragment)
            fragmentTransaction.commit()
        }
    }

    private fun setLogged(loggeds: Boolean){
        this.logged = loggeds
    }
}
