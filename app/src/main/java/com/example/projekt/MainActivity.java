package com.example.projekt;
import android.health.connect.datatypes.units.Length;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName;
    private EditText editTextSurname;
    private EditText editTextEmail;
    private EditText editTextNumber;
    private Button buttonSubmit;
    private EditText editTextPassword;
    private EditText editTextPassword2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Powiązanie widoków z kodem
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextNumber = findViewById(R.id.editTextNumber);
        editTextSurname = findViewById(R.id.editTextSurname);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextPassword2 = findViewById(R.id.editTextPassword2);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pobranie wprowadzonych danych
                String name = editTextName.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String number = editTextNumber.getText().toString().trim();
                String surname = editTextSurname.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();
                String password2 = editTextPassword2.getText().toString().trim();
                // Walidacja danych
                if (name.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić imię", Toast.LENGTH_SHORT).show();
                } else if (surname.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić Nazwisko", Toast.LENGTH_SHORT).show();
                } else if (email.isEmpty() ) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić adres e-mail", Toast.LENGTH_SHORT).show();
                }else if
                (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    Toast.makeText(MainActivity.this, "Niepoprawny adres email", Toast.LENGTH_SHORT).show();
                }else if (number.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić numer telefonu", Toast.LENGTH_SHORT).show();
                }else if (!number.matches("\\d{9,}")) {
                    Toast.makeText(MainActivity.this, "Numer telefonu musi zawierać co najmniej 9 cyfr", Toast.LENGTH_SHORT).show();
                }
                 else if (password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić haslo", Toast.LENGTH_SHORT).show();
                }else if (!password.matches("\\d{6,}")) {
                    Toast.makeText(MainActivity.this, "Haslo musi zawierać co najmniej 6 cyfr", Toast.LENGTH_SHORT).show();
                } else if (password2.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Proszę wprowadzić potwierdzenie hasla", Toast.LENGTH_SHORT).show();
                }else if (!password2.equals(password)) {
                    Toast.makeText(MainActivity.this, "Haslo jest nie prawidlowe", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Formularz przesłany poprawnie", Toast.LENGTH_SHORT).show();
                }



            }
        });
    }
}
