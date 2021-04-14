package com.example.exmplodialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonHello;
    private View view;
    private String[] cores = {"branco", "azul", "vermelho", "verde", "preto"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonHello = findViewById(R.id.buttonHello);
        view = findViewById(R.id.layoutPrincipal);

    }//onCreate
    public void clicar(View view){

        criarDialog();
    }//clicar

    private void criarDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Cores")
                .setIcon(R.mipmap.ic_launcher)
                //.setSingleChoiceItems(cores, 0,new DialogInterface.OnClickListener() {
                .setItems(cores, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        switch (i) {
                            case 0:
                                view.setBackgroundColor(getResources().getColor(R.color.white));
                                Toast.makeText(getApplicationContext(), "Branco", Toast.LENGTH_SHORT).show();
                                break;
                            case 1:
                                view.setBackgroundColor(getResources().getColor(R.color.azul));
                                Toast.makeText(getApplicationContext(), "Azul", Toast.LENGTH_SHORT).show();
                                break;
                            case 2:
                                view.setBackgroundColor(getResources().getColor(R.color.vermelho));
                                Toast.makeText(getApplicationContext(), "Vermelho", Toast.LENGTH_SHORT).show();
                                break;
                            case 3:
                                view.setBackgroundColor(getResources().getColor(R.color.verdde));
                                Toast.makeText(getApplicationContext(), "Verde", Toast.LENGTH_SHORT).show();
                                break;
                            case 4:
                                view.setBackgroundColor(getResources().getColor(R.color.black));
                                Toast.makeText(getApplicationContext(), "Preto", Toast.LENGTH_SHORT).show();
                                break;
                        }//switch
                    }
                })
                .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Você clicou em sim!", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Você clicou em não!", Toast.LENGTH_SHORT).show();
                    }
                });
        builder.show();
    }//criarDialog

    private void criarDialogMulti(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Cores")
                .setIcon(R.mipmap.ic_launcher)
                .setMultiChoiceItems(cores, null,new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which, boolean isChecked) {
                                if(isChecked) {
                                    switch (which){
                                        case 0:
                                            Toast.makeText(getApplicationContext(), "Branco", Toast.LENGTH_SHORT).show();
                                            break;
                                        case 1:
                                            Toast.makeText(getApplicationContext(), "Azul", Toast.LENGTH_SHORT).show();
                                            break;
                                        case 2:
                                            Toast.makeText(getApplicationContext(), "Vermelho", Toast.LENGTH_SHORT).show();
                                            break;
                                        case 3:
                                           Toast.makeText(getApplicationContext(), "Verde", Toast.LENGTH_SHORT).show();
                                            break;
                                        case 4:
                                            Toast.makeText(getApplicationContext(), "Preto", Toast.LENGTH_SHORT).show();
                                            break;
                        }//switch
                         };//if
                    }
                })
                .setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Você clicou em sim!", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Você clicou em não!", Toast.LENGTH_SHORT).show();
                    }
                });
        builder.show();
    }//criarDialogMulti

}//class