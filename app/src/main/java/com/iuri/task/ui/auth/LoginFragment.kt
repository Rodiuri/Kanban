package com.iuri.task.ui.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.iuri.task.R
import com.iuri.task.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.textCreateAccount.setOnClickListener { findNavController().navigate(R.id.action_login_to_register) }
        binding.textRecoverAccount.setOnClickListener { findNavController().navigate(R.id.action_login_to_recover) }
        binding.buttonLogin.setOnClickListener {
            findNavController().navigate(R.id.action_authentication_to_home)
        }
    }

    override fun onDestroyView() { _binding = null; super.onDestroyView() }
}
