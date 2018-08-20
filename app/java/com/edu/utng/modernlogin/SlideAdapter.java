package com.edu.utng.modernlogin;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SlideAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    // list of images
    public int[] lst_images = {
            R.drawable.slide1,
            R.drawable.slide2,
            R.drawable.slide3,
            R.drawable.bucle
    };
    // list of titles
    public String[] lst_title = {
            "TIP 1:",
            "TIP 2:",
            "TIP 3:",
            "TIP 4:"
    }   ;
    // list of descriptions
    public String[] lst_description = {
            "Si estudias o quieres estudiar programación, una parte fundamental de la vida de todo programador es la comida; una buena alimentación ayuda a mejorar el rendimiento en la escuela o trabajo.",
            "El ser autodidacta es fundamental ya que de tí depende el poder aprender y mejorar tus conocimientos. No dejes que los demás hagan las cosas por ti.",
            "Trata de dormir el tiempo suficiente. No es una novedad que ser programador es sinónimo de desveladas, días pesados y con mucho sueño",
            "Come, Duerme, Programa, Repite, es irónico que en la vida como en la programación... todo se resume en un ciclo."
    };
    // list of background colors
    public int[]  lst_backgroundcolor = {
            Color.rgb(55,55,55),
            Color.rgb(239,85,85),
            Color.rgb(110,49,89),
            Color.rgb(1,188,212)
    };


    public SlideAdapter(Context context) {
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
        View view = inflater.inflate(R.layout.activity_slide2,container,false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView)  view.findViewById(R.id.imv_slide);
        TextView txttitle= (TextView) view.findViewById(R.id.txt_title_slide);
        TextView description = (TextView) view.findViewById(R.id.txt_description);
        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide.setImageResource(lst_images[position]);
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
