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

       mData.add(new NewsItem("السيسي يلتقى محمود محيى الدين.. ويؤكد: تعاون إيجابى بين مصر والبنك الدولى","السفير بسام راضى، المتحدث الرسمى باسم رئاسة الجمهورية، إن الرئيس أكد خلال اللقاء على علاقات التعاون الإيجابية والمثمرة بين مصر والبنك الدولى والتى دعمت الجهود التنموية للدولة، باعتبار البنك أحد أهم شركاء مصر فى التنمية.","12/12/2019",R.drawable.abdelfatah));
        mData.add(new NewsItem("\"العامة للإستعلامات\": الإعلام الخارجى منتدى شرم الشيخ \"منصة صممها شباب واعد\"","أصدرت الهيئة العامة للاستعلامات، النشرة الثانية لليوم الثاني على التوالي عن تغطية الإعلام الدولى في مجمله لفعاليات منتدى شباب العالم الذى تستضيفه مدينة شرم الشيخ ويستمر حتى 17 ديسمبر الجاري","12/12/2019",R.drawable.alam5argy));
        mData.add(new NewsItem("أردوغان يلجأ لـ\"إسرائيل\": مستعدون للتفاوض حول مد خط أنابيب الغاز لأوروباأردوغان يلجأ لـ\"إسرائيل\": مستعدون للتفاوض حول مد خط أنابيب الغاز لأوروبا","قالت وسائل إعلام إسرائيلية ، إن تركيا فتحت قنوات دبلوماسية مع تل أبيب خلال الفترة الأخيرة ، تتمثل فى استعداد أنقرة التفاوض حول مد خطوط أنابيب الغاز من الأبار الإسرائيلية إلى أوروبا عبر المياه الاقتصادية التركية.","12/12/2019",R.drawable.ord8an));
        mData.add(new NewsItem("منتدى شباب العالم يناقش تحديات الأمن الغذائى فى أفريقيامنتدى شباب العالم يناقش تحديات الأمن الغذائى فى أفريقيا","ستضافت اليوم \"قاعة البحر الأحمر\" جلسة خاصة بعنوان \" الأمن الغذائى فى أفريقيا: كيف نحقق الهدف الثانى من أهداف التنمية المستدامة\" بحضور كبير من المتحدثين المتخصصين فى مجالات العلاقات السياسية والاقتصادية الدولية والتنمية المستدامة إلى جانب عدد كبير من الشباب المشارك بمختلف الجنسيات.","12/12/2019",R.drawable.shabab));
        mData.add(new NewsItem("الاتحاد الإفريقى يشكر مصر لاستضافتها اجتماع اللجنة الفنية للدفاع والأمن","وانطلقت اليوم الأحد، الاجتماعات التحضيرية لخبراء الاجتماع الـ12 للجنة الفنية المتخصصة للدفاع والسلامة والأمن الإفريقية بالعاصمة الإدارية الجديدة بفندق الماسة كابيتال حيث بدأت بالوقوف دقيقة حداد على أرواح جنود حفظ السلام وضحايا العنف في إفريقيا.","12/12/2019",R.drawable.athad));
        mData.add(new NewsItem("وزير النقل يبحث معدلات تجديد وصيانة خطوط السكك الحديدية","عقد وزير النقل المهندس كامل الوزير اجتماعا موسعا مع مسئولى شركتى المصرية لصيانة وتجديد خطوط السكك الحديدية \"ايرتراك\" والمصرية الفرنسية لتجديد السكة \"ايجيفراي\" التابعتين لهيئة السكك الحديدية والمتخصصتين فى أعمال تجديد وصيانة السكة لمتابعة معدلات تجديد وصيانة خطوط السكة الحديد.","12/12/2019",R.drawable.elnakl));
        mData.add(new NewsItem("رئيس الوزراء يصدر قرارا بتشكيل لجنة لتيسير إجراءات الإفراج الجمركى","أصدر الدكتور مصطفى مدبولي، رئيس مجلس الوزراء، قراراً بأن تُشكل بكل منفذ جمركي، لجنة مشتركة دائمة أو أكثر، حسب حاجة العمل، في ساحات الكشف والمعاينة، تضم ممثل أو أكثر عن كل من مصلحة الجمارك المصرية، والهيئة العامة للرقابة على الصادرات والواردات، والهيئة القومية لسلامة الغذاء، والحجر الزراعي، والحجر البيطري","12/12/2019",R.drawable.ra2eselwozra));
        mData.add(new NewsItem("السيسى بمنتدى شباب العالم: رفضنا خروج اللاجئين من مصر حفاظا على حياتهم","أكد الرئيس عبد الفتاح السيسى، أن الدولة المصرية وافقت على تواجد اللاجئين داخل أراضيها، قائلا: \"إذا كانت النتيجة يعقدوا فى مصر.. يعقدوا فى مصر ولا نتحمل أمام أنفسنا وأمام التاريخ والإنسانية أن نكون السبب فى قتلهم.. ولا يتوجدوا فى معسكرات\".","12/12/2019",R.drawable.shabab1));
        mData.add(new NewsItem("الإدارة العامة للمرور: أمطار خفيفة على الطرق.. وحركة السيارات تسير بانتظام..","كشفت اﻹدارة العامة للمرور، عن متابعتها الحالة الجوية وتقلبات وعدم استقرار الطقس، وتلاحظ سقوط أمطار خفيفة بالطرق التابعة للإدارة، دون التأثير على الحركة المرورية لكافة السيارات","12/12/2019",R.drawable.moror));
        mData.add(new NewsItem("وزير دفاع لبنان بمنتدى الشباب: المؤسسة العسكرية ساهمت فى الحفاظ على الدولة المصرية\n","أكد وزير الدفاع اللبنانى إلياس بو صعب، أن منتدى شباب العالم من أقوى الأمور للتغيير فى المجتمع انطلاقا من أهمية دور الشباب، مقترحا بأن يعقد منتدى شباب العالم شراكة مع منتديات أخرى شبيهة فى كل دول العالم.","12/12/2019",R.drawable.wazereldfaa));
        
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
