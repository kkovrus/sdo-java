package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//import java.text.DateFormat;
import android.text.format.DateFormat;

import java.util.List;
import java.util.UUID;

public class CrimeListFragment extends Fragment {
    private RecyclerView crimeRecyclerView;
    private CrimeAdapter crimeAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crime_list, container, false);
        crimeRecyclerView = (RecyclerView) view.findViewById(R.id.crime_recycle_view);
        crimeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        updateUI();
        return view;
    }

    private class CrimeHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView titleTextView;
        private TextView solvedTextView;
        private TextView dateTextView;
        private TextView crimeIdTextView;
        private Crime crime;

        public CrimeHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_crime, parent, false));
            itemView.setOnClickListener(this);
            titleTextView = (TextView) itemView.findViewById(R.id.crime_title);
            solvedTextView = (TextView) itemView.findViewById(R.id.crime_solved);
            dateTextView = (TextView) itemView.findViewById(R.id.crime_date);
            crimeIdTextView = itemView.findViewById(R.id.crimeID);
        }

        public void bind(Crime crime) {
            titleTextView.setText(crime.getTitle());
            solvedTextView.setText(Boolean.toString(crime.isSolved()));
            dateTextView.setText(DateFormat.format("MMM dd, yyyy", crime.getDate()));
            crimeIdTextView.setText(crime.getId().toString());
        }

        @Override
        public void onClick(View v) {
            Intent intent = CrimePagerActivity.newIntent(getActivity(), UUID.fromString(String.valueOf(crimeIdTextView.getText())));
            //Intent intent = new Intent(getActivity(), MainActivity.class);
            //intent.putExtra("crimeID", UUID.fromString(String.valueOf(crimeIdTextView.getText())));
            startActivity(intent);
            //Toast.makeText(getActivity(), "Click!", Toast.LENGTH_SHORT).show();
        }
    }

    private class CrimeAdapter extends RecyclerView.Adapter<CrimeHolder> {
        private List<Crime> aCrimes;

        public CrimeAdapter(List<Crime> crimes) {
            aCrimes = crimes;
        }

        @NonNull
        @Override
        public CrimeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            return new CrimeHolder(layoutInflater, parent);
        }

        @Override
        public void onBindViewHolder(@NonNull CrimeHolder holder, int position) {
            Crime crime = aCrimes.get(position);
            holder.bind(crime);
        }

        @Override
        public int getItemCount() {
            return aCrimes.size();
        }
    }

    private void updateUI() {
        CrimeLab crimeLab = CrimeLab.get(getActivity());
        List<Crime> crimes = crimeLab.getCrimes();
        if (crimeAdapter == null) {
            crimeAdapter = new CrimeAdapter(crimes);
            crimeRecyclerView.setAdapter(crimeAdapter);
        } else {
            crimeAdapter.notifyDataSetChanged();
        }
    }
}
