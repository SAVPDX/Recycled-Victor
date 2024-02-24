package com.victor.recycledvictor

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StrikethroughSpan
import android.text.style.StyleSpan
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var listaProductos: MutableList<dtDescuentos> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listaProductos.add(
            dtDescuentos("Xiaomi Pocophone 256 Gb, 8Gb Ram", "$ 4,331", "$ 2,599", "40% OFF", "En 24x $ 157 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Apple iPhone 15 (128 GB) Negro","$ 24,073.34","$ 14,999","37% OFF","En 12x $ 1,249 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Consola Xbox Series S 1Tb Ssd All Digital Carbon Black Negro","$ 9,999","$ 6,699","33% OFF","En 12x $ 558 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Smart Tv 40 Hisense, Full HD 40 Pulgadas Con Roku H4 Serie","$ 4,686","$ 3,749","20% OFF","En 24x $ 226 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Apple iPhone 13 (256 GB) Blanco Reacondicionado","$ 13,073.34","$ 12,999","25% OFF","En 12x $ 1,119 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Apple iPhone 15 Pro Max (256 GB) Titanio Natural","$ 30,299","$ 28,999","15% OFF","En 12x $ 2,416 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Control joystick inalámbrico Microsoft Xbox Xbox wireless controller Gold","$ 1,686","$ 1,199","28% OFF","En 3x $ 399 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Apple iPhone 14 (128 GB)- Azul","$ 22,999","$ 16,999","25% OFF","En 24x $ 1,027 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Smart Tv 40 Vidaa, Hisense, 40a4hv, Fhd","$ 6,799","$ 4,688","31% OFF","En 12x $ 390 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Nintendo Switch 32GB Standard color rojo neón, azul neón y negro","$ 6,756","$ 4,399","34% OFF","En 24x $ 256.63 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Xiaomi Pocophone 256 Gb, 8Gb Ram", "$ 4,331", "$ 2,599", "40% OFF", "En 24x $ 157 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Apple iPhone 15 (128 GB) Negro","$ 24,073.34","$ 14,999","37% OFF","En 12x $ 1,249 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Consola Xbox Series S 1Tb Ssd All Digital Carbon Black Negro","$ 9,999","$ 6,699","33% OFF","En 12x $ 558 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Smart Tv 40 Hisense, Full HD 40 Pulgadas Con Roku H4 Serie","$ 4,686","$ 3,749","20% OFF","En 24x $ 226 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Apple iPhone 13 (256 GB) Blanco Reacondicionado","$ 13,073.34","$ 12,999","25% OFF","En 12x $ 1,119 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Apple iPhone 15 Pro Max (256 GB) Titanio Natural","$ 30,299","$ 28,999","15% OFF","En 12x $ 2,416 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Control joystick inalámbrico Microsoft Xbox Xbox wireless controller Gold","$ 1,686","$ 1,199","28% OFF","En 3x $ 399 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Apple iPhone 14 (128 GB)- Azul","$ 22,999","$ 16,999","25% OFF","En 24x $ 1,027 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Smart Tv 40 Vidaa, Hisense, 40a4hv, Fhd","$ 6,799","$ 4,688","31% OFF","En 12x $ 390 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Nintendo Switch 32GB Standard color rojo neón, azul neón y negro","$ 6,756","$ 4,399","34% OFF","En 24x $ 256.63 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Xiaomi Pocophone 256 Gb, 8Gb Ram", "$ 4,331", "$ 2,599", "40% OFF", "En 24x $ 157 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Apple iPhone 15 (128 GB) Negro","$ 24,073.34","$ 14,999","37% OFF","En 12x $ 1,249 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Consola Xbox Series S 1Tb Ssd All Digital Carbon Black Negro","$ 9,999","$ 6,699","33% OFF","En 12x $ 558 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Smart Tv 40 Hisense, Full HD 40 Pulgadas Con Roku H4 Serie","$ 4,686","$ 3,749","20% OFF","En 24x $ 226 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Apple iPhone 13 (256 GB) Blanco Reacondicionado","$ 13,073.34","$ 12,999","25% OFF","En 12x $ 1,119 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Apple iPhone 15 Pro Max (256 GB) Titanio Natural","$ 30,299","$ 28,999","15% OFF","En 12x $ 2,416 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Control joystick inalámbrico Microsoft Xbox Xbox wireless controller Gold","$ 1,686","$ 1,199","28% OFF","En 3x $ 399 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Apple iPhone 14 (128 GB)- Azul","$ 22,999","$ 16,999","25% OFF","En 24x $ 1,027 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Smart Tv 40 Vidaa, Hisense, 40a4hv, Fhd","$ 6,799","$ 4,688","31% OFF","En 12x $ 390 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Nintendo Switch 32GB Standard color rojo neón, azul neón y negro","$ 6,756","$ 4,399","34% OFF","En 24x $ 256.63 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Xiaomi Pocophone 256 Gb, 8Gb Ram", "$ 4,331", "$ 2,599", "40% OFF", "En 24x $ 157 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Apple iPhone 15 (128 GB) Negro","$ 24,073.34","$ 14,999","37% OFF","En 12x $ 1,249 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Consola Xbox Series S 1Tb Ssd All Digital Carbon Black Negro","$ 9,999","$ 6,699","33% OFF","En 12x $ 558 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Smart Tv 40 Hisense, Full HD 40 Pulgadas Con Roku H4 Serie","$ 4,686","$ 3,749","20% OFF","En 24x $ 226 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Apple iPhone 13 (256 GB) Blanco Reacondicionado","$ 13,073.34","$ 12,999","25% OFF","En 12x $ 1,119 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Apple iPhone 15 Pro Max (256 GB) Titanio Natural","$ 30,299","$ 28,999","15% OFF","En 12x $ 2,416 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Control joystick inalámbrico Microsoft Xbox Xbox wireless controller Gold","$ 1,686","$ 1,199","28% OFF","En 3x $ 399 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Apple iPhone 14 (128 GB)- Azul","$ 22,999","$ 16,999","25% OFF","En 24x $ 1,027 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Smart Tv 40 Vidaa, Hisense, 40a4hv, Fhd","$ 6,799","$ 4,688","31% OFF","En 12x $ 390 sin interés", "Envío gratis FULL")
        )
        listaProductos.add(
            dtDescuentos("Nintendo Switch 32GB Standard color rojo neón, azul neón y negro","$ 6,756","$ 4,399","34% OFF","En 24x $ 256.63 sin interés", "Envío gratis FULL")
        )

        var tabla = findViewById<RecyclerView>(R.id.tablaProductos)
        recycler=tabla
        recycler.layoutManager=LinearLayoutManager(this)
        recycler.adapter=DescuentosAdapter(this,listaProductos)


    }
}

