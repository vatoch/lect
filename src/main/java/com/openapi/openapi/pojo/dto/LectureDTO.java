package com.openapi.openapi.pojo.dto;

import com.openapi.openapi.pojo.Lecture;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LectureDTO {
    private String lectureName;
    private String lectureDescription;
    private Long duration;

    public static LectureDTO from(Lecture lecture) {
        return new LectureDTO(lecture.getLectureName(),lecture.getLectureDescription(),lecture.getLectureDuration());
    }
}
