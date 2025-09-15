package com.musaahotoro;

import org.springframework.ui.Model;
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

    //-----I added this as a demo to see how the UI will look like using the thymeleaf-----//
    @GetMapping("/engineers")
    public String getEngineers(Model model) {
        List<SoftwareEngineer> engineers = List.of(
                new SoftwareEngineer(1, "Musa", "Java, Spring Boot, React"),
                new SoftwareEngineer(1, "Alice", "Python, Django"),
                new SoftwareEngineer(1, "John", "Go, Kubernetes")
        );

        model.addAttribute("engineers", engineers);
        return "engineers What rae you areljldm"; // This looks for engineers.html in templates folder
    }

}

