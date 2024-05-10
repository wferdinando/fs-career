package org.fscareer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.fscareer.dto.AircraftResponseDTO;
import org.fscareer.repository.AircraftRepository;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor
public class AircraftService {

    private final AircraftRepository aircraftRepository;

    public List<AircraftResponseDTO> getAllAircrafts() {
        List<AircraftResponseDTO> listAircraftResponseDTOs = new ArrayList<>();
        aircraftRepository.findAll().stream().forEach(act -> {
            listAircraftResponseDTOs.add(
                    new AircraftResponseDTO(
                            act.getId(),
                            act.getMakeModel(),
                            act.getRegistration(),
                            act.getOwner(),
                            act.getLocationICAO(),
                            act.getLocationName(),
                            act.getHomeIcao(),
                            act.getSalePrice(),
                            act.getRentalDry(),
                            act.getRentalWet(),
                            convertLongHour(act.getRentalTime()),
                            act.getFuelPct(),
                            verifyNeedsReapair(act.getTimeLast100Hr()),
                            convertLongHour(act.getAirFrameTime()),
                            convertLongHour(act.getTimeLast100Hr()),
                            act.getMonthlyFee(),
                            act.getFeeOwed()));
        });

        return listAircraftResponseDTOs;
    }

    public static String convertLongHour(Long tempo) {
        long horas = TimeUnit.MILLISECONDS.toHours(tempo);
        long minutos = TimeUnit.MILLISECONDS.toMinutes(tempo) - TimeUnit.HOURS.toMinutes(horas);
        String duracaoFormatada = String.format("%02d:%02d", horas, minutos);
        return duracaoFormatada;
    }

    public static String verifyNeedsReapair(Long tempo) {
        if (tempo >= 360000000) {
            return "S";
        } else {
            return "N";
        }

    }
}