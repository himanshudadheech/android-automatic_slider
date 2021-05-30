package com.himanshudadheech.userapp.ui.home;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.himanshudadheech.userapp.R;
import com.himanshudadheech.userapp.SliderAdapter;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;


public class  HomeFragment extends Fragment {

    //for slider view slide show
    private SliderView sliderView;
    private int[] images;
    private String[] text;
    private SliderAdapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for slider
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //    sliderView = view.findViewById(R.id.slider);
//        sliderView.setIndicatorAnimation(IndicatorAnimationType.FILL); //IndicatorAnimationType__________ your choice
//        sliderView.setSliderTransformAnimation(SliderAnimations.SPINNERTRANSFORMATION); // SliderAnimation._______ apni choice ka
//        sliderView.setScrollTimeInSec(3); // time to change slider
        //Function is use for set images
//        public void setSliderImages(){
//             for(int i=0; i<5;i++){
//                SliderView sliderView = new SliderView(getContext());
//                 switch (i)
//                 {
//                     case 0:
//                         sliderView.;
//                 }
//             }
//        }
//        return view;
//    }
        sliderView = view.findViewById(R.id.imageSlider);
        images = new int[]{R.drawable.sl1, R.drawable.sl2, R.drawable.sl3};
        text = new String[]{"first", "second", "third"};


        adapter = new SliderAdapter(images, text);
        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM); //set indicator animation by using IndicatorAnimationType. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);

        sliderView.setScrollTimeInSec(5); //set scroll delay in seconds :
        sliderView.startAutoCycle();
        return view;
    }
}