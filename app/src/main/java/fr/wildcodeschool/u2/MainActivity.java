package fr.wildcodeschool.u2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox CheckChek = findViewById(R.id.checkBoxClick);
        CheckChek.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b== true) {
                    EditText firstname = findViewById(R.id.firstname);
                    firstname.setEnabled(true);
                    EditText lastname = findViewById(R.id.lastname);
                    lastname.setEnabled(true);
                    Button button = findViewById(R.id.button);
                    button.setEnabled(true);


                } else {

                    EditText firstname = findViewById(R.id.firstname);
                    firstname.setEnabled(false);
                    EditText lastname = findViewById(R.id.lastname);
                    lastname.setEnabled(false);
                    Button button = findViewById(R.id.button);
                    button.setEnabled(false);


                }
                Button button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        EditText firstname = findViewById(R.id.firstname);
                        String firstnamecontent = firstname.getText().toString();
                        EditText lastname = findViewById(R.id.lastname);
                        String lastnamecontent = lastname.getText().toString();
                        if (firstnamecontent.isEmpty() || lastnamecontent.isEmpty()){
                            Toast.makeText(MainActivity.this, "Please insert your Lastname and Firstname", Toast.LENGTH_SHORT).show();

                        }

                         else
                        {
                            TextView textvisible = findViewById(R.id.ghost);
                            textvisible.setVisibility(View.VISIBLE);
                            String message = ("Congratulation " + firstnamecontent +" " + lastnamecontent);
                            textvisible.setText(message);

                        }

                    }
                });

            }
        });


    }
}
