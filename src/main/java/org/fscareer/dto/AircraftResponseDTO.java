package org.fscareer.dto;

import java.math.BigDecimal;

public record AircraftResponseDTO(Long id, String makeModel, String registration, String owner, String locationIAO,
        String locationName, String homeICAO, BigDecimal salePrice, BigDecimal rentalDry, BigDecimal rentalWet,
        String rentalTime, Double fuelPct, String needsRepair, String airFrameTime, String timeLast100Hr,
        BigDecimal mounthlyFee, BigDecimal feeOwed) {

}
