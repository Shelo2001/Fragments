package com.example.myapp.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapp.R

class NotificationsFragment : Fragment(R.layout.fragment_notifications) {
    private lateinit var textView: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView=view.findViewById(R.id.textView2)
        textView.text=NotificationsFragmentArgs.fromBundle(requireArguments()).amount.toString()
    }
}