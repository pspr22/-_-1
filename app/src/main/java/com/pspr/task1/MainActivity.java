package com.pspr.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner mains,sub1,sub2;
    ArrayAdapter adapterm,subadapter1,subadapter2,subadapter3;
    String m="Length";
    String le = "cm";
    String len = "cm";
    EditText con1;
    TextView ans;
    Double res;
    Button click;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mains = findViewById(R.id.spinnerm);
        sub1 = findViewById(R.id.sub1);
        sub2 = findViewById(R.id.sub2);
        con1 = findViewById(R.id.con1);
        ans= findViewById(R.id.ans);
        click = findViewById(R.id.click);

        adapterm = ArrayAdapter.createFromResource(this,R.array.main, android.R.layout.simple_spinner_item);
        adapterm.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mains.setAdapter(adapterm);

        subadapter1 = ArrayAdapter.createFromResource(this,R.array.len, android.R.layout.simple_spinner_item);
        subadapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        subadapter2 = ArrayAdapter.createFromResource(this,R.array.weight, android.R.layout.simple_spinner_item);
        subadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        subadapter3 = ArrayAdapter.createFromResource(this,R.array.vol, android.R.layout.simple_spinner_item);
        subadapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mains.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                m = adapterView.getSelectedItem().toString();
                if(m.equals("Length")){
                    sub1.setAdapter(subadapter1);
                    sub2.setAdapter(subadapter1);
                }

                if(m.equals("Weight")){
                    sub1.setAdapter(subadapter2);
                    sub2.setAdapter(subadapter2);
                }

                if(m.equals("Volume")){
                    sub1.setAdapter(subadapter3);
                    sub2.setAdapter(subadapter3);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sub1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                le = adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sub2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                len = adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Length_conversion();
                Weight_Conversion();
                Volume_Converter();
            }
        });




    }

    public void Length_conversion(){
        res = Double.parseDouble("0"+con1.getText().toString());
        if(le.equals("cm") && len.equals("cm")){
            ans.setText(""+res*1+"cm");
        }
        if(le.equals("cm") && len.equals("m")){
            ans.setText(""+res*0.01+"m");
        }
        if(le.equals("cm") && len.equals("km")){
            ans.setText(""+res*0.00001+"km");
        }
        if(le.equals("cm") && len.equals("inches")){
            ans.setText(""+res*0.393701+"inches");
        }
        if(le.equals("cm") && len.equals("feet")){
            ans.setText(""+res*0.0328084+"feet");
        }
        if(le.equals("cm") && len.equals("miles")){
            ans.setText(""+res*0.0000062137119223733+"miles");
        }

        if(le.equals("m") && len.equals("cm")){
            ans.setText(""+res*100+"cm");
        }
        if(le.equals("m") && len.equals("m")){
            ans.setText(""+res*1+"m");
        }
        if(le.equals("m") && len.equals("km")){
            ans.setText(""+res*0.001+"km");
        }
        if(le.equals("m") && len.equals("inches")){
            ans.setText(""+res*39.3701+"inches");
        }
        if(le.equals("m") && len.equals("feet")){
            ans.setText(""+res*3.28084+"feet");
        }
        if(le.equals("m") && len.equals("miles")){
            ans.setText(""+res*0.000621371+"miles");
        }

        if(le.equals("km") && len.equals("cm")){
            ans.setText(""+res*100000+"cm");
        }
        if(le.equals("km") && len.equals("m")){
            ans.setText(""+res*1000+"m");
        }
        if(le.equals("km") && len.equals("km")){
            ans.setText(""+res*1+"km");
        }
        if(le.equals("km") && len.equals("inches")){
            ans.setText(""+res*39370.1+"inches");
        }
        if(le.equals("km") && len.equals("feet")){
            ans.setText(""+res*3280.84+"feet");
        }
        if(le.equals("km") && len.equals("miles")){
            ans.setText(""+res*0.621371+"miles");
        }

        if(le.equals("inches") && len.equals("cm")){
            ans.setText(""+res*2.54+"cm");
        }
        if(le.equals("inches") && len.equals("m")){
            ans.setText(""+res*0.0254+"m");
        }
        if(le.equals("inches") && len.equals("km")){
            ans.setText(""+res*0.0000254+"km");
        }
        if(le.equals("inches") && len.equals("inches")){
            ans.setText(""+res*1+"inches");
        }
        if(le.equals("inches") && len.equals("feet")){
            ans.setText(""+res*0.0833333+"feet");
        }
        if(le.equals("inches") && len.equals("miles")){
            ans.setText(""+res*0.0000157828+"miles");
        }

        if(le.equals("feet") && len.equals("cm")){
            ans.setText(""+res*30.48+"cm");
        }
        if(le.equals("feet") && len.equals("m")){
            ans.setText(""+res*0.3048+"m");
        }
        if(le.equals("feet") && len.equals("km")){
            ans.setText(""+res*0.0003048+"km");
        }
        if(le.equals("feet") && len.equals("inches")){
            ans.setText(""+res*12+"inches");
        }
        if(le.equals("feet") && len.equals("feet")){
            ans.setText(""+res*1+"feet");
        }
        if(le.equals("feet") && len.equals("miles")){
            ans.setText(""+res*0.000189394+"miles");
        }

        if(le.equals("miles") && len.equals("cm")){
            ans.setText(""+res*160934+"cm");
        }
        if(le.equals("miles") && len.equals("m")){
            ans.setText(""+res*1609.34+"m");
        }
        if(le.equals("miles") && len.equals("km")){
            ans.setText(""+res*1.60934+"km");
        }
        if(le.equals("miles") && len.equals("inches")){
            ans.setText(""+res*63360+"inches");
        }
        if(le.equals("miles") && len.equals("feet")){
            ans.setText(""+res*5280+"feet");
        }
        if(le.equals("miles") && len.equals("miles")){
            ans.setText(""+res*1+"miles");
        }

    }


    public void Weight_Conversion(){
        res = Double.parseDouble("0"+con1.getText().toString());
        if(le.equals("mg") && len.equals("mg")){
            ans.setText(""+res*1+"mg");
        }
        if(le.equals("mg") && len.equals("gram")){
            ans.setText(""+res*0.001+"gram");
        }
        if(le.equals("mg") && len.equals("kg")){
            ans.setText(""+res*0.000001+"kg");
        }
        if(le.equals("mg") && len.equals("tonne")){
            ans.setText(""+res*0.000000001+"tonne");
        }
        if(le.equals("mg") && len.equals("ounce")){
            ans.setText(""+res*0.000035274+"ounce");
        }
        if(le.equals("mg") && len.equals("pound")){
            ans.setText(""+res*0.00000220462+"pound");
        }

        if(le.equals("gram") && len.equals("mg")){
            ans.setText(""+res*1000+"mg");
        }
        if(le.equals("gram") && len.equals("gram")){
            ans.setText(""+res*1+"gram");
        }
        if(le.equals("gram") && len.equals("kg")){
            ans.setText(""+res*0.001+"kg");
        }
        if(le.equals("gram") && len.equals("tonne")){
            ans.setText(""+res*0.000001+"tonne");
        }
        if(le.equals("gram") && len.equals("ounce")){
            ans.setText(""+res*0.035274+"ounce");
        }
        if(le.equals("gram") && len.equals("pound")){
            ans.setText(""+res*0.00220462+"pound");
        }

        if(le.equals("kg") && len.equals("mg")){
            ans.setText(""+res*1000000+"mg");
        }
        if(le.equals("kg") && len.equals("gram")){
            ans.setText(""+res*1000+"gram");
        }
        if(le.equals("kg") && len.equals("kg")){
            ans.setText(""+res*1+"kg");
        }
        if(le.equals("kg") && len.equals("tonne")){
            ans.setText(""+res*0.001+"tonne");
        }
        if(le.equals("kg") && len.equals("ounce")){
            ans.setText(""+res*35.274+"ounce");
        }
        if(le.equals("kg") && len.equals("pound")){
            ans.setText(""+res*2.20462+"pound");
        }

        if(le.equals("tonne") && len.equals("mg")){
            ans.setText(""+res*1000000000+"mg");
        }
        if(le.equals("tonne") && len.equals("gram")){
            ans.setText(""+res*1000000+"gram");
        }
        if(le.equals("tonne") && len.equals("kg")){
            ans.setText(""+res*1000+"kg");
        }
        if(le.equals("tonne") && len.equals("tonne")){
            ans.setText(""+res*1+"tonne");
        }
        if(le.equals("tonne") && len.equals("ounce")){
            ans.setText(""+res*35274+"ounce");
        }
        if(le.equals("tonne") && len.equals("pound")){
            ans.setText(""+res*2204.62+"pound");
        }

        if(le.equals("ounce") && len.equals("mg")){
            ans.setText(""+res*28349.5+"mg");
        }
        if(le.equals("ounce") && len.equals("gram")){
            ans.setText(""+res*28.3495+"gram");
        }
        if(le.equals("ounce") && len.equals("kg")){
            ans.setText(""+res*0.0283495+"kg");
        }
        if(le.equals("ounce") && len.equals("tonne")){
            ans.setText(""+res*0.0000283495+"tonne");
        }
        if(le.equals("ounce") && len.equals("ounce")){
            ans.setText(""+res*1+"ounce");
        }
        if(le.equals("ounce") && len.equals("pound")){
            ans.setText(""+res*0.0625+"pound");
        }

        if(le.equals("pound") && len.equals("mg")){
            ans.setText(""+res*453592+"mg");
        }
        if(le.equals("pound") && len.equals("gram")){
            ans.setText(""+res*453.592+"gram");
        }
        if(le.equals("pound") && len.equals("kg")){
            ans.setText(""+res*0.453592+"kg");
        }
        if(le.equals("pound") && len.equals("tonne")){
            ans.setText(""+res*0.000453592+"tonne");
        }
        if(le.equals("pound") && len.equals("ounce")){
            ans.setText(""+res*16+"ounce");
        }
        if(le.equals("pound") && len.equals("pound")){
            ans.setText(""+res*1+"pound");
        }

    }

    public void Volume_Converter(){
        res = Double.parseDouble("0"+con1.getText().toString());
        if(le.equals("ml") && len.equals("litre")){
            ans.setText(""+res*0.001+"litre");
        }
        if(le.equals("litre") && len.equals("litre")){
            ans.setText(""+res*1+"litre");
        }
        if(le.equals("litre") && len.equals("ml")){
            ans.setText(""+res*1000+"ml");
        }
        if(le.equals("ml") && len.equals("ml")){
            ans.setText(""+res*1+"ml");
        }

    }


















}