package pe.edu.idat.appzegarrajosue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import pe.edu.idat.appzegarrajosue.databinding.ActivityListadoBinding;

public class ListadoActivity extends AppCompatActivity {

    private ActivityListadoBinding binding;

    private List<String> librosMed = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListadoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}