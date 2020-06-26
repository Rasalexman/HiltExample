package com.rasalexman.hiltclean.presentation.main.dialog

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.core.os.bundleOf
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.navArgs
import com.rasalexman.hiltclean.R
import java.util.*


class SelectLanguageDialog : DialogFragment() {

    private val args: SelectLanguageDialogArgs by navArgs()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val locales = Locale.getAvailableLocales().map { it.displayName }
        val builder: AlertDialog.Builder = AlertDialog.Builder(requireContext())
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

    companion object {
        const val TAG = "SelectLanguageDialog"
        const val SELECTED_LANG_INDEX = "langIndex"
        const val LANG_TYPE = "langType"
    }
}