package com.example.dormitoryapp.kezekshilik.ui.keshigip.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.dormitoryapp.R;

import java.util.List;

public class LateStudentAdapter  extends RecyclerView.Adapter<LateStudentAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<LateStudent> students;

    public LateStudentAdapter(Context context, List<LateStudent> students) {
        this.students = students;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public LateStudentAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.late_student_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LateStudentAdapter.ViewHolder holder, int position) {
        LateStudent student = students.get(position);
        holder.name.setText(student.getName());
        holder.group.setText(student.getGroup());
        holder.lateMinute.setText(student.getlateMinute());
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView name, group, lateMinute;
        ViewHolder(View view){
            super(view);
            name = view.findViewById(R.id.student_name);
            group = view.findViewById(R.id.student_group);
            lateMinute = view.findViewById(R.id.late_minute);
        }
    }
}