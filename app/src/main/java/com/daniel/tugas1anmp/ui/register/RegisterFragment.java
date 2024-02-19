package com.daniel.tugas1anmp.ui.register;

public class RegisterFragment {
    override fun

    onCreateView(
            inflater:LayoutInflater,
            container:ViewGroup?,
            savedInstanceState:Bundle?
    ):

    View {
        val notificationsViewModel =
                ViewModelProvider(this).get(NotificationsViewModel:: class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root:View = binding.root

        val textView:TextView = binding.textNotifications
        notificationsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
}
