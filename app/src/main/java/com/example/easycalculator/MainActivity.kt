package com.example.easycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.set

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val inptext1= findViewById<EditText>(R.id.inputone)
        val inptext2= findViewById<EditText>(R.id.input2)
        val rslttxt =findViewById<TextView>(R.id.textView)
        val clearbt =findViewById<Button>(R.id.clearr)

        val dividbtn=findViewById<Button>(R.id.dvide)
        val plzbt=findViewById<Button>(R.id.pluz)

        val minbtn=findViewById<Button>(R.id.minuz)

        val multbtn=findViewById<Button>(R.id.multip)



clearbt.setOnClickListener(){

    inptext1.setText("")
    inptext2.setText("")
    rslttxt.setText("")
}

        dividbtn.setOnClickListener(){

            if(!inptext1.text.isEmpty()&&!inptext2.text.isEmpty()){

                val inp1=inptext1.text.toString().toInt()

                val inp2=inptext2.text.toString().toInt()


                var result = inp1.toDouble() / inp2.toDouble()
                var result2 = result.toDouble()
                rslttxt.text=result2.toString()
            }
            else
                Toast.makeText(this@MainActivity, "Please Enter The 2 Values", Toast.LENGTH_SHORT).show()

        }

        plzbt.setOnClickListener(){


            if(!inptext1.text.isEmpty()&&!inptext2.text.isEmpty()){
                val inp1=inptext1.text.toString().toInt()

                val inp2=inptext2.text.toString().toInt()

                var result =inp1.toDouble() + inp2.toDouble()
                var result2 = result.toDouble()
                rslttxt.text=result2.toString()}
            else{
                Toast.makeText(this@MainActivity, "Please Enter The 2 Values", Toast.LENGTH_SHORT).show()
            }


        }
        minbtn.setOnClickListener(){
            if(!inptext1.text.isEmpty()&&!inptext2.text.isEmpty()){

                val inp1=inptext1.text.toString().toInt()

                val inp2=inptext2.text.toString().toInt()

                val result = inp1.toDouble() - inp2.toDouble()
                var result2 = result.toDouble()
                rslttxt.text=result2.toString()
            }else
                Toast.makeText(this@MainActivity, "Please Enter The 2 Values", Toast.LENGTH_SHORT).show()


        }

        multbtn.setOnClickListener(){

            if(!inptext1.text.isEmpty()&&!inptext2.text.isEmpty()){

                val inp1=inptext1.text.toString().toInt()

                val inp2=inptext2.text.toString().toInt()

                val result = inp1.toDouble() * inp2.toDouble()

                var result2 = result.toDouble()
                rslttxt.text=result2.toString()
            }else
                Toast.makeText(this@MainActivity, "Please Enter The 2 Values", Toast.LENGTH_SHORT).show()



        }



    }
}