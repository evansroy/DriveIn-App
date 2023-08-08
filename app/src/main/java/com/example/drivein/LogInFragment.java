package com.example.drivein;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class LogInFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_log_in, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Find the register button
        View registerButton = view.findViewById(R.id.tvRegister);
        View forgotPass = view.findViewById(R.id.tvForgotPassword);

        // Set a click listener on the button
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the navigation controller
                NavController navController = Navigation.findNavController(v);

                // Navigate to the register fragment
                navController.navigate(R.id.action_logInFragment_to_createAccountFragment);
            }
        });

        forgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the navigation controller
                NavController navController = Navigation.findNavController(view);
                // Navigate to the Reset fragment
                navController.navigate(R.id.action_logInFragment_to_forgotPasswordFragment);
            }
        });
    }
}
