package com.example.loginactivity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ProgrammingAdapter extends RecyclerView.Adapter<ProgrammingAdapter.ProgrammingViewHolder>{
    private ArrayList<Employee> data;
    private Context mContext;
    public ProgrammingAdapter(Context mContext, ArrayList<Employee> data){
        this.data = data;
        this.mContext = mContext;

    }
    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row, parent, false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {
        Employee emp = data.get(position);
        holder.TxtTitle.setText(emp.getEmpName());
        holder.TxtDesc.setText(emp.getEmpDesig());
        holder.TxtEmail.setText(emp.getEmpEmail());
        holder.ImgIcon.setBackgroundResource(emp.getImgView());



    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }
    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {
        ImageView ImgIcon;
        TextView TxtTitle, TxtDesc, TxtEmail;
        public ProgrammingViewHolder(@NonNull View itemView) {
            super(itemView);
            ImgIcon = itemView.findViewById(R.id.imageView2);
            TxtTitle = itemView.findViewById(R.id.textView);
            TxtDesc = itemView.findViewById(R.id.txtView2);
            TxtEmail = itemView.findViewById(R.id.txtView3);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    Toast.makeText(mContext, "position" + position, Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(mContext, EmpDetdemo.class);
                    intent.putExtra("name", data.get(position).getEmpName());
                    intent.putExtra("design", data.get(position).getEmpDesig());
                    intent.putExtra("email", data.get(position).getEmpEmail());
                    intent.putExtra("gender", data.get(position).getEmpGender());
                    intent.putExtra("mono", data.get(position).getEmpMobile());
                    intent.putExtra("address", data.get(position).getEmpAddress());

                    mContext.startActivity(intent);
                }

                private int getBindingAdapterPosition() {
                    return 0;
                }
            });
        }
    }
}
