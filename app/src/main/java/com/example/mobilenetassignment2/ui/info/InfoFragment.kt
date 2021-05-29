package com.example.mobilenetassignment2.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.mobilenetassignment2.R
import com.example.mobilenetassignment2.databinding.InfoFragmentBinding
import com.squareup.picasso.Picasso

class InfoFragment : Fragment() {

    companion object {
        fun newInstance() = InfoFragment()
    }

    lateinit var binding: InfoFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.info_fragment, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        try {
            Picasso.get().load(getString(R.string.movahed_image).toUri()).into(binding.movahedImg)
        } catch (e: Exception) {
        }

        try {
            Picasso.get().load(getString(R.string.pooya_image).toUri()).into(binding.pooyaImg)
        } catch (e: Exception) {
        }
    }

}