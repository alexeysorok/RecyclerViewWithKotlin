package com.criticalgnome.recyclerviewwithkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = listOf(
                MainItem("Александр", "Пушкин"),
                MainItem("Михаил", "Лермонтов"),
                MainItem("Александр", "Блок"),
                MainItem("Николай", "Некрасов"),
                MainItem("Фёдор", "Тютчев"),
                MainItem("Сергей", "Есенин"),
                MainItem("Владимир", "Маяковский")
        )

        val myAdapter = MainAdapter(items, object : MainAdapter.Callback {
            override fun onItemClicked(item: MainItem) {
                //TODO Сюда придёт элемент, по которому кликнули. Можно дальше с ним работать
            }
        })

        myRecycler.adapter = myAdapter
    }
}
