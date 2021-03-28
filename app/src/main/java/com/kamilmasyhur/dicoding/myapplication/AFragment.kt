package com.kamilmasyhur.dicoding.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kamilmasyhur.dicoding.myapplication.databinding.FragmentABinding

class AFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        val binding = FragmentABinding.bind(view)

        binding.firstTextView.text = "Random"
        binding.firstTextView.setOnClickListener {
            val action = AFragmentDirections.actionAFragmentToBFragment()
            action.name = "Budiman"
            Navigation.findNavController(view).navigate(action)
        }

        return view
    }

}
