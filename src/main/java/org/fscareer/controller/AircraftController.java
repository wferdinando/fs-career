package org.fscareer.controller;

import java.util.List;

import org.fscareer.dto.AircraftResponseDTO;
import org.fscareer.models.Aircraft;
import org.fscareer.service.AircraftService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.RequiredArgsConstructor;

@Path("/v1/aircraft")
@RequiredArgsConstructor
public class AircraftController {
  
    private final AircraftService aircraftService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<AircraftResponseDTO> findAllProducts() {
        return aircraftService.getAllAircrafts();
    }

}
