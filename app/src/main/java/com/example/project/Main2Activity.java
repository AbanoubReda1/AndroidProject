package com.example.project;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    RecyclerView NewsrecyclerView;

    NewsAdapter newsAdapter;
    List<NewsItem>mData;
    FloatingActionButton fabSwitcher;
    boolean isDark = false;
    ConstraintLayout rootLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fabSwitcher = findViewById(R.id.fab_switcher);
        rootLayout = findViewById(R.id.rootlayout);
        NewsrecyclerView=findViewById(R.id.news_rv);
        mData=new ArrayList<>();
        isDark = getThemeStatePref();
        if(isDark) {
            // dark theme is on

            rootLayout.setBackgroundColor(getResources().getColor(R.color.black));

        }
        else
        {
            // light theme is on

            rootLayout.setBackgroundColor(getResources().getColor(R.color.white));

        }

       mData.add(new NewsItem("عودة ميسي = عودة برشلونة للحياة","عودة لطالما انتظرتها جماهير برشلونة وهي قدوم النجم الأرجنتيني وأسطورة الفريق ليونيل ميسي إلى تشكيلة برشلونة الأساسية، حيث بدون النجم الأرجنتيني ، وجد عمالقة الدوري الإسباني أنفسهم في المركز السابع بعدما حققوا نسبة فوز بلغت 40 في المائة وجمعوا 1.4 كمعدل نقاط في كل مباراة","12/12/2019",R.drawable.images));
        mData.add(new NewsItem("عودة ميسي = عودة برشلونة للحياة","عودة لطالما انتظرتها جماهير برشلونة وهي قدوم النجم الأرجنتيني وأسطورة الفريق ليونيل ميسي إلى تشكيلة برشلونة الأساسية، حيث بدون النجم الأرجنتيني ، وجد عمالقة الدوري الإسباني أنفسهم في المركز السابع بعدما حققوا نسبة فوز بلغت 40 في المائة وجمعوا 1.4 كمعدل نقاط في كل مباراة","12/12/2019",R.drawable.images));
        mData.add(new NewsItem("عودة ميسي = عودة برشلونة للحياة","عودة لطالما انتظرتها جماهير برشلونة وهي قدوم النجم الأرجنتيني وأسطورة الفريق ليونيل ميسي إلى تشكيلة برشلونة الأساسية، حيث بدون النجم الأرجنتيني ، وجد عمالقة الدوري الإسباني أنفسهم في المركز السابع بعدما حققوا نسبة فوز بلغت 40 في المائة وجمعوا 1.4 كمعدل نقاط في كل مباراة","12/12/2019",R.drawable.images));
        mData.add(new NewsItem("عودة ميسي = عودة برشلونة للحياة","عودة لطالما انتظرتها جماهير برشلونة وهي قدوم النجم الأرجنتيني وأسطورة الفريق ليونيل ميسي إلى تشكيلة برشلونة الأساسية، حيث بدون النجم الأرجنتيني ، وجد عمالقة الدوري الإسباني أنفسهم في المركز السابع بعدما حققوا نسبة فوز بلغت 40 في المائة وجمعوا 1.4 كمعدل نقاط في كل مباراة","12/12/2019",R.drawable.images));
        mData.add(new NewsItem("عودة ميسي = عودة برشلونة للحياة","عودة لطالما انتظرتها جماهير برشلونة وهي قدوم النجم الأرجنتيني وأسطورة الفريق ليونيل ميسي إلى تشكيلة برشلونة الأساسية، حيث بدون النجم الأرجنتيني ، وجد عمالقة الدوري الإسباني أنفسهم في المركز السابع بعدما حققوا نسبة فوز بلغت 40 في المائة وجمعوا 1.4 كمعدل نقاط في كل مباراة","12/12/2019",R.drawable.images));
        mData.add(new NewsItem("عودة ميسي = عودة برشلونة للحياة","عودة لطالما انتظرتها جماهير برشلونة وهي قدوم النجم الأرجنتيني وأسطورة الفريق ليونيل ميسي إلى تشكيلة برشلونة الأساسية، حيث بدون النجم الأرجنتيني ، وجد عمالقة الدوري الإسباني أنفسهم في المركز السابع بعدما حققوا نسبة فوز بلغت 40 في المائة وجمعوا 1.4 كمعدل نقاط في كل مباراة","12/12/2019",R.drawable.images));
        mData.add(new NewsItem("عودة ميسي = عودة برشلونة للحياة","عودة لطالما انتظرتها جماهير برشلونة وهي قدوم النجم الأرجنتيني وأسطورة الفريق ليونيل ميسي إلى تشكيلة برشلونة الأساسية، حيث بدون النجم الأرجنتيني ، وجد عمالقة الدوري الإسباني أنفسهم في المركز السابع بعدما حققوا نسبة فوز بلغت 40 في المائة وجمعوا 1.4 كمعدل نقاط في كل مباراة","12/12/2019",R.drawable.images));
        mData.add(new NewsItem("عودة ميسي = عودة برشلونة للحياة","عودة لطالما انتظرتها جماهير برشلونة وهي قدوم النجم الأرجنتيني وأسطورة الفريق ليونيل ميسي إلى تشكيلة برشلونة الأساسية، حيث بدون النجم الأرجنتيني ، وجد عمالقة الدوري الإسباني أنفسهم في المركز السابع بعدما حققوا نسبة فوز بلغت 40 في المائة وجمعوا 1.4 كمعدل نقاط في كل مباراة","12/12/2019",R.drawable.images));
        mData.add(new NewsItem("عودة ميسي = عودة برشلونة للحياة","عودة لطالما انتظرتها جماهير برشلونة وهي قدوم النجم الأرجنتيني وأسطورة الفريق ليونيل ميسي إلى تشكيلة برشلونة الأساسية، حيث بدون النجم الأرجنتيني ، وجد عمالقة الدوري الإسباني أنفسهم في المركز السابع بعدما حققوا نسبة فوز بلغت 40 في المائة وجمعوا 1.4 كمعدل نقاط في كل مباراة","12/12/2019",R.drawable.images));
        mData.add(new NewsItem("عودة ميسي = عودة برشلونة للحياة","عودة لطالما انتظرتها جماهير برشلونة وهي قدوم النجم الأرجنتيني وأسطورة الفريق ليونيل ميسي إلى تشكيلة برشلونة الأساسية، حيث بدون النجم الأرجنتيني ، وجد عمالقة الدوري الإسباني أنفسهم في المركز السابع بعدما حققوا نسبة فوز بلغت 40 في المائة وجمعوا 1.4 كمعدل نقاط في كل مباراة","12/12/2019",R.drawable.images));
        mData.add(new NewsItem("عودة ميسي = عودة برشلونة للحياة","عودة لطالما انتظرتها جماهير برشلونة وهي قدوم النجم الأرجنتيني وأسطورة الفريق ليونيل ميسي إلى تشكيلة برشلونة الأساسية، حيث بدون النجم الأرجنتيني ، وجد عمالقة الدوري الإسباني أنفسهم في المركز السابع بعدما حققوا نسبة فوز بلغت 40 في المائة وجمعوا 1.4 كمعدل نقاط في كل مباراة","12/12/2019",R.drawable.images));
        mData.add(new NewsItem("عودة ميسي = عودة برشلونة للحياة","عودة لطالما انتظرتها جماهير برشلونة وهي قدوم النجم الأرجنتيني وأسطورة الفريق ليونيل ميسي إلى تشكيلة برشلونة الأساسية، حيث بدون النجم الأرجنتيني ، وجد عمالقة الدوري الإسباني أنفسهم في المركز السابع بعدما حققوا نسبة فوز بلغت 40 في المائة وجمعوا 1.4 كمعدل نقاط في كل مباراة","12/12/2019",R.drawable.images));
        mData.add(new NewsItem("عودة ميسي = عودة برشلونة للحياة","عودة لطالما انتظرتها جماهير برشلونة وهي قدوم النجم الأرجنتيني وأسطورة الفريق ليونيل ميسي إلى تشكيلة برشلونة الأساسية، حيث بدون النجم الأرجنتيني ، وجد عمالقة الدوري الإسباني أنفسهم في المركز السابع بعدما حققوا نسبة فوز بلغت 40 في المائة وجمعوا 1.4 كمعدل نقاط في كل مباراة","12/12/2019",R.drawable.images));

        mData.add(new NewsItem("عودة ميسي = عودة برشلونة للحياة","عودة لطالما انتظرتها جماهير برشلونة وهي قدوم النجم الأرجنتيني وأسطورة الفريق ليونيل ميسي إلى تشكيلة برشلونة الأساسية، حيث بدون النجم الأرجنتيني ، وجد عمالقة الدوري الإسباني أنفسهم في المركز السابع بعدما حققوا نسبة فوز بلغت 40 في المائة وجمعوا 1.4 كمعدل نقاط في كل مباراة","12/12/2019",R.drawable.images));

        newsAdapter=new NewsAdapter(this,mData,isDark);
        NewsrecyclerView.setAdapter(newsAdapter);
        NewsrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        fabSwitcher.setOnClickListener(new View.OnClickListener() {

        
            @Override
            public void onClick(View v) {
                isDark = !isDark ;
                if (isDark) {

                    rootLayout.setBackgroundColor(getResources().getColor(R.color.black));


                }
                else {
                    rootLayout.setBackgroundColor(getResources().getColor(R.color.white));

                }

                newsAdapter = new NewsAdapter(getApplicationContext(),mData,isDark);

                NewsrecyclerView.setAdapter(newsAdapter);
                saveThemeStatePref(isDark);




            }
        });





    }

    private boolean getThemeStatePref() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPref",MODE_PRIVATE);
        boolean isDark = pref.getBoolean("isDark",false) ;
        return isDark;
    }

    private void saveThemeStatePref(boolean isDark)
    {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPref",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("isDark",isDark);
        editor.commit();
    }


}
