package com.openapi.openapi.controller;

import com.openapi.openapi.pojo.dto.LectureDTO;
import com.openapi.openapi.pojo.param.LectureParam;
import com.openapi.openapi.pojo.param.LectureUpdateParam;
import com.openapi.openapi.service.LectureService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lecture")
public class LectureController {
    private final LectureService lectureService;

    @PostMapping("/")
    public void addLecture(@RequestBody LectureParam lectureParam) {
        lectureService.createLecture(lectureParam);
    }

    @PutMapping("/")
    public void updateLecture(@RequestBody LectureUpdateParam lectureUpdateParam) {
        lectureService.updateLecture(lectureUpdateParam);
    }

    @DeleteMapping("/{index}")
    public void deleteLecture(@PathVariable Integer index) {
        lectureService.deleteLecture(index);
    }

    @GetMapping("/{index}")
    public LectureDTO getLecture(@PathVariable int index) {
        return lectureService.getLecture(index);
    }

    @GetMapping("/")
    public List<LectureDTO> getLectures() {
        return lectureService.getAllLectures();
    }


}
