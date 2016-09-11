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
import android.widget.ImageButton;
import android.widget.PopupWindow;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ToolsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ToolsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ToolsFragment extends Fragment implements ImageButton.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ToolsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ToolsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ToolsFragment newInstance(String param1, String param2) {
        ToolsFragment fragment = new ToolsFragment();
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

    private ImageButton pickaxeButton, shovelButton, axeButton, hoesButton,
            flintnsteelButton, fishrodButton, shearsButton, bucketButton, clockButton, compassButton,
            mapButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = null;
        view = inflater.inflate(R.layout.fragment_tools, container, false);
        pickaxeButton = (ImageButton) view.findViewById(R.id.ibPickaxe);
        shovelButton = (ImageButton) view.findViewById(R.id.ibShovel);
        axeButton = (ImageButton) view.findViewById(R.id.ibAxe);
        hoesButton = (ImageButton) view.findViewById(R.id.ibHoes);
        flintnsteelButton = (ImageButton) view.findViewById(R.id.ibFlintNSteel);
        fishrodButton = (ImageButton) view.findViewById(R.id.ibFishRod);
        shearsButton = (ImageButton) view.findViewById(R.id.ibShears);
        bucketButton = (ImageButton) view.findViewById(R.id.ibBucket);
        clockButton = (ImageButton) view.findViewById(R.id.ibClock);
        compassButton = (ImageButton) view.findViewById(R.id.ibCompass);
        mapButton = (ImageButton) view.findViewById(R.id.ibMap);
        pickaxeButton.setOnClickListener(this);
        shovelButton.setOnClickListener(this);
        axeButton.setOnClickListener(this);
        hoesButton.setOnClickListener(this);
        flintnsteelButton.setOnClickListener(this);
        fishrodButton.setOnClickListener(this);
        shearsButton.setOnClickListener(this);
        bucketButton.setOnClickListener(this);
        clockButton.setOnClickListener(this);
        compassButton.setOnClickListener(this);
        mapButton.setOnClickListener(this);
        return view;
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

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.ibPickaxe:
                showPopup(view, "pickaxe");
                break;

            case R.id.ibShovel:
                showPopup(view, "shovel");
                break;

            case R.id.ibAxe:
                showPopup(view, "axe");
                break;

            case R.id.ibHoes:
                showPopup(view, "hoes");
                break;

            case R.id.ibFlintNSteel:
                showPopup(view, "flintnsteel");
                break;

            case R.id.ibFishRod:
                showPopup(view, "fishrod");
                break;

            case R.id.ibShears:
                showPopup(view, "shears");
                break;

            case R.id.ibBucket:
                showPopup(view, "bucket");
                break;

            case R.id.ibClock:
                showPopup(view, "clock");
                break;

            case R.id.ibCompass:
                showPopup(view, "compass");
                break;

            case R.id.ibMap:
                showPopup(view, "map");
                break;

        }
    }

    private void showPopup(View v, String item) {

        View popupView = null;

        if (item.equals("pickaxe")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.pickaxe_popup, null);
        } else if (item.equals("shovel")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.shovel_popup, null);
        } else if (item.equals("axe")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.axe_popup, null);
        } else if (item.equals("hoes")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.hoes_popup, null);
        } else if (item.equals("flintnsteel")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.flintnsteel_popup, null);
        } else if (item.equals("fishrod")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.fishrod_popup, null);
        } else if (item.equals("shears")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.shears_popup, null);
        } else if (item.equals("bucket")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bucket_popup, null);
        } else if (item.equals("clock")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.clock_popup, null);
        } else if (item.equals("compass")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.compass_popup, null);
        } else if (item.equals("map")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.map_popup, null);
        }

        PopupWindow popupWindow = new PopupWindow(popupView, 600, 500, true);

        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable());

        popupWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0);
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
