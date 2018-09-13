package com.example.oldspice.android_audio

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Creamos la accion a realizar al presionar el boton
        button.setOnClickListener {

            //Usaremos la clase "Media Player", creamos un objeto
            val mp = MediaPlayer()

            //Creamos un bloque try-catch para prevenir errores
            try {
                //Le indicamos la URL del sonido
                mp.setDataSource("URL")

                //Descarga el sonido y lo almacena en memoria
                mp.prepare()

                //Lo escuchamos
                mp.start()

            } catch (e: IOException) {

                //Si ocurre un error aqui se almacena la causa
                e.printStackTrace()
            }
        }

    }
}
