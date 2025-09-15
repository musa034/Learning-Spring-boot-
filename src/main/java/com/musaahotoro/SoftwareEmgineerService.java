package com.musaahotoro;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class SoftwareEmgineerService {
    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEmgineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepository.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        softwareEngineerRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer Id) {
        return softwareEngineerRepository.findById(Id).orElseThrow(() -> new IllegalStateException(Id + " not found"));
    }
}
