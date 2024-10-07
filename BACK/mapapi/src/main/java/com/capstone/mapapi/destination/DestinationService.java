package com.capstone.mapapi.destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinationService {

    @Autowired
    private DestinationRepository destinationRepository;

    // Start 엔티티 저장
    public Destination saveDestination(Destination destination) {
        return destinationRepository.save(destination); // Start 객체를 그대로 저장
    }
}
