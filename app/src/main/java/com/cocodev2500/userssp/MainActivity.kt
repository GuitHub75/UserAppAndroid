package com.cocodev2500.userssp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cocodev2500.userssp.databinding.ActivityMainBinding
import com.cocodev2500.userssp.databinding.ItemUserBinding

class MainActivity : AppCompatActivity() {

    private lateinit var userAdappter: UserAdappter
    private lateinit var linearLayoutManager: RecyclerView.LayoutManager
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //inflamos el layout de la actividad
        setContentView(binding.root) //establecemos el layout de la actividad

        userAdappter = UserAdappter(getUser()) //creamos una instancia del adaptador y le pasamos la lista de usuarios

        linearLayoutManager = LinearLayoutManager(this) //creamos una instancia del layout manager
        linearLayoutManager = GridLayoutManager(this, 1) //asignamos el numero de columnas que tendra el recycler view

        binding.rvUsers.apply { //aplicamos el layout manager y el adaptador al recycler view
            layoutManager = linearLayoutManager
            adapter = userAdappter
        }
    }

    private fun getUser() : MutableList<User>{
        val user = mutableListOf<User>()
        val user1 = User(1, "Juan", "Rodriguez", "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&w=1600")
        val user2 = User(2, "Pedro", "Perez", "https://images.pexels.com/photos/1222271/pexels-photo-1222271.jpeg?auto=compress&cs=tinysrgb&w=1600")
        val user3 = User(3, "Maria", "Gonzalez", "https://images.pexels.com/photos/1239291/pexels-photo-1239291.jpeg?auto=compress&cs=tinysrgb&w=1600")
        val user4 = User(4, "Jose", "Garcia", "https://images.pexels.com/photos/614810/pexels-photo-614810.jpeg?auto=compress&cs=tinysrgb&w=1600")
        val user5 = User(5, "Luis", "Lopez", "https://images.pexels.com/photos/91227/pexels-photo-91227.jpeg?auto=compress&cs=tinysrgb&w=1600")
        val user6 = User(6, "Ana", "Martinez", "https://images.pexels.com/photos/712513/pexels-photo-712513.jpeg?auto=compress&cs=tinysrgb&w=1600")
        val user7 = User(7, "Carlos", "Sanchez", "https://images.pexels.com/photos/1681010/pexels-photo-1681010.jpeg?auto=compress&cs=tinysrgb&w=1600")
        val user8 = User(8, "Jorge", "Gomez", "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&w=1600")
        val user9 = User(9, "Javier", "Gutierrez", "https://images.pexels.com/photos/1222271/pexels-photo-1222271.jpeg?auto=compress&cs=tinysrgb&w=1600")
        val user10 = User(10, "Sara", "Ruiz", "https://images.pexels.com/photos/1239291/pexels-photo-1239291.jpeg?auto=compress&cs=tinysrgb&w=1600")
        val user11 = User(11, "Sara", "Ruiz", "https://images.pexels.com/photos/1239291/pexels-photo-1239291.jpeg?auto=compress&cs=tinysrgb&w=1600")
        val user12 = User(12, "Sara", "Ruiz", "https://images.pexels.com/photos/1239291/pexels-photo-1239291.jpeg?auto=compress&cs=tinysrgb&w=1600")
        val user13 = User(13, "Sara", "Ruiz", "https://images.pexels.com/photos/1239291/pexels-photo-1239291.jpeg?auto=compress&cs=tinysrgb&w=1600")

        user.add(user1)
        user.add(user2)
        user.add(user3)
        user.add(user4)
        user.add(user5)
        user.add(user6)
        user.add(user7)
        user.add(user8)
        user.add(user9)
        user.add(user10)
        user.add(user11)
        user.add(user12)
        user.add(user13)


        return user
    }
}