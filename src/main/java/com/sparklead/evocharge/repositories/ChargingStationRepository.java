package com.sparklead.evocharge.repositories;

import com.sparklead.evocharge.models.ChargingStation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargingStationRepository extends MongoRepository<ChargingStation,Integer> {

}