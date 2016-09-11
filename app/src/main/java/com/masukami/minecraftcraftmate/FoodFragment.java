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
 * {@link FoodFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FoodFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public FoodFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FoodFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FoodFragment newInstance(String param1, String param2) {
        FoodFragment fragment = new FoodFragment();
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
    String[] foods = {
            "Cake",
            "Bread",
            "Cookie",
            "Bowl",
            "Mushroom Stew",
            "Golden Apple",
            "Enchanted Golden Apple",
            "Pumpkin Seeds",
            "Melon Seeds",
            "Melon Block",
            "Sugar",
            "Golden Carrot",
            "Pumpkin Pie",
            "Rabbit Stew"
    };
    int [] imageID = {
            R.drawable.img_cake,
            R.drawable.img_bread,
            R.drawable.img_cookie,
            R.drawable.img_bowl,
            R.drawable.img_mushroomstew,
            R.drawable.img_goldenapple,
            R.drawable.img_enchantedgoldenapple,
            R.drawable.img_pumpkinseeds,
            R.drawable.img_melonseeds,
            R.drawable.img_melonblock,
            R.drawable.img_sugar,
            R.drawable.img_goldencarrot,
            R.drawable.img_pumpkinpie,
            R.drawable.img_rabbitstew
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = null;
        view = inflater.inflate(R.layout.fragment_food, container, false);
        FoodAdapter foodAdapter = new FoodAdapter(this.getActivity() , foods, imageID);
        grid = (GridView) view.findViewById(R.id.gridview);
            grid.setAdapter(foodAdapter);
            grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    switch(position){
                        case 0:
                            showPopup("cake");
                            break;
                        case 1:
                            showPopup("bread");
                            break;
                        case 2:
                            showPopup("cookie");
                            break;
                        case 3:
                            showPopup("bowl");
                            break;
                        case 4:
                            showPopup("mushroomstew");
                            break;
                        case 5:
                            showPopup("goldenapple");
                            break;
                        case 6:
                            showPopup("enchantedgoldenapple");
                            break;
                        case 7:
                            showPopup("pumpkinseeds");
                            break;
                        case 8:
                            showPopup("melonseeds");
                            break;
                        case 9:
                            showPopup("melonblock");
                            break;
                        case 10:
                            showPopup("sugar");
                            break;
                        case 11:
                            showPopup("goldencarrot");
                            break;
                        case 12:
                            showPopup("pumpkinpie");
                            break;
                        case 13:
                            showPopup("rabbitstew");
                            break;
                    }
                }
            });
        return view;
    }

    private void showPopup(String item) {
        View popupView = null;

        if (item.equals("cake")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.cake_popup, null);
        } else if (item.equals("bread")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bread_popup, null);
        } else if (item.equals("cookie")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.cookie_popup, null);
        } else if (item.equals("bowl")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bowl_popup, null);
        } else if (item.equals("mushroomstew")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.mushroomstew_popup, null);
        } else if (item.equals("goldenapple")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.goldenapple_popup, null);
        } else if (item.equals("enchantedgoldenapple")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.enchantedgoldenapple_popup, null);
        } else if (item.equals("pumpkinseeds")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.pumpkinseeds_popup, null);
        } else if (item.equals("melonseeds")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.melonseeds_popup, null);
        } else if (item.equals("melonblock")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.melonblock_popup, null);
        } else if (item.equals("sugar")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.sugar_popup, null);
        } else if (item.equals("goldencarrot")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.goldencarrot_popup, null);
        } else if (item.equals("pumpkinpie")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.pumpkinpie_popup, null);
        } else if (item.equals("rabbitstew")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.rabbitstew_popup, null);
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
