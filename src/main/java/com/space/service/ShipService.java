package com.space.service;

import com.space.controller.ShipOrder;
import com.space.model.Ship;
import com.space.model.ShipType;
import org.springframework.data.domain.Page;

public interface ShipService {
    Page<Ship> getAll(
            String name,
            String planet,
            ShipType shipType,
            Long after,
            Long before,
            Boolean isUsed,
            Double minSpeed,
            Double maxSpeed,
            Integer minCrewSize,
            Integer maxCrewSize,
            Double minRating,
            Double maxRating,
            ShipOrder order,
            Integer pageNumber,
            Integer pageSize);

    Integer getCount(
            String name,
            String planet,
            ShipType shipType,
            Long after,
            Long before,
            Boolean isUsed,
            Double minSpeed,
            Double maxSpeed,
            Integer minCrewSize,
            Integer maxCrewSize,
            Double minRating,
            Double maxRating);

    Ship createShip(String name, String planet,
                    ShipType shiptype, Long prodDateLong,
                    Boolean isUsed, Double speed,
                    Integer crewSize);

    Ship getShip(Long id);

    Ship updateShip(Ship ship);

    void deleteShip(Ship ship);
}
