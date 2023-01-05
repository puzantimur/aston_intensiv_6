package com.example.astonintensiv5.listContacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.astonintensiv5.databinding.ItemContactBinding
import com.example.astonintensiv5.model.Contact

class ContactsListAdapter(
    private val onContactClicked: (position: Int, Contact) -> Unit,
    private val onContactLongClicked: (Contact, position: Int) -> Unit
) : ListAdapter<Contact, ContactsListAdapter.ContactViewHolder>(DIFF_UTIL) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ContactViewHolder(
            binding = ItemContactBinding.inflate(layoutInflater, parent, false),
            onContactClicked = onContactClicked,
            onContactLongClicked = onContactLongClicked,
        )
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_UTIL = object : DiffUtil.ItemCallback<Contact>() {
            override fun areItemsTheSame(oldItem: Contact, newItem: Contact): Boolean {
                return oldItem.surname == newItem.surname
            }

            override fun areContentsTheSame(oldItem: Contact, newItem: Contact): Boolean {
                return oldItem == newItem
            }
        }
    }

    class ContactViewHolder(
        private val binding: ItemContactBinding,
        private val onContactClicked: (position: Int, Contact) -> Unit,
        private val onContactLongClicked: (Contact, position: Int) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {


        fun bind(item: Contact) {
            with(binding) {
                contactName.text = item.name
                contactSurname.text = item.surname
                contactImage.load(item.image)
                root.setOnClickListener {
                    onContactClicked(layoutPosition, item)
                }
                root.setOnLongClickListener {
                    onContactLongClicked(item, layoutPosition)
                    true
                }
            }
        }

    }
}
