package com.example.gamis214.kotlin_example

/**
 * Created by JAAH on 18/05/17.
 */
class Person(name: String, age: Int, college: String?){

    var name: String = ""
    var age: Int = 0
    var college: String? = null
    var email: String = ""

    constructor(name:String, age:Int, college: String?, email: String) : this(name, age, college) {
        this.email = email
    }

    fun puedeVotar() : Boolean{
        return this.age > 18
    }

}