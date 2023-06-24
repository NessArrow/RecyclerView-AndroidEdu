package com.eduandroid.recyclervieweduandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CE_RecyclerViewAdapter extends RecyclerView.Adapter<CE_RecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<ChemicalElementsModel> chemicalElementsModels;

    public CE_RecyclerViewAdapter(Context context, ArrayList<ChemicalElementsModel> chemicalElementsModels){
        this.context = context;
        this.chemicalElementsModels = chemicalElementsModels;
    }

    @NonNull
    @Override
    public CE_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycle_view_row, parent, false);

        return new CE_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CE_RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.tvNameEN.setText(chemicalElementsModels.get(position).getElementNameEN());
        holder.tvNameRU.setText(chemicalElementsModels.get(position).getElementNameRU());
        holder.tvWeight.setText(String.valueOf(chemicalElementsModels.get(position).getWeight()));
        holder.tvSymbol.setText(chemicalElementsModels.get(position).getSmallName());
    }

    @Override
    public int getItemCount() {
        return chemicalElementsModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tvSymbol, tvNameEN, tvNameRU, tvWeight;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNameEN = itemView.findViewById(R.id.en_name_tv);
            tvNameRU = itemView.findViewById(R.id.ru_name_tv);
            tvSymbol = itemView.findViewById(R.id.symbol_tv);
            tvWeight = itemView.findViewById(R.id.atomic_weight_tv);
        }
    }
}
