package nhitruong.com.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEdtA, mEdtB;
    private TextView mTvResult;
    private Button mBtnPlus, mBtnSub, mBtnMultiple, mBtnDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtA = (EditText) findViewById(R.id.edt_a);
        mEdtB = (EditText) findViewById(R.id.edt_b);
        mTvResult = (TextView) findViewById(R.id.tv_result);
        mBtnPlus = (Button) findViewById(R.id.btn_plus);
        mBtnSub = (Button) findViewById(R.id.btn_sub);
        mBtnMultiple = (Button) findViewById(R.id.btn_multiple);
        mBtnDivide = (Button) findViewById(R.id.btn_divide);
    }

    public void onClickPlus(View v){
        float a = Float.parseFloat(mEdtA.getText().toString());
        float b = Float.parseFloat(mEdtB.getText().toString());
        mTvResult.setText(+a+"+"+b+"="+(a+b));
    }
    public void onClickSub(View v){
        float a = Float.parseFloat(mEdtA.getText().toString());
        float b = Float.parseFloat(mEdtB.getText().toString());
        mTvResult.setText(+a+"-"+b+"="+(a-b));
    }
    public void onClickMultiple(View v){
        float a = Float.parseFloat(mEdtA.getText().toString());
        float b = Float.parseFloat(mEdtB.getText().toString());
        mTvResult.setText(+a+"*"+b+"="+(a*b));
    }
    public void onClickDivide(View v){
        float a = Float.parseFloat(mEdtA.getText().toString());
        float b = Float.parseFloat(mEdtB.getText().toString());
        mTvResult.setText(+a+"/"+b+"="+(a/b));
    }
}
