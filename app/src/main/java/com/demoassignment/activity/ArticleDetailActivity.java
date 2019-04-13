package com.demoassignment.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.demoassignment.R;
import com.demoassignment.model.Result;

public class ArticleDetailActivity extends AppCompatActivity {

    private TextView title;
    private TextView description;
    private TextView publishedDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail);
        getSupportActionBar().setTitle(getString(R.string.detail_title));

        initView();
        populateData();

    }

    /*Initialize views*/

    public void initView(){
        title=findViewById(R.id.title_text);
        description=findViewById(R.id.description);
        publishedDate =findViewById(R.id.published_date);
    }


    public void settingUpData(Result result){
        title.setText(result.getTitle());
        description.setText(result.getAbstract());
        publishedDate.setText(result.getPublishedDate());
    }

    /*Populating data to the UI*/

    public void populateData(){
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
          Result result= (Result) bundle.get("resultItem");
          settingUpData(result);
        }
    }
}
