package com.sparklead.evocharge.services;

import com.sparklead.evocharge.models.ChargingStation;
import com.sparklead.evocharge.repositories.ChargingStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ChargingStationServiceImp implements ChargingStationService{

    @Autowired
    private ChargingStationRepository chargingStationRepository;

    @Override
    public Integer postStation(ChargingStation chargingStation) {
        return chargingStationRepository.save(chargingStation).getStationId();
    }
}