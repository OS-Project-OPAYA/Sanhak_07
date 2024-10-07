package com.capstone.mapapi.poi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PoiController {

    @Autowired
    private PoiService poiService;

    @PostMapping("/startSearch")
    public Poi searchStartPoi(@RequestBody String keyword) {
        return poiService.searchFirstPoi(keyword, true); // 출발지 검색 시 isStart=true
    }

    @PostMapping("/endSearch")
    public Poi searchEndPoi(@RequestBody String keyword) {
        return poiService.searchFirstPoi(keyword, false); // 목적지 검색 시 isStart=false
    }

}
