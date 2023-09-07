package com.example.tooktook

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity()
    //AdapterView.OnItemClickListener
{
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        val lisView: ListView = findViewById(R.id.multiple_list_view)
//        val listOfItem: ArrayList<String> = setMultipleListView()
//
//        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(applicationContext,
//            android.R.layout.simple_list_item_multiple_choice,
//            listOfItem)
//
//        lisView.choiceMode = ListView.CHOICE_MODE_MULTIPLE
//        lisView.adapter = arrayAdapter
//        lisView.onItemClickListener = this


        val mode = listOf("Practice yourself", "Practice others")
        val autoComplete : AutoCompleteTextView = findViewById(R.id.auto_complete)
        val adapter = ArrayAdapter(this, R.layout.mode_item, mode)
        autoComplete.setAdapter(adapter)
        autoComplete.onItemClickListener = AdapterView.OnItemClickListener{
                adapterView, view, i, l ->
            val itemSelected = adapterView.getItemAtPosition(i)
            Toast.makeText(this, "Mode: $itemSelected", Toast.LENGTH_SHORT).show()
        }

        val lang = listOf("Russian", "English")
        val autoComplete2 : AutoCompleteTextView = findViewById(R.id.auto_complete2)
        val adapter2 = ArrayAdapter(this, R.layout.mode_item, lang)
        autoComplete2.setAdapter(adapter2)
        autoComplete2.onItemClickListener = AdapterView.OnItemClickListener{
                adapterView, view, i, l ->
            val itemSelected = adapterView.getItemAtPosition(i)
            Toast.makeText(this, "Language: $itemSelected", Toast.LENGTH_SHORT).show()
        }
    }

//    private fun setMultipleListView(): ArrayList<String>{
//        val arrayList: ArrayList<String> = ArrayList()
//
//        for (i in 1..2){
//            arrayList.add("Application List $i")
//        }
//        return arrayList
//    }
//
//    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long){
//
//        val options: String = parent?.getItemAtPosition(position) as String
//        Toast.makeText(applicationContext, "Clicked By : $options",
//            Toast.LENGTH_LONG).show()
//
//    }
}