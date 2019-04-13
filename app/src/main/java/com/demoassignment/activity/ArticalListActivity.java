package com.demoassignment.activity;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.demoassignment.R;
import com.demoassignment.adapter.ArticalListAdapter;
import com.demoassignment.model.Result;
import com.demoassignment.utility.ItemClick;
import com.demoassignment.viewmodel.ArticalListViewModel;

import java.io.Serializable;
import java.util.List;

public class ArticalListActivity extends AppCompatActivity implements ItemClick {

    private RecyclerView articalRecyclerView;
    private ProgressBar progressBar;
    private ArticalListAdapter articalListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(getString(R.string.list_title));

        /*view initialization*/

        initRecyclerView();
        progressBar=initProgressBar();
        initViewModel();

    }

    /*Configuring ViewModel*/

    public ArticalListViewModel initViewModel(){
       ArticalListViewModel viewModel= ViewModelProviders.of(this).get(ArticalListViewModel.class);

        viewModel.getMutableArticleData().observe(this, new Observer<List<Result>>() {
            @Override
            public void onChanged(@Nullable List<Result> results) {

                if(results!=null) {
                    progressBar.setVisibility(View.GONE);
                    Log.d("Mutable", "Mutable called");
                    Log.d("response", "" + results.size());
                    articalListAdapter = new ArticalListAdapter(ArticalListActivity.this,results);
                    articalRecyclerView.setAdapter(articalListAdapter);
                }
            }
        });

      /*API call for getting Article data  */

        viewModel.getArticleList();

        return viewModel;
    }

   /*Initializing RecyclerView for traversing the list*/

    public void initRecyclerView(){
        articalRecyclerView=findViewById(R.id.articalRecyclerview);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        articalRecyclerView.setLayoutManager(layoutManager);

    }

    public ProgressBar initProgressBar(){
        return findViewById(R.id.progress_circular);

    }


 /*Handling Click Event of List Item*/

    @Override
    public void onClick(Result result) {
            Intent intent = new Intent(this, ArticleDetailActivity.class);
            intent.putExtra("resultItem", (Serializable) result);
            startActivity(intent);

    }


}
