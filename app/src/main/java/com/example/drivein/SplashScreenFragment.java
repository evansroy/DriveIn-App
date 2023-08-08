package com.example.drivein;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class SplashScreenFragment extends Fragment {

    private static final long SPLASH_DELAY_MS = 3000; // Adjust the delay time as needed

    public SplashScreenFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash_screen, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Get the navigation controller
                NavController navController = Navigation.findNavController(requireView());

                // Navigate to the main screen fragment
                navController.navigate(R.id.action_splashScreenFragment_to_logInFragment);
            }
        }, SPLASH_DELAY_MS);
    }
}
