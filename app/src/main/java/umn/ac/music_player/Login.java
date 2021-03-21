package umn.ac.music_player;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText Username, Password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = findViewById(R.id.uname);
        Password = findViewById(R.id.pass);
        btnLogin = findViewById(R.id.login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(Username.getText().toString().equals("uasmobile") && Password.getText().toString().equals("uasmobilegenap")){
                    gotoPlayer();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Invalid Username / Password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void gotoPlayer()
    {
        Intent intent = new Intent(this, Player.class);
        startActivity(intent);
    }
}