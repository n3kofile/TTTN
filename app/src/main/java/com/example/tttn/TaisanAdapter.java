package com.example.tttn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaisanAdapter extends RecyclerView.Adapter<TaisanAdapter.ViewHolder> {
    private List<Taisan> dataList;

    public TaisanAdapter(List<Taisan> dataList) {
        this.dataList = dataList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_room, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Taisan data = dataList.get(position);
        holder.dovat.setText(data.getDovat());
        holder.soluong.setText(String.valueOf(data.getSoluong()));
        holder.mota.setText(data.getMota());

        // Thay đổi hình ảnh dựa trên trạng thái của mục
        if (data.isCheck()) {
            holder.check.setImageResource(R.drawable.check);
        } else {
            holder.check.setImageResource(0);
        }

        // Xử lý sự kiện khi người dùng nhấn vào mục để thay đổi trạng thái
        holder.check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Đảo ngược trạng thái của mục khi nhấn
                data.setCheck(!data.isCheck());

                // Cập nhật hình ảnh
                if (data.isCheck()) {
                    holder.check.setImageResource(R.drawable.check);
                } else {
                    holder.check.setImageResource(0);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView dovat , mota , soluong ;
        public ImageView check;

        public ViewHolder(View itemView) {
            super(itemView);
            dovat = itemView.findViewById(R.id.dovat);
            soluong = itemView.findViewById(R.id.soluong);
            check = itemView.findViewById(R.id.check);
            mota = itemView.findViewById(R.id.mota);
        }
    }
}

