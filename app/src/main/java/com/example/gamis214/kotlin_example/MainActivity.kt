package com.example.gamis214.kotlin_example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //-->INSTANCIA DE UNA CLASE
        var instanciaPerson = Person("GAMA",10,"ITR")
        //-->SETEO DE VARIABLES A ELEMENTOS DE UNA CLASE
        /*instanciaPerson.age = 10
        instanciaPerson.name = "Gamaliel"
        instanciaPerson.college = "ITR"*/

        //-->INSTANCIA DE UNA CLASE CON OTRO CONSTRUCTOR
        var instanciaPerson2 = Person("IVAN",20,"TEC","g@m.com")

        showName("IVAN HERNANDEZ")

        instanciaPerson.puedeVotar()

        Toast.makeText(this,""+instanciaPerson.puedeVotar().toString()+"",Toast.LENGTH_LONG).show()

        instanciaPerson2.puedeVotar()

        Toast.makeText(this,""+instanciaPerson2.puedeVotar().toString()+"",Toast.LENGTH_LONG).show()

    }

    fun showName(nombre : String) : Boolean{
        return nombre.length > 0
    }


}
