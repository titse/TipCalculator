package net.tiffanytse.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TipCalMain extends AppCompatActivity {

    //constants used when saving/restoring state
    private static final String BILL_TOTAL = "BILL_TOTAL";
    private static final String CUSTOM_PERCENT="CUSTOM_PERCENT";


    private double currentBillTotal; //bill amount entered by the user
    private int currentCustomPercent; //tip % set with the SeekBar
    private EditText tip10EditText; //displays 10% tip
    private EditText total10EditText; //displays total with 10% tip
    private EditText tip15EditText; //displays 15% tip
    private EditText total15EditText; //displays total with 15% tip
    private EditText tip20EditText; //displays 20% tip
    private EditText total20EditText; //displays total with 20% tip
    private TextView customTipTextView; //displays custom tip percentage
    private EditText tipCustomEditText; //displays custom tip amount
    private EditText billEditText; //accepts user input for bill total

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_cal_main);

        //check if app just started or is being restored from memory
        if (savedInstanceState == null) //the app just started running
        {
            currentBillTotal =0.0; //initalize the bill amount to zero
            currentCustomPercent = 18; // intilize the custome tip to 18%
        }
        else { //app is being restored from memory, not executed from scratch
            //intialize the bill amount to saved amount
            currentBillTotal = savedInstanceState.getDouble(BILL_TOTAL);
            //initilize the custom tip to save tip percent
            currentCustomPercent =savedInstanceState.getInt(CUSTOM_PERCENT);

        }

        //get references to the 10%, 15%, 20% tip and total Edit
        tip10EditText = (EditText) findViewById(R.id.tip10EditText);
        total10EditText = (EditText) findViewById(R.id.total10EditText);
        tip15EditText = (EditText) findViewById(R.id.tip15EditText);
        total15EditText = (EditText) findViewById(R.id.total15EditText);
        tip20EditText = (EditText) findViewById(R.id.tip20EditText);
        total20EditText = (EditText) findViewById(R.id.total20EditText);

    }
}
