package com.example.simular_llamada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var button1 : Button?=null
    var button2 : Button?=null
    var button3 : Button?=null
    var button4 : Button?=null
    var button5 : Button?=null
    var button6 : Button?=null
    var button7 : Button?=null
    var button8 : Button?=null
    var button9 : Button?=null
    var buttonC : Button?=null
    var button0 : Button?=null
    var llamar : Button?=null
    var loadingContainer : View?= null
    var text_numeros: EditText?= null
    var otor: TextView?=null
    var numero:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        buttonC = findViewById(R.id.buttonC)
        button0 = findViewById(R.id.button0)
        llamar = findViewById(R.id.llamar)
        text_numeros=findViewById(R.id.text_numero)
        //this.text_numero.setSelection(9)
        loadingContainer = findViewById(R.id.cargarContainer)

        llamar!!.setOnClickListener{showLoading(true)}

        loadingContainer!!.setOnClickListener{ showLoading(false) }
        //setActionBar(null)

        button1!!.setOnClickListener{
            numero="$numero 1"
            text_numeros!!.setText("$numero")

        }
        button2!!.setOnClickListener{
            numero="$numero 2"

            text_numeros!!.setText("$numero")

        }
        button3!!.setOnClickListener{
            numero="$numero 3"

            text_numeros!!.setText("$numero")

        }
        button4!!.setOnClickListener{
            numero="$numero 4"

            text_numeros!!.setText("$numero")

        }
        button5!!.setOnClickListener{
            numero="$numero 5"

            text_numeros!!.setText("$numero")

        }
        button6!!.setOnClickListener{
            numero="$numero 6"

            text_numeros!!.setText("$numero")

        }
        button7!!.setOnClickListener{
            numero="$numero 7"

            text_numeros!!.setText("$numero")

        }
        button8!!.setOnClickListener{
            numero="$numero 8"

            text_numeros!!.setText("$numero")

        }
        button9!!.setOnClickListener{
            numero="$numero 9"

            text_numeros!!.setText("$numero")

        }
        button0!!.setOnClickListener{
            numero="$numero 0"

            text_numeros!!.setText("$numero")

        }
        buttonC!!.setOnClickListener{
            var str:String= text_numeros!!.getText().toString().trim()
            if(str.length !=0){
                str=str.substring(0,str.length -1)
                text_numeros!!.setText(str)
                numero=""
            }

        }
    }



    fun showLoading(show: Boolean){
        val visibility = if (show) View.VISIBLE
        else View.GONE
        loadingContainer!!.visibility=visibility
    }
}
