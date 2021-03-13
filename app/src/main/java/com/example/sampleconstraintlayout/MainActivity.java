package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi Variable utk button
    Button btnLogin;

    //Deklarasi variable utk EditText
    EditText edemail,edpassoword;

    //deklarasi variable untuk email dan password
    String nama,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variable btnlogin dengan componen button pada layout
        btnLogin=findViewById(R.id.btSignin);

        //Menghubungkan variable edemail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variable edPassword dengan componen button pada layout
        edpassoword=findViewById(R.id.edPassword);

        //membuat fungsi onclick pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Menyimpan input user di editText email kedalam variable nama
                nama = edemail.getText().toString();

                //Menyimpan input user di editText password kedalam variable password
                password = edpassoword.getText().toString();

//                //Membuat Variable Toast dan membuat toast dengan menambahkan variable nama dan password
//                Toast t = Toast.makeText(getApplicationContext(),
//                        "email anda: "+nama+" dan password anda: "+password+"", Toast.LENGTH_LONG);
//                //Menampilkan Toast
//                t.show();
                Validasi();
            }
        });

    }

    public void Validasi(){
        if (nama.equals("admin") && password.equals("password")) {
            Toast.makeText(this,"Login Berhasil", Toast.LENGTH_SHORT).show();

        }else if (nama!=("admin")){
            Toast.makeText(this,"Email Salah", Toast.LENGTH_SHORT).show();
            return;
        }else if (password!=("password")){
            Toast.makeText(this,"Password Salah", Toast.LENGTH_SHORT).show();
            return;
        } else {
            Toast.makeText(this, "Email Dan Password Salah", Toast.LENGTH_SHORT).show();
        }
    }


}