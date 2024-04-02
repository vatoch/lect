package com.openapi.openapi.pojo.param;

import com.openapi.openapi.pojo.Lecture;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LectureParam
{
    private String lectureName;
    private String lectureDescription;
    private Long duration;

    public static Lecture from(LectureParam lectureParam) {
        return new Lecture(lectureParam.getLectureName(),lectureParam.getLectureDescription(),lectureParam.getDuration());
    }
}
