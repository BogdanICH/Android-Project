package com.example.studentatfmiunibuc;

public class CourseModel {

    private String title;
    private String duration;
    private int imageId;

    public CourseModel(String title, String duration, int imageId) {
        this.title = title;
        this.duration = duration;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public int getImageId() {
        return imageId;
    }
}
