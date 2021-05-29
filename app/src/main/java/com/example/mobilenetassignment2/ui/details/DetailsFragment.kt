package com.example.mobilenetassignment2.ui.details

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController

import com.example.mobilenetassignment2.R
import com.example.mobilenetassignment2.databinding.DetailsFragmentBinding
import com.squareup.picasso.Picasso

class DetailsFragment : Fragment() {

    companion object {
        fun newInstance() = DetailsFragment()
    }

    private val TAG = "DetailsFragment"

    private val viewModel: DetailsViewModel by lazy {
        ViewModelProvider(this).get(DetailsViewModel::class.java)
    }

    lateinit var binding: DetailsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.details_fragment, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val artistId = DetailsFragmentArgs.fromBundle(requireArguments()).id
        viewModel.fetchArtist(artistId)

        viewModel.artistEntity.observe(viewLifecycleOwner, { artistEntity ->
            binding.artist = artistEntity
            binding.executePendingBindings()
        })

        binding.toolbarEventDetail.setNavigationOnClickListener {
            findNavController().navigateUp()
        }
    }


}
