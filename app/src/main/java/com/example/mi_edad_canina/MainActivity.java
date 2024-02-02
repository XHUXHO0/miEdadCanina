package com.example.mi_edad_canina;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mi_edad_canina.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // nivel de logs para testear una app

        Log.v("MainAtivity", "Activity created verbose");
        Log.d("MainAtivity", "Activity created debug");
        Log.i("MainAtivity", "Activity created info");
        Log.w("MainAtivity", "Activity created warning");
        Log.e("MainAtivity", "Activity created error");

        binding.botton.setOnClickListener(v -> {
            String age = binding.ageEdit.getText().toString();
            if(!age.isEmpty()){
                int ageInt = Integer.parseInt(age);
                int result = ageInt * 7;
                String resultString = getString(R.string.result_format, result);
                binding.resultText.setText(resultString);
            }else{
                Log.d("MainAtivity", "Age Field is empty");
                Toast.makeText(this, getString(R.string.you_have_to_insert_an_age), Toast.LENGTH_SHORT).show();
            }
        });
    }


}