package com.example.mobilenetassignment2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobilenetassignment2.R
import com.example.mobilenetassignment2.databinding.HomeFragmentBinding
import com.example.mobilenetassignment2.model.entity.ArtistEntity

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() =
            HomeFragment()
    }

    private val viewModel: HomeViewModel by lazy {
        ViewModelProvider(this).get(HomeViewModel::class.java)
    }

    var adapter: ArtistListAdapter? = null

    lateinit var binding: HomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        adapter = ArtistListAdapter(object : OnItemClickListener {
            override fun onItemClicked(artistEntity: ArtistEntity) {
                findNavController().navigate(
                    HomeFragmentDirections.actionHomeFragmentToDetailsFragment(
                        artistEntity.id
                    )
                )
            }
        })

        binding.artistListRv.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = this@HomeFragment.adapter

        }

        initializeListeners()
        initializeObservers()
    }

    private fun initializeListeners() {
        binding.toolbarHome.setOnMenuItemClickListener {item ->
            if (item.itemId == R.id.info_btn){
                findNavController().navigate(
                    HomeFragmentDirections.actionHomeFragmentToInfoFragment()
                )
            }
            true
        }
    }

    private fun initializeObservers() {
        viewModel.artists.observe(viewLifecycleOwner, { artists ->
            adapter?.submitList(artists)
        })
    }
}
