package com.example.navigation_pgpb_vii;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.navigation_pgpb_vii.databinding.FragmentCheckoutBinding;

import java.util.ArrayList;
import java.util.List;

public class CheckoutFragment extends Fragment {

    private FragmentCheckoutBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentCheckoutBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Disaster> disasterList = new ArrayList<>();
        Disaster indonesia = new Disaster("Indonesia", "Economy");
        Disaster japan = new Disaster("Japan", "Business");
        Disaster france = new Disaster("France", "Economy");
        Disaster australia = new Disaster("Australia", "First Class");
        Disaster canada = new Disaster("Canada", "Economy");
        Disaster uae = new Disaster("United Arab Emirates", "Business");
        Disaster brazil = new Disaster("Brazil", "First Class");
        Disaster netherlands = new Disaster("Netherlands", "Business");
        Disaster china = new Disaster("China", "First Class");
        Disaster thailand = new Disaster("Thailand", "Economy");
        Disaster italy = new Disaster("Italy", "Business");
        Disaster turkey = new Disaster("Turkey", "First Class");
        Disaster southKorea = new Disaster("South Korea", "Economy");
        Disaster spain = new Disaster("Spain", "Business");
        Disaster mexico = new Disaster("Mexico", "First Class");
        Disaster germany = new Disaster("Germany", "Economy");
        Disaster switzerland = new Disaster("Switzerland", "Business");

        disasterList.add(indonesia);
        disasterList.add(japan);
        disasterList.add(france);
        disasterList.add(australia);
        disasterList.add(canada);
        disasterList.add(uae);
        disasterList.add(brazil);
        disasterList.add(netherlands);
        disasterList.add(china);
        disasterList.add(thailand);
        disasterList.add(italy);
        disasterList.add(turkey);
        disasterList.add(southKorea);
        disasterList.add(spain);
        disasterList.add(mexico);
        disasterList.add(germany);
        disasterList.add(switzerland);


        // Mengatur adapter dan layout manager RecyclerView
        DisasterAdapter disasterAdapter = new DisasterAdapter(disasterList);
        binding.ryDisaster.setAdapter(disasterAdapter);
        binding.ryDisaster.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
