package com.example.madlab.experiment3

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.madlab.experiment3.databinding.FragmentStudentDetailsBinding

class StudentDetailsFragment : Fragment() {

    private var _binding: FragmentStudentDetailsBinding? = null
    private val binding get() = _binding!!
    
    private val TAG = "StudentDetailsFragment"
    private val logBuffer = StringBuilder()

    private fun updateLog(method: String, description: String) {
        val userInfo = "Name: Mrigank Shukla | USN: 25MCAR0109"
        val msg = "Frag Lifecycle: $method()\n$userInfo\nDesc: $description"
        Log.d(TAG, msg)
        logBuffer.insert(0, "$msg\n--------------------\n")
        _binding?.lifecycleLogTextView?.text = logBuffer.toString()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        updateLog("onAttach", "Fragment is being attached to Activity.")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        updateLog("onCreate", "Fragment is being created.")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentStudentDetailsBinding.inflate(inflater, container, false)
        updateLog("onCreateView", "Creating Fragment UI view hierarchy.")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        updateLog("onViewCreated", "Fragment view is now created and ready.")
    }

    override fun onStart() {
        super.onStart()
        updateLog("onStart", "Fragment is becoming visible.")
    }

    override fun onResume() {
        super.onResume()
        updateLog("onResume", "Fragment is now interactive.")
    }

    override fun onPause() {
        super.onPause()
        updateLog("onPause", "Fragment is pausing (moving to background).")
    }

    override fun onStop() {
        super.onStop()
        updateLog("onStop", "Fragment is no longer visible.")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        updateLog("onDestroyView", "Cleaning up resources related to Fragment view.")
        _binding = null
    }

    override fun onDestroy() {
        super.onDestroy()
        updateLog("onDestroy", "Fragment is being destroyed.")
    }

    override fun onDetach() {
        super.onDetach()
        updateLog("onDetach", "Fragment is being detached from Activity.")
    }
}
