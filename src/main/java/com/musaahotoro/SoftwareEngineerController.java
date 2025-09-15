package com.musaahotoro;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEmgineerService softwareEmgineerService;

    public SoftwareEngineerController(SoftwareEmgineerService softwareEmgineerService) {
        this.softwareEmgineerService = softwareEmgineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return softwareEmgineerService.getAllSoftwareEngineers();
    }

    @GetMapping("{Id}")
    public SoftwareEngineer getEngineerById(@PathVariable Integer Id) {
        return softwareEmgineerService.getSoftwareEngineerById(Id);
    }

    @PostMapping
    public void addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer) {
        softwareEmgineerService.insertSoftwareEngineer(softwareEngineer);
    }

}

