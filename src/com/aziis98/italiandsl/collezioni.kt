package com.aziis98.italiandsl

import java.util.*

// Copyright 2016 Antonio De Lucreziis


fun <T> lista(vararg array: T): ArrayList<T> {
    val arrayList = ArrayList<T>()
    arrayList.addAll(array)
    return arrayList
}

fun <T> listaIncatenata(vararg array: T): LinkedList<T> {
    val arrayList = LinkedList<T>()
    arrayList.addAll(array)
    return arrayList
}

fun <T> List<T>.numeroElementi() = this.size

fun <T> MutableList<T>.aggiungi(elemento: T) = this.add(elemento)

fun <T> MutableList<T>.rimuovi(elemento: T) = this.remove(elemento)

fun <T> MutableList<T>.rimuoviAllIndice(indice: Int) = this.removeAt(indice)

inline fun <T> Iterable<T>.filtra(predicate: (T) -> Boolean): List<T> = this.filter(predicate)

inline fun <T, R> Iterable<T>.mappa(funzione: (T) -> R): List<R> = this.map(funzione)


fun <C, V> dizionario(vararg elementi: ChiaveValore<C, V>): Map<C, V> {
    val dizionario = HashMap<C, V>()
    for ((chiave, valore) in elementi) {
        dizionario.put(chiave, valore)
    }
    return dizionario
}

data class ChiaveValore<C, V>(val chiave: C, val valore: V)

infix fun <C, V> C.con(v: V) = ChiaveValore(this, v)





































