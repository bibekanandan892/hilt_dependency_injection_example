package com.example.hiltdepandencyinjection

import android.util.Log
import javax.inject.Inject

const val TAG = "Your Message: "


interface UserRepository{
    fun saveUser(email : String, password : String)

    }
class SQLRepository @Inject constructor()  :UserRepository{
    override fun saveUser(email : String, password : String){
        Log.d(TAG,"User Save In DB :: email :$email :: password:$password ")
    }
}
class FirebaseRepository : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Save in Firebase :: email: $email :: $password")
    }

}