package com.openapi.openapi.service;

import com.openapi.openapi.pojo.dto.LectureDTO;
import com.openapi.openapi.pojo.param.LectureParam;
import com.openapi.openapi.pojo.param.LectureUpdateParam;
import com.openapi.openapi.storage.LectureStorage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LectureService {
    private final LectureStorage lectureStorage;

    public void createLecture(LectureParam lectureParam) {
        lectureStorage.saveLecture(LectureParam.from(lectureParam));
    }

    public void updateLecture(LectureUpdateParam lectureParam) {
        lectureStorage.updateLecture(lectureParam.getIndex(),lectureParam.getLectureName(),lectureParam.getLectureDescription(),lectureParam.getDuration());
    }

    public void deleteLecture(int index) {
        lectureStorage.removeLecture(index);
    }

    public LectureDTO getLecture(int index) {
        return LectureDTO.from(lectureStorage.getLecture(index));
    }

    public List<LectureDTO> getAllLectures() {
        return lectureStorage.getLectures().stream().map(LectureDTO::from).toList();
    }
}
