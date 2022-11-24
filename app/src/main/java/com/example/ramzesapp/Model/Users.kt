package com.example.ramzesapp.Model

class Users {
    private val login:String?,
    private val fcs:String?,
    private val name:String?
}: IUser  {
    override fun getFIO(): String? {
        return fio
    }

    override fun getLogin(): String? {
        return login
    }

    override fun getName(): String? {
        return password
    }
    
}