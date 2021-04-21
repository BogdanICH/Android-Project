package com.example.studentatfmiunibuc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LearnFragment extends Fragment implements OnItemClickListener {

    public static List<CourseModel> courseList = new ArrayList<>();

    public LearnFragment() {
        super(R.layout.fragment_learn);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initializeCourseList();

        RecyclerView rv = view.findViewById(R.id.recycler_view);
        CourseAdapter adapter = new CourseAdapter(courseList, this);
        rv.setAdapter(adapter);
    }
    private void initializeCourseList() {

        courseList.add(new CourseModel(
                "Analiză Matematică",
                "100min",
                R.drawable.ic_function
        ));

        courseList.add(new CourseModel(
                "Algebră Matematică",
                "100min",
                R.drawable.ic_function
        ));
    }

    @Override
    public void onItemClick(CourseModel item) {
        Toast.makeText(getContext(), item.getTitle(), Toast.LENGTH_LONG).show();
    }
}