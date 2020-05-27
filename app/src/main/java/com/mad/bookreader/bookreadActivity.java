package com.mad.bookreader;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class bookreadActivity extends AppCompatActivity {

    //Pdf view from the layout
    PDFView pdfview;
    //pdf name of the pdf file
    String pdfName;
    File pdfFile;
    Uri pdfUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookreadlayout);

        //Get the pdf name from previous page
        Intent pdfPage=getIntent();

        //Setting variable pdfName as the name of the pdf file
        pdfName=pdfPage.getStringExtra("PdfName");

        //Setting custom toolbar
        Toolbar toolbar=findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        //Find the PDFView and load the pdf from previous page to the view
        pdfview=findViewById(R.id.pdfView);
        //pdfview.fromAsset(pdfName).load();
        pdfview.fromUri(pdfUri);



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
