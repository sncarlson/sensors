package org.devhive.sensors.controller;

import org.devhive.sensors.model.Temp;
import org.devhive.sensors.repository.TempRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TempController {
    private final TempRepository tempRepository;

    @Autowired
    public TempController(TempRepository tempRepository) {
        this.tempRepository = tempRepository;
    }

    @GetMapping("/temp")
    List<Temp> getAllTemps() {
        return tempRepository.findAll();
    }

    @PostMapping("/temp")
    Temp newTemp (@RequestBody Temp newTemp) {
        System.out.println(newTemp.toString());
        return tempRepository.save(newTemp);
    }

}
