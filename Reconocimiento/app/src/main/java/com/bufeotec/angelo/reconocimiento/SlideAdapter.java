package com.bufeotec.angelo.reconocimiento;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SlideAdapter (Context context){
        this.context = context;
    }


    private String about_title_array[] = {
            "Capturar la foto",
            "Reconocimiento",
            "Resultado de Análisis"
    };
    private String about_description_array[] = {
            "Desde tu dispositivo puedes capturar una foto o elegir de la galeria la foto que deseas procesar",
            "La imagen se enviará a nuestros servidores y se procesará para buscar características de la plaga Tuthilia Cognata",
            "Una vez terminado el procesamiento se mostrará los resulatados según sea el caso. Estos pueden ser 'Se detectó la plaga: Tuthillia Cognata' u 'Hoja sin plaga"


    };

    private int about_images_array[] = {
            R.drawable.take,
            R.drawable.proce,
            R.drawable.ban3
    };

    @Override
    public int getCount() {
        return about_title_array.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        //View view = layoutInflater.inflate(R.layout.card,container,false);
        View view = layoutInflater.inflate(R.layout.card,container,false);
        ImageView image =  view.findViewById(R.id.image);
        TextView title = view.findViewById(R.id.title);
        TextView content = view.findViewById(R.id.content);

        image.setImageResource(about_images_array[position]);
        title.setText(about_title_array[position]);
        content.setText(about_description_array[position]);
        container.addView(view);
        return  view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
