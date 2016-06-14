package com.andyn.controller;

import com.andyn.model.Maintenance;
import com.andyn.model.Vehicle;
import com.andyn.repository.MaintenanceRepository;
import com.andyn.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/vehicle")
@CrossOrigin()

public class VehicleController {

    @Autowired
    private VehicleRepository vehicleRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Vehicle> listMaintenanceOptions() {
        System.out.println("Listing!");
        return vehicleRepository.findAll();
    }
}
