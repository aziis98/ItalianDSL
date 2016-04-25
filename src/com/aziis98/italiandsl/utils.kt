package com.aziis98.italiandsl

import java.util.*


// Copyright 2016 Antonio De Lucreziis

object Console {

    private val scanner: Scanner = Scanner(System.`in`)

    fun scrivi(testo: String, aCapo: Boolean = vero) {
        if (aCapo) {
            println(testo)
        } else {
            print(testo)
        }
    }

    fun chiedi(domanda: String): String {
        scrivi(domanda, falso)
        return scanner.nextLine()
    }

}

object Casuale {

    private val random = Random()

    fun numero(min: Int, max: Int): Int {
        return random.nextInt(max - min + 1) + min
    }

    fun booleano() = random.nextBoolean()

    fun <T> inLista(lista: List<T>): T {
        return lista[numero(0, lista.size - 1)]
    }

}