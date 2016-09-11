package com.masukami.minecraftcraftmate;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.PopupWindow;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DefenceFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DefenceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DefenceFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public DefenceFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DefenceFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DefenceFragment newInstance(String param1, String param2) {
        DefenceFragment fragment = new DefenceFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    GridView grid;
    String[] defences = {
        "Helmet",
        "Chestplate",
        "Legging",
        "Boots",
        "Swords",
        "Bow",
        "Arrow",
        "Horse Armor"
    };

    int[] imageID = {
            R.drawable.img_helmets,
            R.drawable.img_chestplates,
            R.drawable.img_leggings,
            R.drawable.img_boots,
            R.drawable.img_swords,
            R.drawable.img_bow,
            R.drawable.img_arrow,
            R.drawable.img_horsearmour
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = null;
        view = inflater.inflate(R.layout.fragment_defence, container, false);
        DefenceAdapter defenceAdapter = new DefenceAdapter(this.getActivity(), defences, imageID);
        grid = (GridView) view.findViewById(R.id.gridview);
            grid.setAdapter(defenceAdapter);
            grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    switch(position){
                        case 0:
                            showPopup("helmet");
                            break;
                        case 1:
                            showPopup("chestplate");
                            break;
                        case 2:
                            showPopup("legging");
                            break;
                        case 3:
                            showPopup("boots");
                            break;
                        case 4:
                            showPopup("swords");
                            break;
                        case 5:
                            showPopup("bow");
                            break;
                        case 6:
                            showPopup("arrow");
                            break;
                        case 7:
                            showPopup("horsearmor");
                            break;
                    }
                }
            });
        return view;
    }

    private void showPopup(String item) {

        View popupView = null;

        if (item.equals("helmet")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.helmet_popup, null);
        } else if (item.equals("chestplate")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.chestplate_popup, null);
        } else if (item.equals("legging")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.legging_popup, null);
        } else if (item.equals("boots")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.boots_popup, null);
        } else if (item.equals("swords")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.swords_popup, null);
        } else if (item.equals("bow")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bow_popup, null);
        } else if (item.equals("arrow")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.arrow_popup, null);
        } else if (item.equals("horsearmor")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.horsearmor_popup, null);
        }

        PopupWindow popupWindow = new PopupWindow(popupView, 600, 500, true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable());

        popupWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
