package com.masukami.minecraftcraftmate;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
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
 * {@link BlocksFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BlocksFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlocksFragment extends Fragment implements ImageButton.OnClickListener{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public BlocksFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlocksFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BlocksFragment newInstance(String param1, String param2) {
        BlocksFragment fragment = new BlocksFragment();
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

    private ImageButton glowstoneButton, snowButton, stoneButton, brickButton, sandstoneButton, smoothSandstoneButton,
                        decoSandstoneButton, goldButton, diamondButton, ironButton, lapislazuliButton, emeraldButton,
                        coalButton, woolButton, bookShelf, noteButton, clayButton, jackolanternButton, tntButton, woodStairsButton,
                        stoneStairsButton, wallButton, redstoneButton, netherButton, quartzButton, chiseledQuartzButton, pillarQuartzButton,
                        hayBaleButton, stainedClayButton, stainedGlass, graniteButton, andesiteButton, dioriteButton, polishedGraniteButton,
                        polishedAndesiteButton, polishedDioriteButton, prismarineButton, darkPrismarineButton, seaLanternButton, coarseDirtButton,
                        slimeButton, mossButton, mossyBrickButton, chiseledStoneButton, redSandstoneButton, smoothRedSandstoneButton,
                        chiseledRedSandstoneButton;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = null;
        view = inflater.inflate(R.layout.fragment_blocks, container, false);
        glowstoneButton = (ImageButton) view.findViewById(R.id.ibGlowstone);
        snowButton = (ImageButton) view.findViewById(R.id.ibSnow);
        stoneButton = (ImageButton) view.findViewById(R.id.ibStone);
        brickButton = (ImageButton) view.findViewById(R.id.ibBrick);
        sandstoneButton = (ImageButton) view.findViewById(R.id.ibSandstone);
        smoothSandstoneButton = (ImageButton) view.findViewById(R.id.ibSmoothSandstone);
        decoSandstoneButton = (ImageButton) view.findViewById(R.id.ibDecoSandstone);
        goldButton = (ImageButton) view.findViewById(R.id.ibGold);
        diamondButton = (ImageButton) view.findViewById(R.id.ibDiamond);
        ironButton = (ImageButton) view.findViewById(R.id.ibIron);
        lapislazuliButton = (ImageButton) view.findViewById(R.id.ibLapisLazuli);
        emeraldButton = (ImageButton) view.findViewById(R.id.ibEmerald);
        coalButton = (ImageButton) view.findViewById(R.id.ibCoal);
        woolButton = (ImageButton) view.findViewById(R.id.ibWool);
        bookShelf = (ImageButton) view.findViewById(R.id.ibBookshelf);
        noteButton = (ImageButton) view.findViewById(R.id.ibNote);
        clayButton = (ImageButton) view.findViewById(R.id.ibClay);
        jackolanternButton = (ImageButton) view.findViewById(R.id.ibJackoLantern);
        tntButton = (ImageButton) view.findViewById(R.id.ibTNT);
        woodStairsButton = (ImageButton) view.findViewById(R.id.ibWoodStairs);
        stoneStairsButton = (ImageButton) view.findViewById(R.id.ibStoneStairs);
        wallButton = (ImageButton) view.findViewById(R.id.ibWalls);
        redstoneButton = (ImageButton) view.findViewById(R.id.ibRedstone);
        netherButton = (ImageButton) view.findViewById(R.id.ibNether);
        quartzButton = (ImageButton) view.findViewById(R.id.ibQuartz);
        chiseledQuartzButton = (ImageButton) view.findViewById(R.id.ibChiseledQuarts);
        pillarQuartzButton = (ImageButton) view.findViewById(R.id.ibPillarQuartz);
        hayBaleButton = (ImageButton) view.findViewById(R.id.ibHayBale);
        stainedClayButton = (ImageButton) view.findViewById(R.id.ibStainedClay);
        stainedGlass = (ImageButton) view.findViewById(R.id.ibStainedGlass);
        graniteButton = (ImageButton) view.findViewById(R.id.ibGranite);
        andesiteButton = (ImageButton) view.findViewById(R.id.ibAndesite);
        dioriteButton = (ImageButton) view.findViewById(R.id.ibDiorite);
        polishedGraniteButton = (ImageButton) view.findViewById(R.id.ibPolishedGranite);
        polishedAndesiteButton = (ImageButton) view.findViewById(R.id.ibPolishedAndesite);
        polishedDioriteButton = (ImageButton) view.findViewById(R.id.ibPolishedDiorite);
        prismarineButton = (ImageButton) view.findViewById(R.id.ibPrismarine);
        darkPrismarineButton = (ImageButton) view.findViewById(R.id.ibDarkPrismarine);
        seaLanternButton = (ImageButton) view.findViewById(R.id.ibSeaLantern);
        coarseDirtButton = (ImageButton) view.findViewById(R.id.ibCoarseDirt);
        slimeButton = (ImageButton) view.findViewById(R.id.ibSlime);
        mossButton = (ImageButton) view.findViewById(R.id.ibMoss);
        mossyBrickButton = (ImageButton) view.findViewById(R.id.ibMossyBrick);
        chiseledStoneButton = (ImageButton) view.findViewById(R.id.ibChiseledStone);
        redSandstoneButton = (ImageButton) view.findViewById(R.id.ibRedSandstone);
        smoothRedSandstoneButton = (ImageButton) view.findViewById(R.id.ibSmoothRedSandstone);
        chiseledRedSandstoneButton = (ImageButton) view.findViewById(R.id.ibChiseledRedSandstone);
        glowstoneButton.setOnClickListener(this);
        snowButton.setOnClickListener(this);
        stoneButton.setOnClickListener(this);
        brickButton.setOnClickListener(this);
        sandstoneButton.setOnClickListener(this);
        smoothSandstoneButton.setOnClickListener(this);
        decoSandstoneButton.setOnClickListener(this);
        goldButton.setOnClickListener(this);
        diamondButton.setOnClickListener(this);
        ironButton.setOnClickListener(this);
        lapislazuliButton.setOnClickListener(this);
        emeraldButton.setOnClickListener(this);
        coalButton.setOnClickListener(this);
        woolButton.setOnClickListener(this);
        bookShelf.setOnClickListener(this);
        noteButton.setOnClickListener(this);
        clayButton.setOnClickListener(this);
        jackolanternButton.setOnClickListener(this);
        tntButton.setOnClickListener(this);
        woodStairsButton.setOnClickListener(this);
        stoneStairsButton.setOnClickListener(this);
        wallButton.setOnClickListener(this);
        redstoneButton.setOnClickListener(this);
        netherButton.setOnClickListener(this);
        quartzButton.setOnClickListener(this);
        chiseledQuartzButton.setOnClickListener(this);
        pillarQuartzButton.setOnClickListener(this);
        hayBaleButton.setOnClickListener(this);
        stainedClayButton.setOnClickListener(this);
        stainedGlass.setOnClickListener(this);
        graniteButton.setOnClickListener(this);
        andesiteButton.setOnClickListener(this);
        dioriteButton.setOnClickListener(this);
        polishedGraniteButton.setOnClickListener(this);
        polishedAndesiteButton.setOnClickListener(this);
        polishedDioriteButton.setOnClickListener(this);
        prismarineButton.setOnClickListener(this);
        darkPrismarineButton.setOnClickListener(this);
        seaLanternButton.setOnClickListener(this);
        coarseDirtButton.setOnClickListener(this);
        slimeButton.setOnClickListener(this);
        mossButton.setOnClickListener(this);
        mossyBrickButton.setOnClickListener(this);
        chiseledStoneButton.setOnClickListener(this);
        redSandstoneButton.setOnClickListener(this);
        smoothRedSandstoneButton.setOnClickListener(this);
        chiseledRedSandstoneButton.setOnClickListener(this);
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
        switch(view.getId()) {

            case R.id.ibGlowstone:
                showPopup(view, "glowstone");
                break;

            case R.id.ibSnow:
                showPopup(view, "snow");
                break;

            case R.id.ibStone:
                showPopup(view, "stone");
                break;

            case R.id.ibBrick:
                showPopup(view, "brick");
                break;

            case R.id.ibSandstone:
                showPopup(view, "sandstone");
                break;

            case R.id.ibSmoothSandstone:
                showPopup(view, "smoothsandstone");
                break;

            case R.id.ibDecoSandstone:
                showPopup(view, "decosandstone");
                break;

            case R.id.ibGold:
                showPopup(view, "gold");
                break;

            case R.id.ibDiamond:
                showPopup(view, "diamond");
                break;

            case R.id.ibIron:
                showPopup(view, "iron");
                break;

            case R.id.ibLapisLazuli:
                showPopup(view, "lapislazuli");
                break;

            case R.id.ibEmerald:
                showPopup(view, "emerald");
                break;

            case R.id.ibCoal:
                showPopup(view, "coal");
                break;

            case R.id.ibWool:
                showPopup(view, "wool");
                break;

            case R.id.ibBookshelf:
                showPopup(view, "bookshelf");
                break;

            case R.id.ibNote:
                showPopup(view, "note");
                break;

            case R.id.ibClay:
                showPopup(view, "clay");
                break;

            case R.id.ibJackoLantern:
                showPopup(view, "jackolantern");
                break;

            case R.id.ibTNT:
                showPopup(view, "tnt");
                break;

            case R.id.ibWoodStairs:
                showPopup(view, "woodstairs");
                break;

            case R.id.ibStoneStairs:
                showPopup(view, "stonestairs");
                break;

            case R.id.ibWalls:
                showPopup(view, "walls");
                break;

            case R.id.ibRedstone:
                showPopup(view, "redstone");
                break;

            case R.id.ibNether:
                showPopup(view, "nether");
                break;

            case R.id.ibQuartz:
                showPopup(view, "quartz");
                break;

            case R.id.ibChiseledQuarts:
                showPopup(view, "chiseledquartz");
                break;

            case R.id.ibPillarQuartz:
                showPopup(view, "pillarquartz");
                break;

            case R.id.ibHayBale:
                showPopup(view, "haybale");
                break;

            case R.id.ibStainedClay:
                showPopup(view, "stainedclay");
                break;

            case R.id.ibStainedGlass:
                showPopup(view, "stainedglass");
                break;

            case R.id.ibGranite:
                showPopup(view, "granite");
                break;

            case R.id.ibAndesite:
                showPopup(view, "andesite");
                break;

            case R.id.ibDiorite:
                showPopup(view, "diorite");
                break;

            case R.id.ibPolishedGranite:
                showPopup(view, "polishedgranite");
                break;

            case R.id.ibPolishedAndesite:
                showPopup(view, "polishedandesite");
                break;

            case R.id.ibPolishedDiorite:
                showPopup(view, "polisheddiorite");
                break;

            case R.id.ibPrismarine:
                showPopup(view, "prismarine");
                break;

            case R.id.ibDarkPrismarine:
                showPopup(view, "darkprismarine");
                break;

            case R.id.ibSeaLantern:
                showPopup(view, "sealantern");
                break;

            case R.id.ibCoarseDirt:
                showPopup(view, "coarsedirt");
                break;

            case R.id.ibSlime:
                showPopup(view, "slime");
                break;

            case R.id.ibMoss:
                showPopup(view, "moss");
                break;

            case R.id.ibMossyBrick:
                showPopup(view, "mossybrick");
                break;

            case R.id.ibChiseledStone:
                showPopup(view, "chiseledstone");
                break;

            case R.id.ibRedSandstone:
                showPopup(view, "redsandstone");
                break;

            case R.id.ibSmoothRedSandstone:
                showPopup(view, "smoothredsandstone");
                break;

            case R.id.ibChiseledRedSandstone:
                showPopup(view, "chiseledredsandstone");
                break;
        }
    }

    private void showPopup(View v, String item) {

        View popupView = null;

        if (item.equals("glowstone")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.glowstone_popup, null);
        } else if (item.equals("snow")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.snow_popup, null);
        } else if (item.equals("stone")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.stone_popup, null);
        } else if (item.equals("brick")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.brick_popup, null);
        } else if (item.equals("sandstone")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.sandstone_popup, null);
        } else if (item.equals("smoothsandstone")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.smoothsandstone_popup, null);
        } else if (item.equals("decosandstone")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.ladder_popup, null);
        } else if (item.equals("gold")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.fence_popup, null);
        } else if (item.equals("diamond")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.boat_popup, null);
        } else if (item.equals("iron")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.woodslab_popup, null);
        } else if (item.equals("lapislazuli")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.stoneslab_popup, null);
        } else if (item.equals("emerald")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.sign_popup, null);
        } else if (item.equals("coal")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.door_popup, null);
        } else if (item.equals("wool")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.painting_popup, null);
        } else if (item.equals("bookshelf")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("note")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("clay")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("jackolantern")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("tnt")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("woodstairs")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("stonestairs")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("walls")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("redstone")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("nether")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("quartz")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("chiseledquartz")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("pillarquartz")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("haybale")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("stainedclay")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("stainedglass")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("granite")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("andesite")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("diorite")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("polishedgranite")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("polishedandesite")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("polisheddiorite")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("prismarine")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("darkprismarine")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("sealantern")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("coarsedirt")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("slime")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("moss")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("mossybrick")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("chiseledstone")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("redsandstone")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("smoothredsandstone")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.bed_popup, null);
        } else if (item.equals("chiseledredsandstone")){
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
