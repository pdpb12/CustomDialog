package me.ruyeo.customdialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.DialogFragment

class ExitDialog(private var title: String) : DialogFragment(){

    var onItemClick: ((Boolean) -> Unit)? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NO_TITLE, R.style.CustomDialog)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.exit_layout,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        isCancelable = false
        var text_tx = view.findViewById<TextView>(R.id.text)
        var cancel_tx = view.findViewById<TextView>(R.id.cancel_tx)
        var done_tx = view.findViewById<TextView>(R.id.done_tx)

        text_tx.text  = title

        cancel_tx.setOnClickListener {
            dismiss()
        }
        done_tx.setOnClickListener {
            onItemClick?.invoke(true)
            dismiss()
        }
    }
}