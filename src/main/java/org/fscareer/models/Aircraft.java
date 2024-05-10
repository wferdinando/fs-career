package org.fscareer.models;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "aircraft")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Aircraft {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long id;
    private String makeModel;
    private String registration;
    private String owner;
    private String locationICAO;
    private String locationName;
    private String homeIcao;
    private BigDecimal salePrice;
    private BigDecimal rentalDry;
    private BigDecimal rentalWet;
    private LocalTime  rentalTime;
    private Double fuelPct;
    private boolean needsRepair;
    private LocalTime airFrameTime;
    private LocalTime engineTime;
    private LocalTime timeLast100Hr;
    private BigDecimal monthlyFee;
    private BigDecimal feeOwed;   
}
