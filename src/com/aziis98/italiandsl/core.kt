package com.aziis98.italiandsl

// Copyright 2016 Antonio De Lucreziis

val vero = true
val falso = false

fun se(condizione: Boolean, seVero: () -> Unit): Boolean {
    if (condizione) {
        seVero()
        return vero
    }
    return falso
}

fun Boolean.altrimentiSe(condizione: Boolean, seAltrimenti: () -> Unit): Boolean {
    if (!this && condizione) {
        seAltrimenti()
        return vero
    }
    return falso
}

infix fun Boolean.altrimenti(seAltrimenti: () -> Unit) {
    if (!this) {
        seAltrimenti()
    }
}

infix fun Boolean.o(booleano: Boolean): Boolean = this || booleano

infix fun Boolean.oppure(booleano: Boolean): Boolean = this || booleano

infix fun Boolean.e(booleano: Boolean): Boolean = this && booleano






























