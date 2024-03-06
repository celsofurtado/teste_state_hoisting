package br.com.fiap.meusamigos.database.repository

import android.content.Context
import br.com.fiap.meusamigos.database.dao.ContatoDb
import br.com.fiap.meusamigos.model.Contato

class ContatoRepository(context: Context) {

    private val db = ContatoDb.getDatabase(context).contatoDao()

    fun salvar(contato: Contato): Long {
        return db.salvar(contato)
    }

    fun atualizar(contato: Contato): Int {
        return db.atualizar(contato)
    }

    fun excluir(contato: Contato): Int {
        return db.excluir(contato)
    }

    fun listarContatos(): List<Contato> {
        return db.listarContatos()
    }

    fun buscarContatoPeloId(id: Int): Contato {
        return db.buscarContatoPeloId(id)
    }

}
