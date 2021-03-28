package com.kamilmasyhur.dicoding.myapplication.kamil.navigation.component

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.kamilmasyhur.dicoding.myapplication.R
import com.kamilmasyhur.dicoding.myapplication.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {

    val safeArgs: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val binding = FragmentSecondBinding.bind(view)
        binding.myTextSecondFragment.text = safeArgs.name

        binding.myTextSecondFragment.setOnClickListener {
            val action = SecondFragmentDirections.navigateToFirstFragment()
            Navigation.findNavController(view).navigate(action)
        }


        return view
    }
}
