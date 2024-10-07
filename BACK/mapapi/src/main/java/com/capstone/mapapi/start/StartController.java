package com.capstone.mapapi.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {
    
    @Autowired
    private StartService startService;

    @PostMapping("/start")
    public Start createStart(@RequestBody Start start) {
        return startService.saveStart(start); // Start 객체를 그대로 전달
    }
}
