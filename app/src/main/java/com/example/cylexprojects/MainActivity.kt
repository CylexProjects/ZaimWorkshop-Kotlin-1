package com.example.cylexprojects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var kelime1: String = "Sarı"
        var kelime2 = "Kırmızı"
        val daima = "Şampiyon"
        var sayi = 37
        var siralama: Double = 31.123
        var carpma = sayi * siralama

        Log.i("Liste $kelime1 $kelime2 ",daima)
        Log.i("Liste çarpma",carpma(2,29).toString())

        liste()
        whenKontrol()
        ifKontrol()
        stringIslemler()
        filtreleme()

    }
    fun carpma(ilkSayi: Int, ikinciSayi: Int) : Int{
        return ilkSayi * ikinciSayi
    }
    fun liste(){
        var liste: ArrayList<String> = arrayListOf()
        liste.add("Abdullah")
        liste.add("Melih")
        liste.add("Ahmet")
        liste.add("Mehmet")
        liste.removeAt(3)

        Log.i("Liste ilk", liste.first())
        Log.i("Liste son", liste.last())
        Log.i("Liste boyutu", liste.size.toString())
        Log.i("Liste 1. index", liste.get(1))

        for(x in 0..2){
            Log.i("Liste eleman", liste.get(x))
        }
    }
    fun whenKontrol(){
        var kart = 1
        when(kart){
            0 -> {
                Toast.makeText(this, "Hiç kart görmemiş", Toast.LENGTH_LONG).show()
            }
            1 -> {
                Toast.makeText(this, "Sarı kart görmüş", Toast.LENGTH_LONG).show()
            }
            2 -> {
                Toast.makeText(this, "Kırmızı kart görmüş", Toast.LENGTH_LONG).show()
            }
            else -> {
                Toast.makeText(this, "Oyuna girmemiş", Toast.LENGTH_LONG).show()
            }
        }
    }
    fun ifKontrol(){
        var ogrenci = true
        if(ogrenci){
            Toast.makeText(this, "Evet öğrencisin", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(this, "Hayır öğrenci değilsin", Toast.LENGTH_LONG).show()
        }
    }
    fun stringIslemler(){
        var isim = "Melih Dal"
        Log.i("Liste buyukyazdir", isim.uppercase())
        Log.i("Liste kucukyazdir", isim.lowercase())
        Log.i("Liste kelimeekle", isim.plus(" Kodluyor"))
        Log.i("Liste harfsec", isim.get(3).toString())
        Log.i("Liste araliksec", isim.substring(2,5))

        var kesikIsım = isim.split(" ").toTypedArray()
        var adParca = kesikIsım.get(0).substring(0,1)
        var soyadParca = kesikIsım.get(1).substring(0,1)
        Log.i("Liste adım", adParca + "****")
        Log.i("Liste soyadım", soyadParca + "**")
    }
    fun filtreleme(){
        val sehirler: ArrayList<String> = arrayListOf()
        sehirler.add("İstanbul")
        sehirler.add("Bursa")
        sehirler.add("İstanbul")
        sehirler.add("Kastamonu")
        sehirler.add("Ankara")
        sehirler.add("İzmir")
        sehirler.add("Kastamonu")
        sehirler.add("İstanbul")

        val geciciSehirler: ArrayList<String> = arrayListOf()
        sehirler.filter { sehirAd-> sehirAd == "Kastamonu" }.forEach { filtreSon -> geciciSehirler.add(filtreSon)}
        Log.i("Liste boyut",sehirler.filter { sehirAd-> sehirAd == "Kastamonu" }.size.toString())
        geciciSehirler.forEach {
            Log.i("Liste şehir", it)
        }

    }
}