package com.iuri.task.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.iuri.task.R
import com.iuri.task.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!
    private val handler = Handler(Looper.getMainLooper())
    private val openNext = Runnable {
        if (isAdded) {
            findNavController().navigate(R.id.action_splash_to_authentication)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        handler.postDelayed(openNext, 3000)
    }

    override fun onDestroyView() {
        handler.removeCallbacks(openNext)
        _binding = null
        super.onDestroyView()
    }
}
