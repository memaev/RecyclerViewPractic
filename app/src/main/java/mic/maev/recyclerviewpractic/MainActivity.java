package mic.maev.recyclerviewpractic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recView;
    private ArrayList<Student> students = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeData();
        recView = findViewById(R.id.recView);
        StudentAdapter studentAdapter = new StudentAdapter(this, students);
        recView.setLayoutManager(new LinearLayoutManager(this));
        recView.setAdapter(studentAdapter);
    }

    private void initializeData(){
        students.add(new Student("Ivan Ivanov", 3, 3));
        students.add(new Student("Van Ivanov", 4, 4));
        students.add(new Student("Ioan Ivanov", 5, 3));
        students.add(new Student("Kolya Ivanov", 7, 2));
        students.add(new Student("Vanya Ivanov", 1, 2));
        students.add(new Student("Vanya Ivanov", 1, 2));
        students.add(new Student("Vanya Ivanov", 1, 2));
        students.add(new Student("Vanya Ivanov", 1, 2));
        students.add(new Student("Vanya Ivanov", 1, 2));
        students.add(new Student("Vanya Ivanov", 1, 2));
        students.add(new Student("Vanya Ivanov", 1, 2));
        students.add(new Student("Vanya Ivanov", 1, 2));
        students.add(new Student("Vanya Ivanov", 1, 2));
        students.add(new Student("Vanya Ivanov", 1, 2));
        students.add(new Student("Vanya Ivanov", 1, 2));
    }
}