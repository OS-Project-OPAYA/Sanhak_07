package com.capstone.mapapi.poi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoiController {

    @Autowired
    private PoiService poiService;

    @GetMapping("/api/pois")
    public Poi search(@RequestParam String keyword) {
        System.out.println("Received search request for keyword: " + keyword);  // 검색어 로그 출력
        return poiService.searchFirstPoi(keyword);  // 첫 번째 장소만 반환
    }
}
