package com.aziis98.test

import com.aziis98.italiandsl.*

// Copyright 2016 Antonio De Lucreziis

val lista = lista(1, 2, 3, 4, 5)

fun main(args: Array<String>) {

    val lista2 = lista.mappa { x -> x * x }.filtra { x -> x > lista.max()!! }

    Console.scrivi("$lista2")

    val dizionario1 = dizionario(
        "Antonio" con "De Lucreziis",
        "Riccardo" con "Marinelli",
        "Andrea" con "Tommasi",
        "Sara" con "Colavito"
    )

    se(Casuale.booleano()) {
        Console.scrivi("Vero!")
    } altrimenti {
        Console.scrivi("Falso!")
    }

}