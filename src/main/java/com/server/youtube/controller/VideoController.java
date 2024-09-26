package com.server.youtube.controller;

import com.server.youtube.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/*")
public class VideoController {
    @Autowired
    private VideoService service;

    // 전체 조회
    @GetMapping("/video")
    public ResponseEntity viewAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.viewAll());
    }
}
