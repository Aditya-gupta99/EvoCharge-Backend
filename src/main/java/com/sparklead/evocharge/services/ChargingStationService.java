package com.sparklead.evocharge.services;

import com.sparklead.evocharge.models.ChargingStation;

import java.util.List;

public interface ChargingStationService {


    Integer postStation(ChargingStation chargingStation);

    List<ChargingStation> getStationList();
}