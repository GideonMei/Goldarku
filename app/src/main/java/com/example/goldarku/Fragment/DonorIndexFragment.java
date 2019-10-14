package com.example.goldarku.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.goldarku.Activity.DonorDarah;
import com.example.goldarku.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DonorIndexFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class DonorIndexFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    public DonorIndexFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_donor_index, container, false);
        final EditText Text_usia = view.findViewById((R.id.input_usia));
        final EditText Text_weight = view.findViewById((R.id.input_weight));
        final EditText Text_tdSis = view.findViewById((R.id.input_tdSis));
        final EditText Text_tdDis = view.findViewById((R.id.input_tdDis));
        final EditText Text_hb = view.findViewById((R.id.input_hb));

        Button buttonDonor = view.findViewById(R.id.button_donor);
        buttonDonor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mListener !=null){
                    String UsiaString = Text_usia.getText().toString();
                    String WeightString = Text_weight.getText().toString();
                    String tdSisString = Text_tdSis.getText().toString();
                    String tdDisString = Text_tdDis.getText().toString();
                    String hbString = Text_hb.getText().toString();

                    if(!TextUtils.isEmpty(UsiaString)&&!TextUtils.isEmpty(WeightString)&&!TextUtils.isEmpty(tdSisString)
                            &&!TextUtils.isEmpty(tdDisString)&&!TextUtils.isEmpty(hbString)){
                        int usia = Integer.parseInt(UsiaString);
                        int weight = Integer.parseInt(WeightString);
                        int tdSis = Integer.parseInt(tdSisString);
                        int tdDis = Integer.parseInt(tdDisString);
                        int hb = Integer.parseInt(hbString);
                        DonorDarah donorDarah = new DonorDarah(usia, weight, tdSis, tdDis, hb);
                        mListener.onDonorButtonClicked(donorDarah.getIndex());
                    }else{
                        Toast.makeText(getActivity(), "Isi Semua Form Terlebih Dahulu", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        return view;
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
        void onDonorButtonClicked(String hasil);
    }
}
