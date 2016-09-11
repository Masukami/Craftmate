package com.masukami.minecraftcraftmate;

import android.content.Context;
import android.graphics.Typeface;
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
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MechanismFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MechanismFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MechanismFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public MechanismFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MechanismFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MechanismFragment newInstance(String param1, String param2) {
        MechanismFragment fragment = new MechanismFragment();
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
    String[] mechanisms = {
            "Pressure Plates",
            "Lever",
            "Button",
            "Trapdoor",
            "Piston",
            "Sticky Piston",
            "Fence Gate",
            "Redstone Repeater",
            "Dispenser",
            "Jukebox",
            "Minecart",
            "Powered Minecart",
            "Storage Minecart",
            "Track",
            "Powered Rail",
            "Detector Rail",
            "Redstone Torch",
            "Redstone Lamp",
            "Tripwire Hook",
            "Activator Rail",
            "Daylight Sensor",
            "Dropper",
            "Hopper",
            "Minecart with Hopper",
            "Minecart with TNT",
            "Redstone Comparator",
            "Trapped Chest",
            "Weighted Pressure Plates",
            "Iron Trapdoor"
    };
    int[] imageID = {
            R.drawable.img_pressureplates,
            R.drawable.img_lever,
            R.drawable.img_buttons,
            R.drawable.img_trapdoor,
            R.drawable.img_piston,
            R.drawable.img_stickypiston,
            R.drawable.img_fencegate,
            R.drawable.img_redstonerepeater,
            R.drawable.img_dispenser,
            R.drawable.img_jukebox,
            R.drawable.img_minecart,
            R.drawable.img_poweredminecart,
            R.drawable.img_storageminecart,
            R.drawable.img_track,
            R.drawable.img_poweredrail,
            R.drawable.img_detectorrail,
            R.drawable.img_redstonetorch,
            R.drawable.img_redstonelamp,
            R.drawable.img_tripwirehook,
            R.drawable.img_activatorrail,
            R.drawable.img_daylightsensor,
            R.drawable.img_dropper,
            R.drawable.img_hopper,
            R.drawable.img_minecartwithhopper,
            R.drawable.img_minecartwithtnt,
            R.drawable.img_redstonecomparator,
            R.drawable.img_trappedchest,
            R.drawable.img_weightedpressureplates,
            R.drawable.img_irontrapdoor
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = null;
        view = inflater.inflate(R.layout.fragment_mechanism, container, false);
        MechanismAdapter mechanismAdapter = new MechanismAdapter(this.getActivity(), mechanisms, imageID);
        grid = (GridView) view.findViewById(R.id.gridview);
            grid.setAdapter(mechanismAdapter);
            grid.setOnItemClickListener(new AdapterView.OnItemClickListener(){

                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    switch(position){
                        case 0:
                            showPopup("pressureplate");
                            break;
                        case 1:
                            showPopup("lever");
                            break;
                        case 2:
                            showPopup("button");
                            break;
                        case 3:
                            showPopup("trapdoor");
                            break;
                        case 4:
                            showPopup("piston");
                            break;
                        case 5:
                            showPopup("stickypiston");
                            break;
                        case 6:
                            showPopup("fencegate");
                            break;
                        case 7:
                            showPopup("redstonerepeater");
                            break;
                        case 8:
                            showPopup("dispenser");
                            break;
                        case 9:
                            showPopup("jukebox");
                            break;
                        case 10:
                            showPopup("minecart");
                            break;
                        case 11:
                            showPopup("poweredminecart");
                            break;
                        case 12:
                            showPopup("storageminecart");
                            break;
                        case 13:
                            showPopup("track");
                            break;
                        case 14:
                            showPopup("poweredrail");
                            break;
                        case 15:
                            showPopup("detectorrail");
                            break;
                        case 16:
                            showPopup("redstonetorch");
                            break;
                        case 17:
                            showPopup("redstonelamp");
                            break;
                        case 18:
                            showPopup("tripwirehook");
                            break;
                        case 19:
                            showPopup("activatorrail");
                            break;
                        case 20:
                            showPopup("daylightsensor");
                            break;
                        case 21:
                            showPopup("dropper");
                            break;
                        case 22:
                            showPopup("hopper");
                            break;
                        case 23:
                            showPopup("hopperminecart");
                            break;
                        case 24:
                            showPopup("tntminecart");
                            break;
                        case 25:
                            showPopup("redstonecomparator");
                            break;
                        case 26:
                            showPopup("trappedchest");
                            break;
                        case 27:
                            showPopup("weightedpressureplates");
                            break;
                        case 28:
                            showPopup("irontrapdoor");
                            break;
                    }
                }
            });


        return view;
    }

    private void showPopup(String item){

        View popupView = null;

        if (item.equals("pressureplate")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.pressureplate_popup, null);
        } else if (item.equals("lever")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.lever_popup, null);
        } else if (item.equals("button")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.button_popup, null);
        }  else if (item.equals("trapdoor")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.trapdoor_popup, null);
        }  else if (item.equals("piston")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.piston_popup, null);
        }   else if (item.equals("stickypiston")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.stickypiston_popup, null);
        }   else if (item.equals("fencegate")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.fencegate_popup, null);
        }   else if (item.equals("redstonerepeater")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.redstonerepeater_popup, null);
        }   else if (item.equals("dispenser")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.dispenser_popup, null);
        }   else if (item.equals("jukebox")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.jukebox_popup, null);
        }   else if (item.equals("minecart")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.minecart_popup, null);
        }   else if (item.equals("poweredminecart")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.poweredminecart_popup, null);
        }   else if (item.equals("storageminecart")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.storageminecart_popup, null);
        }   else if (item.equals("track")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.track_popup, null);
        }   else if (item.equals("poweredrail")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.poweredrail_popup, null);
        }   else if (item.equals("detectorrail")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.detectorrail_popup, null);
        }   else if (item.equals("redstonetorch")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.redstonetorch_popup, null);
        }   else if (item.equals("redstonelamp")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.redstonelamp_popup, null);
        }   else if (item.equals("tripwirehook")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.tripwirehook_popup, null);
        }   else if (item.equals("activatorrail")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.activatorrail_popup, null);
        }   else if (item.equals("daylightsensor")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.daylightsensor_popup, null);
        }   else if (item.equals("dropper")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.dropper_popup, null);
        }   else if (item.equals("hopper")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.hopper_popup, null);
        }   else if (item.equals("hopperminecart")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.hopperminecart_popup, null);
        }   else if (item.equals("tntminecart")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.tntminecart_popup, null);
        }   else if (item.equals("redstonecomparator")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.redstonecomparator_popup, null);
        }   else if (item.equals("trappedchest")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.trappedchest_popup, null);
        }   else if (item.equals("weightedpressureplates")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.weightedpressureplates_popup, null);
        }   else if (item.equals("irontrapdoor")){
            popupView = getActivity().getLayoutInflater().inflate(R.layout.irontrapdoor_popup, null);
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
