package com.sparklead.evocharge.controllers;

import com.sparklead.evocharge.models.ChargingStation;
import com.sparklead.evocharge.services.ChargingStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chargingStation")
public class ChargingStationController {

    @Autowired
    private ChargingStationService chargingStationService;

    @PostMapping("/post")
    public Integer postStation(@RequestBody ChargingStation chargingStation) {
        return chargingStationService.postStation(chargingStation);
    }

}