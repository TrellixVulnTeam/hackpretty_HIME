package com.example.haeun_kim.hackpretty;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import org.eazegraph.lib.charts.BarChart;
import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

import java.util.ArrayList;


//프래그먼트
public class RankPagerFragment {

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);

            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            int viewNum = getArguments().getInt(ARG_SECTION_NUMBER);
            View rootView;
            Context context;

            Log.d("SSFF", "지금: " + viewNum);

            try{
                switch(viewNum){
                    case 1:
                        rootView = setFragment1(container, inflater);
                        break;
                    case 2:
                        rootView = setFragment2(container, inflater);
                        break;
                    default:
                        rootView = setFragment3(container, inflater);
                        break;
                }

            }catch (Exception e){

                rootView = setFragment1(container, inflater);
            }

            return rootView;
        }//onCreateView


        public View setFragment1(ViewGroup container, LayoutInflater inflater){

            View rootView;
            final Context context;

            rootView = inflater.inflate(R.layout.fragment_analysis_layout, container, false);
            context = rootView.getContext();

            PieChart mPieChart = (PieChart) rootView.findViewById(R.id.piechart);

            mPieChart.addPieSlice(new PieModel("Freetime", 75, Color.parseColor("#FE6DA8")));
            mPieChart.addPieSlice(new PieModel("Sleep", 25, Color.parseColor("#CCCCCC")));

            mPieChart.startAnimation();

            return rootView;
        }

        public View setFragment2(ViewGroup container, LayoutInflater inflater){

            View rootView;
            final Context context;

            rootView = inflater.inflate(R.layout.fragment_ingredient_layout, container, false);
            context = rootView.getContext();
            return rootView;
        }


        public View setFragment3(ViewGroup container, LayoutInflater inflater){

            View rootView;
            final Context context;

            rootView = inflater.inflate(R.layout.fragment_review_layout, container, false);
            context = rootView.getContext();
            return rootView;
        }


    }
}
