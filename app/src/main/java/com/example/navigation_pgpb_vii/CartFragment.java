package com.example.navigation_pgpb_vii;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.Navigation;
public class CartFragment extends Fragment {

    public CartFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        // Temukan tombol Ticket Class
        AppCompatButton btnClass = view.findViewById(R.id.btnClass);

        // Menetapkan OnClickListener untuk tombol
        btnClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menggunakan NavController untuk berpindah ke TicketClass
                Navigation.findNavController(v).navigate(R.id.ticketClass);
            }
        });

        return view;
    }
}
