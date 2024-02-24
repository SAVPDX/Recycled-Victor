package com.victor.recycledvictor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DescuentosAdapter(var context: Context,
    var ListaDescuentos: MutableList<dtDescuentos>) : RecyclerView.Adapter<DescuentosAdapter.vHolder>(){

    inner class vHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        lateinit var txtproductos: TextView
        init {
            txtproductos=itemView.findViewById(R.id.txtProducto)
        }

        lateinit var txtprecioanterior: TextView
        init {
            txtprecioanterior=itemView.findViewById(R.id.txtPrecioanterior)
        }

        lateinit var txtprecioactual: TextView
        init {
            txtprecioactual=itemView.findViewById(R.id.txtPrecioactual)
        }

        lateinit var txtdescuento: TextView
        init {
            txtdescuento=itemView.findViewById(R.id.txtDescuento)
        }

        lateinit var txtmsi: TextView
        init {
            txtmsi=itemView.findViewById(R.id.txtMsi)
        }

        lateinit var txtenviogratis: TextView
        init {
            txtenviogratis=itemView.findViewById(R.id.txtEnvioGratis)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DescuentosAdapter.vHolder {
        var itemView = LayoutInflater.from(context).inflate(
            R.layout.descuentos,parent,false)
        return vHolder(itemView)
    }

    override fun getItemCount(): Int {
        return ListaDescuentos.size
    }

    override fun onBindViewHolder(holder: DescuentosAdapter.vHolder, position: Int) {
        var producto = ListaDescuentos[position]
        holder.txtproductos.text=producto.NombreProducto
        holder.txtprecioanterior.text=producto.PrecioAnterior
        holder.txtprecioactual.text=producto.PrecioActual
        holder.txtdescuento.text=producto.Descuentos
        holder.txtmsi.text=producto.MSI
        holder.txtenviogratis.text=producto.Envio
    }
}