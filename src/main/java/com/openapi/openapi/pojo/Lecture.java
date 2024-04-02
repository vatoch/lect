package com.openapi.openapi.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lecture {

    private String lectureName;
    private String lectureDescription;
    private Long lectureDuration;
}
