package com.kamilmasyhur.dicoding.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.kamilmasyhur.dicoding.myapplication.databinding.FragmentBBinding

class BFragment : Fragment() {

    val safeArgs: BFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        val binding = FragmentBBinding.bind(view)

        binding.secondTextView.text = safeArgs.name

        return view
    }
}
