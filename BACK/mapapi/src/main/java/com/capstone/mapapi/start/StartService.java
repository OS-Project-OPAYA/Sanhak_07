package com.capstone.mapapi.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StartService {

    @Autowired
    private StartRepository startRepository;

    // Start 엔티티 저장
    public Start saveStart(Start start) {
        return startRepository.save(start); // Start 객체를 그대로 저장
    }
}
