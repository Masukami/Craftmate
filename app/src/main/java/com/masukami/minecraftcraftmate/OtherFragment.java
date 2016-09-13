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
 * {@link OtherFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link OtherFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OtherFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public OtherFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OtherFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OtherFragment newInstance(String param1, String param2) {
        OtherFragment fragment = new OtherFragment();
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
    String[]others = {
            "Paper",
            "Book",
            "Book and Quill",
            "Iron Bars",
            "Nether\nBrick Fence",
            "Gold Ingot",
            "Eye of Ender",
            "Enchantment Table",
            "Fire Charge",
            "Ender Chest",
            "Beacon",
            "Anvil",
            "Flower Pot",
            "Item Frame",
            "Carrot\non a\nStick",
            "Firework Rocket",
            "Firework\nStar",
            "Lead",
            "Carpets",
            "Glass Panes",
            "Leather",
            "Banner",
            "Armor Stand"
    };

    int[] imageID = {
            R.drawable.img_paper,
            R.drawable.img_book,
            R.drawable.img_bookandquill,
            R.drawable.img_ironbars,
            R.drawable.img_netherbrickfence,
            R.drawable.img_goldingot,
            R.drawable.img_eyeofender,
            R.drawable.img_enchantmenttable,
            R.drawable.img_firecharge,
            R.drawable.img_enderchest,
            R.drawable.img_beacon,
            R.drawable.img_anvil,
            R.drawable.img_flowerpot,
            R.drawable.img_itemframe,
            R.drawable.img_carrotonastick,
            R.drawable.img_fireworkrocket,
            R.drawable.img_fireworkstar,
            R.drawable.img_lead,
            R.drawable.img_carpets,
            R.drawable.img_glasspanes,
            R.drawable.img_leather,
            R.drawable.img_banner,
            R.drawable.img_armorstand
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = null;
        view = inflater.inflate(R.layout.fragment_other, container, false);
        OtherAdapter otherAdapter = new OtherAdapter(this.getActivity(), others, imageID);
        grid = (GridView) view.findViewById(R.id.gridview);
            grid.setAdapter(otherAdapter);
            grid.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {
                    case 0:
                        showPopup("paper");
                        break;
                    case 1:
                        showPopup("book");
                        break;
                    case 2:
                        showPopup("bookandquill");
                        break;
                    case 3:
                        showPopup("ironbars");
                        break;
                    case 4:
                        showPopup("netherbrickfence");
                        break;
                    case 5:
                        showPopup("goldingot");
                        break;
                    case 6:
                        showPopup("endereye");
                        break;
                    case 7:
                        showPopup("enchantmenttable");
                        break;
                    case 8:
                        showPopup("firecharge");
                        break;
                    case 9:
                        showPopup("enderchest");
                        break;
                    case 10:
                        showPopup("beacon");
                        break;
                    case 11:
                        showPopup("anvil");
                        break;
                    case 12:
                        showPopup("flowerpot");
                        break;
                    case 13:
                        showPopup("itemframe");
                        break;
                    case 14:
                        showPopup("carrotonastick");
                        break;
                    case 15:
                        showPopup("fireworkrocket");
                        break;
                    case 16:
                        showPopup("fireworkstar");
                        break;
                    case 17:
                        showPopup("lead");
                        break;
                    case 18:
                        showPopup("carpet");
                        break;
                    case 19:
                        showPopup("glasspanes");
                        break;
                    case 20:
                        showPopup("leather");
                        break;
                    case 21:
                        showPopup("banner");
                        break;
                    case 22:
                        showPopup("armorstand");
                        break;
                }
            }
        });
        return view;
    }

    private void showPopup(String item){

        View popupView = null;
        switch(item){
            case "paper":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.paper_popup, null);
                break;
            case "book":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.book_popup, null);
                break;
            case "bookandquill":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.bookandquill_popup, null);
                break;
            case "ironbars":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.ironbars_popup, null);
                break;
            case "netherbrickfence":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.netherbrickfence_popup, null);
                break;
            case "goldingot":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.goldingot_popup, null);
                break;
            case "endereye":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.eyeofender_popup, null);
                break;
            case "enchantmenttable":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.enchantmenttable_popup, null);
                break;
            case "firecharge":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.firecharge_popup, null);
                break;
            case "enderchest":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.enderchest_popup, null);
                break;
            case "beacon":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.beacon_popup, null);
                break;
            case "anvil":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.anvil_popup, null);
                break;
            case "flowerpot":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.flowerpot_popup, null);
                break;
            case "itemframe":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.itemframe_popup, null);
                break;
            case "carrotonastick":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.carrotonastick_popup, null);
                break;
            case "fireworkrocket":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.fireworkrocket_popup, null);
                break;
            case "fireworkstar":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.fireworkstar_popup, null);
                break;
            case "lead":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.lead_popup, null);
                break;
            case "carpet":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.carpets_popup, null);
                break;
            case "glasspanes":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.glasspanes_popup, null);
                break;
            case "leather":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.leather_popup, null);
                break;
            case "banner":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.banner_popup, null);
                break;
            case "armorstand":
                popupView = getActivity().getLayoutInflater().inflate(R.layout.armorstand_popup, null);
                break;
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
