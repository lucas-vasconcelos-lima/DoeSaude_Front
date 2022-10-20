package com.example.doesaude.api

import com.example.doesaude.model.Categoria
import com.example.doesaude.model.Postagem
import com.example.doesaude.model.Usuario
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }

    suspend fun addPostagem(postagem: Postagem): Response<Postagem>{
        return RetrofitInstance.api.addPostagem(postagem)
    }

    suspend fun addUser(usuario: Usuario): Response<Usuario>{
        return RetrofitInstance.api.addUser(usuario)
    }

    suspend fun listPostagem(): Response<List<Postagem>>{
        return  RetrofitInstance.api.listPostagem()
    }

    suspend fun updatePostagem(postagem: Postagem): Response<Postagem>{
        return RetrofitInstance.api.updateTarefa(postagem)
    }

    suspend fun deletePostagem(id: Long): Response<Postagem>{
        return RetrofitInstance.api.deletePostagem(id)
    }

<<<<<<< HEAD
    suspend fun listUsuario(): Response<List<Usuario>>{
        return RetrofitInstance.api.listUsuario()
    }

    suspend fun addUsuario(usuario: Usuario): Response<Usuario>{
        return RetrofitInstance.api.addUsuario(usuario)
    }
=======

>>>>>>> fb57de17c59cb443dc419a1f511ec87c9f1f2f1b
}