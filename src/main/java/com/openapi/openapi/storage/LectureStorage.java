package com.openapi.openapi.storage;

import com.openapi.openapi.pojo.Lecture;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LectureStorage {

    private final List<Lecture> lectures = new ArrayList<>();


    public void saveLecture(Lecture lecture) {
        lectures.add(lecture);
    }

    public void removeLecture(int index) {
        lectures.remove(index);
    }

    public void updateLecture(int index,String lectureName,String lectureDescription,Long duration) {
        Lecture lecture = lectures.get(index);
        lecture.setLectureName(lectureName);
        lecture.setLectureDescription(lectureDescription);
        lecture.setLectureDuration(duration);
    }

    public Lecture getLecture(int index) {
        return lectures.get(index);
    }

    public List<Lecture> getLectures() {
        return lectures;
    }
}
