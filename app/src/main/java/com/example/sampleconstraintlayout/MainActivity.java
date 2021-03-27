package com.example.sampleconstraintlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

                //Set Email Yang benar
                String email = "admin@gmail.com";
                //Set Password Yang benar
                String pass = "123";

                // mengecek apakah isi dari email dan password sudah sama dengan email dan password
                //yang di set

                if (nama.equals(email) && password.equals(pass)) {
                    //Membuat variable Toast dan Menampilkan Pesan "Login Sukses"
                    Toast t = Toast.makeText(getApplicationContext(),
                            "LoginSukses",
                            Toast.LENGTH_LONG);

                    //Mnampilkan Toast
                    t.show();

                    //Membuat Object Bundle
                    Bundle b = new Bundle();

                    //masukan value dari variable nama dengan kunci "a"
                    //dan dimasukan kedalam bundle
                    b.putString("a", nama.trim());

                    //masukan value dari variable nama dengan kunci "a"
                    //dan dimasukan kedalam bundle
                    b.putString("b", password.trim());

                    //membuat objek intent berpindah activity dari mainactivity ke Activity Hasil
                    Intent i = new Intent(getApplicationContext(), ActivityKedua.class);

                    i.putExtras(b);

                    startActivity(i);
                } else{
                    //membuat variable toast dan membuat toast login gagal

                    Toast t = Toast.makeText(getApplicationContext(),
                            "login Gagal", Toast.LENGTH_LONG);

                    t.show();
                }

//                //Membuat Variable Toast dan membuat toast dengan menambahkan variable nama dan password
//                Toast t = Toast.makeText(getApplicationContext(),
//                        "email anda: "+nama+" dan password anda: "+password+"", Toast.LENGTH_LONG);
//                //Menampilkan Toast
//                t.show();
//                Validasi();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Membuat kondisi jika yang dipilih adalah mnDaftar
        if( item.getItemId()  == R.id.mnDaftar)
        {
            //Method untuk memanggil activity "Daftar Activity"
            Intent i = new Intent(getApplicationContext(), DaftarActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Method untuk Menampilkan Menu
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

//    public void Validasi(){
//        if (nama.equals("admin") && password.equals("password")) {
//            Toast.makeText(this,"Login Berhasil", Toast.LENGTH_SHORT).show();
//
//        }else if (nama!=("admin")){
//            Toast.makeText(this,"Email Salah", Toast.LENGTH_SHORT).show();
//            return;
//        }else if (password!=("password")){
//            Toast.makeText(this,"Password Salah", Toast.LENGTH_SHORT).show();
//            return;
//        } else {
//            Toast.makeText(this, "Email Dan Password Salah", Toast.LENGTH_SHORT).show();
//        }
//    }


}