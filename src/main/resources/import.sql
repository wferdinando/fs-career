INSERT INTO aircraft (id, makeModel, registration, owner, locationICAO, locationName, homeIcao, salePrice, rentalDry, rentalWet, rentalTime, fuelPct, needsRepair, airFrameTime, engineTime, timeLast100Hr, monthlyFee, feeOwed) 
VALUES 
(1, 'Cessna 172 Skyhawk', 'N12345', 'John Doe', 'KLAX', 'Los Angeles International Airport', 'KLAX', 125000.00, 100.00, 150.00, 28800, 0.75, false, 360000000, 7200000, 360000000, 500.00, 0.00),
(2, 'Piper PA-28 Cherokee', 'N54321', 'Jane Smith', 'KSFO', 'San Francisco International Airport', 'KSFO', 95000.00, 90.00, 140.00, 27000, 0.70, true, 5400000, 7920000, 3600000, 450.00, 200.00),
(3, 'Beechcraft Bonanza', 'N98765', 'Michael Johnson', 'KJFK', 'John F. Kennedy International Airport', 'KJFK', 210000.00, 150.00, 200.00, 32400, 0.80, false, 7200000, 6480000, 1440000, 700.00, 0.00),
(4, 'Cirrus SR22', 'N24680', 'Emily Brown', 'KDEN', 'Denver International Airport', 'KDEN', 280000.00, 200.00, 250.00, 36000, 0.85, true, 6480000, 8640000, 2520000, 750.00, 150.00),
(5, 'Diamond DA40', 'N13579', 'Christopher Lee', 'KDFW', 'Dallas/Fort Worth International Airport', 'KDFW', 180000.00, 120.00, 180.00, 30600, 0.75, false, 6120000, 7560000, 1980000, 600.00, 0.00),
(6, 'Mooney M20', 'N11223', 'Samantha Taylor', 'KATL', 'Hartsfield-Jackson Atlanta International Airport', 'KATL', 135000.00, 110.00, 160.00, 29700, 0.70, true, 5760000, 8280000, 2340000, 550.00, 100.00),
(7, 'Embraer Phenom 100', 'N76543', 'David Wilson', 'KMIA', 'Miami International Airport', 'KMIA', 850000.00, 500.00, 600.00, 43200, 0.90, false, 10800000, 14400000, 3240000, 1500.00, 0.00),
(8, 'Gulfstream G650', 'N54321', 'Sarah Miller', 'KIAH', 'George Bush Intercontinental Airport', 'KIAH', 2500000.00, 1500.00, 1800.00, 72000, 0.95, false, 18000000, 21600000, 5400000, 5000.00, 0.00),
(9, 'Boeing 737', 'N98765', 'Matthew Anderson', 'KLAS', 'McCarran International Airport', 'KLAS', 7500000.00, 5000.00, 6000.00, 108000, 0.98, false, 28800000, 32400000, 7200000, 10000.00, 0.00),
(10, 'Airbus A320', 'N24680', 'Emma White', 'KSAN', 'San Diego International Airport', 'KSAN', 15000000.00, 8000.00, 10000.00, 144000, 0.99, false, 36000000, 39600000, 9000000, 20000.00, 0.00);