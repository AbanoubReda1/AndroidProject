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
            "أجاي وأزارو يقودان هجوم الأهلي في مواجهة الحدود بالدوري الممتاز",
            "صورة.. كهربا برفقة صالح جمعة فى التتش بالأهلى ",
            "الإسماعيلي: باهر ومجدي ليس للبيع .. نلعب مثل ليفربول",
            "\"مالك\" سر غياب صلاح محسن عن مران الأهلي"
    }   ;
    // list of descriptions
    public String[] lst_description = {
            "عودة لطالما انتظرتها جماهير برشلونة وهي قدوم النجم الأرجنتيني وأسطورة الفريق ليونيل ميسي إلى تشكيلة برشلونة الأساسية، حيث بدون النجم الأرجنتيني ، وجد عمالقة الدوري الإسباني أنفسهم في المركز السابع بعدما حققوا نسبة فوز بلغت 40 في المائة وجمعوا 1.4 كمعدل نقاط في كل مباراة,",
            "تغنى يورجن كلوب المدير الفني لليفربول بالهدف الثاني الذي سجله فريقه ضد مانشستر سيتي برأسية نجمنا المصري محمد صلاح.",
            "علن السويسرى رينيه فايلر المدير الفنى للأهلى تشكيل فريقه الذى سيواجه به حرس الحدود فى المباراة  المقرر لها السابعة والنصف من مساء اليوم الأحد، ضمن مباريات الجولة الثامنة لبطولة الممتاز، وجاء التشكيل كالتالي : \n" +
                    "\n" +
                    "حراسة المرمي: محمد الشناوي.\n" +
                    "\n" +
                    "خط الدفاع: أحمد فتحي  ورامي ربيعة وأيمن اشرف ومحمود وحيد.\n" +
                    "\n" +
                    "خط الوسط: محمد مجدي أفشة وعمرو السولية وحسين الشحات  ورمضان صبحي.\n" +
                    "\n" +
                    "خط الهجوم : وليد أزارو وجونيور أجاي.",
            "إلتقط محمود عبد المنعم كهربا لاعب الأهلى الجديد، صورة مع صالح جمعة صانع ألعاب الفريق، داخل غرف خلع الملابس بملعب التتش بالجزيرة، على هامش خوض مران المستبعدين من مواجهة حرس الحدود.\n" +
                    "\n" +
                    "ويلتقى الأهلي مع حرس الحدود فى السابعة والنصف مساء اليوم، ضمن منافسات الجولة الثامنة من بطولة الدورى الممتاز، فى اللقاء الذى يجمع الفريقين باستاد القاهرة.",



    "كشف صبري المنياوي مدير الكرة بالإسماعيلي أن مجلس إدارة ناديه برئاسة إبراهيم عثمان يرفض رحيل أي من نجوم الفريق خلال فترة الإنتقالات الشتوية المقبلة.\n" +
            "\n" +
            "تابع المنياوي فى تصريحات لقناة TIME SPORTS  نتمسك ببقاء اللاعبين لتحقيق إنجاز ، وعبد الرحمن مجدي و باهر المحمدي \" مش للبيع \" ، نرغب فى تحقيق بطولات هذا الموسم .\n" +

            "أضاف مدير الكرة بالإسماعيلي نلعب هذا الشهر 8 مباريات ، مثل فريق ليفربول الإنجليزي الذى يواجه ضغط كبير فى المباريات .",
            "غاب صلاح محسن مهاجم النادي الأهلي عن مران فريقه الذي أقيم اليوم الأحد للاعبين الغائبين عن مواجهة حرس الحدود، والمقرر اقامتها مساء اليوم على ملعب ستاد القاهرة، والتي تأتى ضمن مباريات الجولة الثامن لبطولة الدوري العام.\n" +
                    "\n" +
                    "وأكد مسئولو الأهلي أن غياب صلاح محسن عن المران جاء بعد الحصول على أذن من سيد عبد الحفيظ مدير الكرة بعد أن رزق بمولود أطلق عليه أسم مالك."
    };


    // list of background colors
    public int[] lst_images = {
            R.drawable.images,
            R.drawable.salah,
            R.drawable.ahly,
            R.drawable.kahrbaa,
            R.drawable.asm3ly,
            R.drawable.salahmohsen
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
