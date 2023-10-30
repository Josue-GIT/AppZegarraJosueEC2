package pe.edu.idat.appzegarrajosue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import pe.edu.idat.appzegarrajosue.databinding.ActivityFormBinding;

public class FormActivity extends AppCompatActivity {

    private ActivityFormBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFormBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}