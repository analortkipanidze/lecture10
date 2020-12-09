package com.example.lecture10.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.lecture10.R

class NotificationFragment : Fragment(R.layout.fragment_notification){


    private lateinit var texView:TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        texView = view.findViewById(R.id.textView2)

        texView.text = NotificationFragmentArgs.fromBundle(requireArguments()).amount.toString()
    }
}