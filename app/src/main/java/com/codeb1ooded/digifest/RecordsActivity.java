package com.codeb1ooded.digifest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by megha on 03/12/17.
 */

public class RecordsActivity extends AppCompatActivity {

    FloatingActionButton addNewRecord;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);

        addNewRecord = (FloatingActionButton) findViewById(R.id.add_record);
        addNewRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecordsActivity.this, InputDetailsForm.class);
                startActivity(intent);
            }
        });
    }

}
