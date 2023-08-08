package com.example.drivein;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class CreateAccountFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_create_account, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Find the login button
        View loginButton = view.findViewById(R.id.tvLogIn);

        // Set a click listener on the button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the navigation controller
                NavController navController = Navigation.findNavController(v);

                // Navigate to the login fragment
                navController.navigate(R.id.action_createAccountFragment_to_logInFragment);
            }
        });
    }
}
