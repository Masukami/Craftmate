package com.masukami.minecraftcraftmate;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.PopupWindowCompat;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupWindow;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BasicFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BasicFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BasicFragment extends Fragment implements ImageButton.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public BasicFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BasicFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BasicFragment newInstance(String param1, String param2) {
        BasicFragment fragment = new BasicFragment();
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

    private ImageButton woodButton, stickButton, torchButton, workbenchButton,
            chestButton, furnaceButton, ladderButton, fenceButton, boatButton,
            woodSlabsButton, stoneSlabsButton, signButton, doorsButton, paintingButton, bedButton;
    private Button closePopup;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = null;
        view = inflater.inflate(R.layout.fragment_basic, container, false);
        woodButton = (ImageButton) view.findViewById(R.id.ibWood);
        stickButton = (ImageButton) view.findViewById(R.id.ibStick);
        torchButton = (ImageButton) view.findViewById(R.id.ibTorch);
        workbenchButton = (ImageButton) view.findViewById(R.id.ibWorkBench);
        chestButton = (ImageButton) view.findViewById(R.id.ibChest);
        furnaceButton = (ImageButton) view.findViewById(R.id.ibFurnace);
        ladderButton = (ImageButton) view.findViewById(R.id.ibLadder);
        boatButton = (ImageButton) view.findViewById(R.id.ibBoat);
        fenceButton = (ImageButton) view.findViewById(R.id.ibFence);
        woodSlabsButton = (ImageButton) view.findViewById(R.id.ibWoodSlabs);
        stoneSlabsButton = (ImageButton) view.findViewById(R.id.ibStoneSlabs);
        signButton = (ImageButton) view.findViewById(R.id.ibSign);
        doorsButton = (ImageButton) view.findViewById(R.id.ibDoor);
        paintingButton = (ImageButton) view.findViewById(R.id.ibPainting);
        bedButton = (ImageButton) view.findViewById(R.id.ibBed);
        woodButton.setOnClickListener(this);
        stickButton.setOnClickListener(this);
        torchButton.setOnClickListener(this);
        workbenchButton.setOnClickListener(this);
        chestButton.setOnClickListener(this);
        furnaceButton.setOnClickListener(this);
        ladderButton.setOnClickListener(this);
        boatButton.setOnClickListener(this);
        fenceButton.setOnClickListener(this);
        woodSlabsButton.setOnClickListener(this);
        stoneSlabsButton.setOnClickListener(this);
        signButton.setOnClickListener(this);
        doorsButton.setOnClickListener(this);
        paintingButton.setOnClickListener(this);
        bedButton.setOnClickListener(this);
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

    Point p;

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.ibWood:
                    showPopup(view, "wood");
                break;

            case R.id.ibStick:
                showPopup(view, "stick");
                break;

            case R.id.ibTorch:
                showPopup(view, "torch");
                break;

            case R.id.ibWorkBench:
                showPopup(view, "workbench");
                break;

            case R.id.ibChest:
                showPopup(view, "chest");
                break;

            case R.id.ibFurnace:
                showPopup(view, "furnace");
                break;

            case R.id.ibLadder:
                showPopup(view, "ladder");
                break;

            case R.id.ibBoat:
                showPopup(view, "boat");
                break;

            case R.id.ibFence:
                showPopup(view, "fence");
                break;

            case R.id.ibWoodSlabs:
                showPopup(view, "woodslab");
                break;

            case R.id.ibStoneSlabs:
                showPopup(view, "stoneslab");
                break;

            case R.id.ibSign:
                showPopup(view, "sign");
                break;

            case R.id.ibDoor:
                showPopup(view, "door");
                break;

            case R.id.ibPainting:
                showPopup(view, "painting");
                break;

            case R.id.ibBed:
                showPopup(view, "bed");
                break;

        }
    }

    private void showPopup(View v, String item) {

        View popupView = null;

        if (item.equals("wood")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.wood_popup, null);
        } else if (item.equals("stick")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.stick_popup, null);
        } else if (item.equals("torch")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.torch_popup, null);
        } else if (item.equals("workbench")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.workbench_popup, null);
        } else if (item.equals("chest")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.chest_popup, null);
        } else if (item.equals("furnace")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.furnace_popup, null);
        } else if (item.equals("ladder")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.ladder_popup, null);
        } else if (item.equals("fence")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.fence_popup, null);
        } else if (item.equals("boat")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.boat_popup, null);
        } else if (item.equals("woodslab")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.woodslab_popup, null);
        } else if (item.equals("stoneslab")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.stoneslab_popup, null);
        } else if (item.equals("sign")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.sign_popup, null);
        } else if (item.equals("door")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.door_popup, null);
        } else if (item.equals("painting")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.painting_popup, null);
        } else if (item.equals("bed")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
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
