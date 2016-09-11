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
 * {@link BrewingFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BrewingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BrewingFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public BrewingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BrewingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BrewingFragment newInstance(String param1, String param2) {
        BrewingFragment fragment = new BrewingFragment();
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
    String [] brewings = {
            "Glass Bottle",
            "Cauldron",
            "Brewing Stand",
            "Glistering Melon",
            "Blaze Powder",
            "Fermented Spider Eye",
            "Magma Cream"
    };

    int [] imageID = {
            R.drawable.img_glassbottle,
            R.drawable.img_cauldron,
            R.drawable.img_brewingstand,
            R.drawable.img_glisteringmelon,
            R.drawable.img_blazepowder,
            R.drawable.img_fermentedspidereye,
            R.drawable.img_magmacream
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = null;
        view = inflater.inflate(R.layout.fragment_brewing, container, false);
        BrewingAdapter brewingAdapter = new BrewingAdapter(this.getActivity() , brewings, imageID);
        grid = (GridView) view.findViewById(R.id.gridview);
            grid.setAdapter(brewingAdapter);
            grid.setOnItemClickListener(new AdapterView.OnItemClickListener(){

                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    switch(position){
                        case 0:
                            showPopup("glassbottle");
                            break;
                        case 1:
                            showPopup("cauldron");
                            break;
                        case 2:
                            showPopup("brewingstand");
                            break;
                        case 3:
                            showPopup("glisteringmelon");
                            break;
                        case 4:
                            showPopup("blazepowder");
                            break;
                        case 5:
                            showPopup("fermentedspidereye");
                            break;
                        case 6:
                            showPopup("magmacream");
                            break;
                    }
                }
            });
        return view;
    }

    private void showPopup(String item) {

        View popupView = null;

        if (item.equals("glassbottle")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.glassbottle_popup, null);
        } else if (item.equals("cauldron")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.cauldron_popup, null);
        } else if (item.equals("brewingstand")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.brewingstand_popup, null);
        } else if (item.equals("glisteringmelon")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.glisteringmelon_popup, null);
        } else if (item.equals("blazepowder")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.blazepowder_popup, null);
        } else if (item.equals("fermentedspidereye")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.fermentedspidereye_popup, null);
        } else if (item.equals("magmacream")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.magmacream_popup, null);
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
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
