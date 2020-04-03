package com.example.parkinglotdisabledpeoplemadridfinal.ui.Incidents;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.parkinglotdisabledpeoplemadridfinal.R;

public class IncidentFragment extends Fragment {

    private IncidenciasViewModel galleryViewModel;

    //Introducir el email al cual mandar la incidencia
    String[] address = {"jesuspradosp@gmail.com"};
    String subject = "Incidencia Plaza Aparcamiento";
    String text = "";

    EditText calle;
    EditText tipo;
    EditText observaciones;
    Button sendButton;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.incidencias_fragment, container, false);

        calle = root.findViewById(R.id.editTextCalle);
        tipo = root.findViewById(R.id.editTextType);
        observaciones= root.findViewById(R.id.editTextComments);

        sendButton= root.findViewById(R.id.buttonSend);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Indicendia:\n" +
                        "Calle: " + calle.getText() + "\n"
                        + "Tipo de incidencia: " + tipo.getText() + "\n"
                        + "Observaciones: " + observaciones.getText();

                composeEmail(address, subject, text);
            }
        });


        return root;
    }

    public void composeEmail(String[] addresses, String subject, String text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        try {
            startActivity(intent);
        }catch (Exception e){
            e.getMessage();
        }
    }
}
