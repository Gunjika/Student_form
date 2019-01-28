package gunjika.varshney.gla.student_form;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText et_name,et_reg,et_phone,et_address,et_age,et_city,et_mail;
    TextView form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        et_name=findViewById(R.id.et_name);
        et_reg=findViewById(R.id.et_reg);
        et_phone=findViewById(R.id.et_no);
        et_age=findViewById(R.id.et_age);
        et_mail=findViewById(R.id.et_id);
        et_address=findViewById(R.id.et_ad);
        et_city=findViewById(R.id.et_city);
        form=findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "your entry is valid", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
