package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;


public class ImageAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    // list of images

    // list of titles
    public String[] lst_title = {
            "عودة ميسي = عودة برشلونة للحياة",
            "كلوب: لا أعتقد أنني رأيت هدفا مثل رائعة صلاح في سيتي",
            "فيلم الجوكر يحقق رقم قياسي جديد في سباق الإيرادات",
            "عاجل ",
            "سامسونج"
    }   ;
    // list of descriptions
    public String[] lst_description = {
            "عودة لطالما انتظرتها جماهير برشلونة وهي قدوم النجم الأرجنتيني وأسطورة الفريق ليونيل ميسي إلى تشكيلة برشلونة الأساسية، حيث بدون النجم الأرجنتيني ، وجد عمالقة الدوري الإسباني أنفسهم في المركز السابع بعدما حققوا نسبة فوز بلغت 40 في المائة وجمعوا 1.4 كمعدل نقاط في كل مباراة,",
            "تغنى يورجن كلوب المدير الفني لليفربول بالهدف الثاني الذي سجله فريقه ضد مانشستر سيتي برأسية نجمنا المصري محمد صلاح.",
            "يقترب فيلم الإثارة والأكشن joker من تحقيق رقم قياسي جديد، بعد تخطي حاجز ايراداته الـ 773 مليون دولارعالمياً وما يقارب الـ 247 مليون دولارمحلياً منذ عرضه يوم 4 أكتوبر الجاري بدورالعرض السينمائي.",
            "الأرصاد: تحسن حالة الجو خلال الـ72 ساعة المقبلة وانحسار سقوط الأمطار",

            "سامسونج تعلن رسميًا توفر هاتف Galaxy Note10+ 5G"    };
    // list of background colors
    public int[] lst_images = {
            R.drawable.images,
            R.drawable.salah,
            R.drawable.images_2,
            R.drawable.images_3,
            R.drawable.images_4
    };

    public ImageAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayout);

        TextView txttitle= (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView) view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundResource(lst_images[position]);

        txttitle.setText(lst_title[position]);
        description.setText(lst_description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
