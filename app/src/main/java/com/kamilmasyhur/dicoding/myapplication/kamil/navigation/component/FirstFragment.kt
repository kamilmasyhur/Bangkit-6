package com.kamilmasyhur.dicoding.myapplication.kamil.navigation.component

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.kamilmasyhur.dicoding.myapplication.R
import com.kamilmasyhur.dicoding.myapplication.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_first, container, false)

        val binding = FragmentFirstBinding.bind(view)
        binding.myText.text = "Check my text"
        binding.myText.setOnClickListener {
            val action = FirstFragmentDirections.navigateToSecondFragment()
            action.name = "cek cek"
            Navigation.findNavController(view).navigate(action)
        }

        return view
    }
}
