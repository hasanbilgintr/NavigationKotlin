package com.hasanbilgin.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.hasanbilgin.navigationkotlin.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    //eklendi
    private lateinit var binding: FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        //eklendi
        binding = FragmentFirstBinding.inflate(layoutInflater)
        //eklendi
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.button1.setOnClickListener {
//            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            //argument verilmezzse atil olarak gelir
            //argument verilince Rebuild Project yapılması şart
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("hasan")
            Navigation.findNavController(it).navigate(action)
        }


    }


}