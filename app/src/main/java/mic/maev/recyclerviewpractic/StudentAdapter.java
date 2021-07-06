package mic.maev.recyclerviewpractic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private List<Student> students;

    StudentAdapter(Context context, List<Student> students){
        this.students = students;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentAdapter.ViewHolder holder, int position) {
        Student student = students.get(position);
        holder.fullName.setText(student.getFullname());
        holder.clas.setText(Integer.toString(student.getClas()));
        holder.skills.setText(Integer.toString(student.getSkills()));
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView fullName, clas, skills;
        public ViewHolder(View view) {
            super(view);

            fullName = view.findViewById(R.id.fullname_txt);
            clas = view.findViewById(R.id.class_txt);
            skills = view.findViewById(R.id.skills_txt);
        }
    }
}
