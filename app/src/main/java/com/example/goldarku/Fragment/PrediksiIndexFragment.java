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

import com.example.goldarku.Activity.PrediksiGoldar;
import com.example.goldarku.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PrediksiIndexFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class PrediksiIndexFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    public PrediksiIndexFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_prediksi_index, container, false);
        final EditText Text_GolDarIbu = view.findViewById((R.id.input_goldaribu));
        final EditText Text_GolDarAyah = view.findViewById((R.id.input_goldarayah));

        Button buttonPrediksi = view.findViewById(R.id.button_prediksi);
        buttonPrediksi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mListener !=null){
                    String GolIbuString = Text_GolDarIbu.getText().toString();
                    String GolAyahString = Text_GolDarAyah.getText().toString();
                    if(!TextUtils.isEmpty(GolAyahString)&&!TextUtils.isEmpty(GolIbuString)){
                        String GolIbu = GolIbuString;
                        String GolAyah = GolAyahString;
                        PrediksiGoldar prediksiGoldar = new PrediksiGoldar(GolIbu,GolAyah);
                        mListener.onPrediksiButtonClicked(prediksiGoldar.getIndex());
                    }else{
                        Toast.makeText(getActivity(), "Isi Golongan Darah Ibu dan Ayah", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event

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
        void onPrediksiButtonClicked(String GolAnak);
    }
}
