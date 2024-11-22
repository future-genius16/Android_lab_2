package com.example.android_lab_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter : RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    private val personList: List<Person> = listOf(
        Person("Бернар Арно", R.drawable.arno),
        Person("Илон Маск", R.drawable.musk),
        Person("Джефф Безос", R.drawable.bezos),
        Person("Ларри Эллисон", R.drawable.ellison),
        Person("Уоррен Баффет", R.drawable.buffet),
        Person("Билл Гейтс", R.drawable.gates),
        Person("Майкл Блумберг", R.drawable.bloomberg),

    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.person_layout, parent, false)
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = personList[position]
        holder.imageView.setImageResource(person.pic)
        holder.titleView.text = person.name
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    class PersonViewHolder(personView: View) : RecyclerView.ViewHolder(personView) {
        val imageView: ImageView = personView.findViewById(R.id.image)
        val titleView: TextView = personView.findViewById(R.id.name)
    }
}