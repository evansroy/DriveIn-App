package com.example.drivein;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class ForgotPasswordFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forgot_password, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Find the login button
        View registerButton = view.findViewById(R.id.tvLogInReset);

        // Set a click listener on the button
        registerButton  .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the navigation controller
                NavController navController = Navigation.findNavController(v);

                // Navigate to the login fragment
                navController.navigate(R.id.action_forgotPasswordFragment_to_logInFragment  );
            }
        });
    }
}