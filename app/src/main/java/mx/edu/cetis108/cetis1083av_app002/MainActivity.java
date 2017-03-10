package mx.edu.cetis108.cetis1083av_app002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
     EditText oper1,oper2;
     TextView texto;
     Button b1,b2,b3,b4;
    Integer n1, n2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oper1 = (EditText) findViewById(R.id.editText);
        oper2 = (EditText) findViewById(R.id.editText2);
        texto = (TextView) findViewById(R.id.textview);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);




    }
    public void sumar(View v){
          n1 =Integer.valueOf((oper1).getText().toString());
          n2=Integer.valueOf((oper2).getText().toString());
          sum=n1+n2;
        texto.setText(sum.toString());


    }
    public void restar(View v) {
         n1 = Integer.valueOf((oper1).getText().toString());
         n2 = Integer.valueOf((oper1).getText().toString());
         sum = n1 - n2;
        texto.setText(sum.toString());


    }
    public void multiplicar(View v) {
         n1 = Integer.valueOf((oper1).getText().toString());
         n2 = Integer.valueOf((oper1).getText().toString());
         sum = n1 * n2;
        texto.setText(sum.toString());



    }
    public void dividir(View v) {
         n1 = Integer.valueOf((oper1).getText().toString());
         n2 = Integer.valueOf((oper1).getText().toString());
         sum = n1 / n2;
        texto.setText(sum.toString());


    }
    }

