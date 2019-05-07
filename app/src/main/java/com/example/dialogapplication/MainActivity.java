package com.example.dialogapplication;

import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ExampleDialog.ExampleDialogListener {

    private TextView textusername;
    private TextView textpassword;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textusername = (TextView)findViewById(R.id.textView_username);
        textpassword = (TextView)findViewById(R.id.textView_passeword);
        button = (Button)findViewById(R.id.Btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
            }
        });
    }

    public void openDialog()
    {
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(),"example_dialog");

    }

    @Override
    public void applyTexts(String username, String password) {
        textusername.setText(username);
        textpassword.setText(password);

    }
}
