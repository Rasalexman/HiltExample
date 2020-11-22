package com.rasalexman.hiltclean.presentation.main.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.core.os.bundleOf
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.navArgs
import com.rasalexman.hiltclean.R
import java.util.*


class SelectLanguageDialog : DialogFragment(), SearchView.OnQueryTextListener {

    private val args: SelectLanguageDialogArgs by navArgs()
    private val locales by lazy { Locale.getAvailableLocales().map { it.displayName } }

    private var langSearchList: ListView? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        //val taskSearchView = getSearchViewLayout()
        //val builder: AlertDialog.Builder = AlertDialog.Builder(requireContext())
        //builder.setView(taskSearchView)

        val builder: AlertDialog.Builder = AlertDialog.Builder(requireContext())
        builder.setCancelable(true)
        builder.setTitle(R.string.title_select_language)
            .setItems(
                locales.toTypedArray()
            ) { dialog, which ->
                // The 'which' argument contains the index position
                // of the selected item
                setFragmentResult(TAG, bundleOf(SELECTED_LANG_INDEX to which, LANG_TYPE to args.langType))
                dialog.dismiss()
            }
        return builder.create()
    }

    private fun getSearchViewLayout(): View {
        return LayoutInflater.from(requireContext())
            .inflate(R.layout.dialog_select_language, null, false).apply {

                val toolbar = findViewById<Toolbar>(R.id.langSearchToolbar)
                setupSearchQuery(toolbar)

                langSearchList = findViewById<ListView>(R.id.langListView).apply {
                    adapter = ArrayAdapter(context, android.R.layout.simple_list_item_1, locales)
                    onItemClickListener =
                        AdapterView.OnItemClickListener { p0, p1, p2, p3 ->
                            setFragmentResult(
                                TAG,
                                bundleOf(SELECTED_LANG_INDEX to p2, LANG_TYPE to args.langType)
                            )
                            dialog?.dismiss()
                        }
                }
            }
    }

    override fun onQueryTextSubmit(p0: String?): Boolean {
        println("onQueryTextSubmit $p0")
        val query = p0.orEmpty()
        if(query.isNotEmpty()) {
            val filtered = locales.filter { it.contains(p0.orEmpty()) }
            langSearchList?.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, filtered)
        } else {
            setupDefaultLocales()
        }

        return false
    }

    override fun onQueryTextChange(p0: String?): Boolean = false

    private fun setupSearchQuery(toolbar: Toolbar) {
        val menuItem = toolbar.menu.findItem(R.id.langSearchItem)
        menuItem.setOnActionExpandListener(object : MenuItem.OnActionExpandListener {
            override fun onMenuItemActionExpand(p0: MenuItem?): Boolean = true
            override fun onMenuItemActionCollapse(p0: MenuItem?): Boolean {
                setupDefaultLocales()
                return true
            }
        })
        val searchView = menuItem.actionView as SearchView
        searchView.setOnQueryTextListener(this)
        searchView.findViewById<View>(R.id.search_close_btn).setOnClickListener {
            searchView.setQuery("", false)
            setupDefaultLocales()
        }
    }

    private fun setupDefaultLocales() {
        langSearchList?.adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, locales)
    }

    override fun onDestroyView() {
        langSearchList = null
        super.onDestroyView()
    }

    companion object {
        const val TAG = "SelectLanguageDialog"
        const val SELECTED_LANG_INDEX = "langIndex"
        const val LANG_TYPE = "langType"
    }
}