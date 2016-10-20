package com.example.bottomsheetdialog;

import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mButton = (Button) findViewById(R.id.open_dialog);
        mButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                BottomSheetDialog mDialog = new BottomSheetDialog(MainActivity.this);
                View mDialogView = LayoutInflater.from(MainActivity.this).inflate(R.layout.dialog_layout,null);
                LinearLayout mFaceBook = (LinearLayout) mDialogView.findViewById(R.id.facebook);
                mFaceBook.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Toast.makeText(MainActivity.this,"FaceBook",Toast.LENGTH_SHORT).show();
                    }
                });

                LinearLayout mInstagram = (LinearLayout) mDialogView.findViewById(R.id.instagram);
                mInstagram.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Toast.makeText(MainActivity.this,"Instagram",Toast.LENGTH_SHORT).show();

                    }
                });

                LinearLayout mTwitter = (LinearLayout)mDialogView.findViewById(R.id.twitter);
                mTwitter.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Toast.makeText(MainActivity.this,"Twitter",Toast.LENGTH_SHORT).show();
                    }
                });

                LinearLayout mGitHub = (LinearLayout) mDialogView.findViewById(R.id.git_hub);
                mGitHub.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        Toast.makeText(MainActivity.this,"GitHub",Toast.LENGTH_SHORT).show();
                    }
                });

                mDialog.setContentView(mDialogView);
                mDialog.show();

            }
        });
    }
}
