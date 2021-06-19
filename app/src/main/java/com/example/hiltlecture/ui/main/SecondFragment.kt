package com.example.hiltlecture.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hiltlecture.R
import com.example.hiltlecture.databinding.FragmentSecondBinding
import com.example.hiltlecture.data.MyRepository
import com.example.hiltlecture.di.qualifier.ActivityHash
import com.example.hiltlecture.di.qualifier.AppHash
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

//hilt로부터 의존성 주입을 받는 대상이 되는 객체가 있는 곳에 기입하는 어노테이션
@AndroidEntryPoint
class SecondFragment : Fragment(R.layout.fragment_second) {

    private lateinit var binding: FragmentSecondBinding


    @Inject //hilt로부터 의존성 주입을 시킬 객체에 기입하는 어노테이션
    lateinit var repository: MyRepository

    @AppHash
    @Inject //Inject가 작동하는 원리는 type이다. String으로 제공하는 모듈이(di패키지에서) 2개이상이면 에러발생(뭐가 들어가야할지 모르므로)
    //그래서 AppHash와 같은 어노테이션을 사용하는것임
    lateinit var applicationHash: String

    @ActivityHash
    @Inject //Inject가 작동하는 원리는 type이다. String으로 제공하는 모듈이(di패키지에서) 2개이상이면 에러발생(뭐가 들어가야할지 모르므로)
    //그래서 AppHash와 같은 어노테이션을 사용하는것임
    lateinit var activityHash: String

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSecondBinding.bind(view)

        binding.button.setOnClickListener {

        findNavController().navigate(R.id.action_secondFragment_to_mainFragment)

        }

    }

}