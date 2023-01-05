package com.example.astonintensiv5.listContacts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.astonintensiv5.R
import com.example.astonintensiv5.dataSource.Source
import com.example.astonintensiv5.databinding.FragmentContactListBinding
import com.example.astonintensiv5.detailsOfContact.DetailsContactFragment
import com.example.astonintensiv5.model.Contact
import com.example.astonintensiv5.utils.addFragment
import com.example.astonintensiv5.utils.divider
import com.example.astonintensiv5.utils.space

class ContactsListFragment : Fragment() {

    private var _binding: FragmentContactListBinding? = null
    private val binding: FragmentContactListBinding
        get() = requireNotNull(_binding)

    private val adapter by lazy {
        ContactsListAdapter(
            onContactClicked = { position, contact ->
                val detailFragment = DetailsContactFragment
                    .getInstance(position, contact.name, contact.surname, contact.phoneNumber)
                addFragment(detailFragment)
            },
            onContactLongClicked = { contact, position ->
                updateContact(contact, position)
            }
        )
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentContactListBinding.inflate(inflater, container, false)
            .also { _binding = it }
            .root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            listContacts.adapter = adapter
            adapter.submitList(Source.contactList)

            parentFragmentManager
                .setFragmentResultListener(KEY_RESULT, viewLifecycleOwner) { _, bundle ->
                    val changingContact = Source.contactList[bundle.getInt(KEY_POSITION)]
                    changingContact
                        .changeContact(
                            bundle.getString(KEY_NAME_RESULT),
                            bundle.getString(KEY_SURNAME_RESULT),
                            bundle.getString(KEY_PHONE_RESULT)
                        )
                    Source.contactList[bundle.getInt(KEY_POSITION)] = changingContact
                    adapter.submitList(Source.contactList)
                }

            toolbar.menu
                .findItem(R.id.action_search)
                .actionView
                .let { it as SearchView }
                .setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                    override fun onQueryTextSubmit(query: String): Boolean = false
                    override fun onQueryTextChange(query: String): Boolean {
                        adapter.submitList(
                            Source.contactList.filter {
                                it.name.contains(query, ignoreCase = true) || it.surname.contains(
                                    query
                                )
                            }
                        )
                        return true
                    }
                })

            listContacts.space(requireContext())

            listContacts.divider(requireContext())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val KEY_RESULT = "KEY_RESULT"
        const val KEY_POSITION = "KEY_POSITION"
        const val KEY_NAME_RESULT = "KEY_NAME_RESULT"
        const val KEY_SURNAME_RESULT = "KEY_SURNAME_RESULT"
        const val KEY_PHONE_RESULT = "KEY_PHONE_RESULT"
    }

    private fun updateContact(contact: Contact, position: Int) {
        AlertDialog.Builder(requireContext()).setTitle(R.string.delete_this_contact)
            .setPositiveButton(android.R.string.ok) { _, _ ->
                Source.contactList.remove(contact)
                adapter.notifyItemRemoved(position)
            }
            .setNegativeButton(android.R.string.cancel) { _, _ ->
            }
            .show()
    }
}
