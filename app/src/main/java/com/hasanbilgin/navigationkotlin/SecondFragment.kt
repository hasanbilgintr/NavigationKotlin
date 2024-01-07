package com.hasanbilgin.navigationkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.hasanbilgin.navigationkotlin.databinding.FragmentFirstBinding
import com.hasanbilgin.navigationkotlin.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentSecondBinding.inflate(layoutInflater)
        //eklendi
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //argument verilince almak için
        //argument varsa direk işelme alır (metot çalışır)
        arguments?.let {
            val kullaniciAdi = SecondFragmentArgs.fromBundle(it).username
            binding.textview2.text = kullaniciAdi
        }

        binding.button2.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

}