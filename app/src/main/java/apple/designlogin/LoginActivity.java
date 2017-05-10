package apple.designlogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class LoginActivity extends AppCompatActivity {

    LinearLayout layoutUtama, layoutLogin, layoutReset, layoutRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        layoutUtama = (LinearLayout) findViewById(R.id.layout_Menu);
        layoutLogin = (LinearLayout) findViewById(R.id.layout_Login);
        layoutReset = (LinearLayout) findViewById(R.id.layout_Reset);
        layoutRegister= (LinearLayout) findViewById(R.id.layout_Register);

        Button btnEmail = (Button) findViewById(R.id.btn_Email);
        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVisibleLogin(true);
            }
        });

        findViewById(R.id.loginBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVisibleLogin(false);
            }
        });

        findViewById(R.id.tx_register).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVisibleRegister(true);
            }
        });

        findViewById(R.id.registerBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVisibleRegister(false);
            }
        });

        findViewById(R.id.et_BtnReset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVisibleReset(true);
            }
        });

        findViewById(R.id.resetBack).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setVisibleReset(false);
            }
        });
    }

    private void setVisibleLogin(Boolean setVisible){
        if (setVisible){
            layoutUtama.setVisibility(View.INVISIBLE);
            layoutLogin.setVisibility(View.VISIBLE);
        } else {
            layoutUtama.setVisibility(View.VISIBLE);
            layoutLogin.setVisibility(View.INVISIBLE);
        }
    }

    private void setVisibleReset(Boolean setVisible){
        if (setVisible){
            layoutLogin.setVisibility(View.INVISIBLE);
            layoutReset.setVisibility(View.VISIBLE);
        } else {
            layoutLogin.setVisibility(View.VISIBLE);
            layoutReset.setVisibility(View.INVISIBLE);
        }
    }

    private void setVisibleRegister(Boolean setVisible){
        if (setVisible){
            layoutUtama.setVisibility(View.INVISIBLE);
            layoutRegister.setVisibility(View.VISIBLE);
        } else {
            layoutUtama.setVisibility(View.VISIBLE);
            layoutRegister.setVisibility(View.INVISIBLE);
        }
    }
}
