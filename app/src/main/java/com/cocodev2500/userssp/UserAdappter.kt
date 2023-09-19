package com.cocodev2500.userssp

import android.content.Context
import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.cocodev2500.userssp.databinding.ItemUserAltBinding
import com.cocodev2500.userssp.databinding.ItemUserBinding

class UserAdappter(private val users: MutableList<User>,
                   private val listener: OnClickListener):RecyclerView.Adapter<UserAdappter.UserViewHolder>() {

    private lateinit var context : Context //lateinit nos permite inicializar la variable mas adelante


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        context = parent.context //parent es el viewgroup que contiene a los items de la lista y context es el contexto de la aplicacion
        val view = View.inflate(context, R.layout.item_user_alt, null) //inflamos el layout item_user
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        val user = users[position] //el lugar de get se puede usar el operador [] para obtener el elemento de la lista

        //el with nos permite acceder a las propiedades y metodos de un objeto sin necesidad de crear una instancia de la clase UserViewHolder

        with(holder){
            setListener(user, position + 1)
            binding.tvOrder.text = user.id.toString()
            binding.tvName.text = user.name + "  " + user.lastName
            Glide.with(context)
                .load(user.url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .circleCrop()
                .into(binding.imgUser)
        }
    }

    fun remove(adapterPosition: Int) {
          users.removeAt(adapterPosition)
         notifyItemRemoved(adapterPosition)
    }

    //inner class nos dice que esta clase es interna a la clase UserAdappter y que puede acceder a sus propiedades
    //y metodos sin necesidad de crear una instancia de la clase UserAdappter
    inner class UserViewHolder(view: View): RecyclerView.ViewHolder(view)  {
        val binding = ItemUserAltBinding.bind(view)

        //con el metodo setListener le pasamos el usuario al listener
        fun setListener(user: User, position: Int){
            binding.root.setOnClickListener {
                listener.onClick(user, position )
            }
        }
    }

}