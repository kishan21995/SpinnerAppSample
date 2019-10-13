package marketplace.jpr.com.spinnerappsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);

        List<String>list=new ArrayList<String>();
        list.add("Select Course");
        list.add("DotNet");
        list.add("Jva 8");
        list.add("Android");
        list.add("Php");
        list.add("Web Desiging");
        list.add("Seo");
        list.add("Digital Marketing");
        list.add("Software Testing");
        list.add("Auto CAD");
        list.add("Catia");
        list.add("Stad Pro");
        list.add("Solid works");
        list.add("Cero");
        list.add("Revit");
        list.add("UI/UX Designer");

        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        //jo hum item select kre vo spinner pe dikh jaye//
      spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          @Override

          //ek jo show krana h//
          public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
              spinner.setSelection(i);

          }

          @Override
          //ek jo show nhi h//
          public void onNothingSelected(AdapterView<?> adapterView) {

          }
      });


    }
}
