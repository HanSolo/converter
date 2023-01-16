## Converter
A Java tool to convert between units. It covers the following categories of units:
 - ACCELERATION
   - METER_PER_SQUARE_SECOND
   - INCH_PER_SQUARE_SECOND
   - GRAVITY
 - ANGLE
   - DEGREE
   - RADIAN
   - GRAD
 - AREA
   - SQUARE_KILOMETER
   - SQUARE_METER
   - SQUARE_CENTIMETER
   - SQUARE_MILLIMETER
   - SQUARE_MICROMETER
   - SQUARE_NANOMETER
   - SQUARE_ANGSTROM
   - SQUARE_PICOMETER
   - SQUARE_FEMTOMETER
   - HECTARE
   - ACRE
   - ARES
   - SQUARE_INCH
   - SQUARE_FOOT
 - DATA
   - BIT
   - BYTE
 - k = 1024
   - KILOBIT
   - MEGABIT
   - GIGABIT
   - TERABIT
   - PETABIT
   - EXABIT
   - ZETABIT
   - YOTABIT
   - KILOBYTE
   - MEGABYTE
   - GIGABYTE
   - TERABYTE
   - PETABYTE
   - EXABYTE
   - ZETABYTE
   - YOTABYTE
 - k = 1000
   - KILOBIT_B1000
   - MEGABIT_B1000
   - GIGABIT_B1000
   - TERABIT_B1000
   - PETABIT_B1000
   - EXABIT_B1000
   - ZETABIT_B1000
   - YOTABIT_B1000
   - KILOBYTE_B1000
   - MEGABYTE_B1000
   - GIGABYTE_B1000
   - TERABYTE_B1000
   - PETABYTE_B1000
   - EXABYTE_B1000
   - ZETABYTE_B1000
   - YOTABYTE_B1000
 - CURRENT
   - PICOAMPERE
   - NANOAMPERE
   - MICROAMPERE
   - MILLIAMPERE
   - AMPERE
   - KILOAMPERE
 - ELECTRIC_CHARGE
   - ELEMENTARY_CHARGE
   - PICOCOULOMB
   - NANOCOULOMB
   - MICROCOULOMB
   - MILLICOULOMB
   - COULOMB
 - ENERGY
   - MILLIJOULE
   - JOULE
   - KILOJOULE
   - MEGAJOULE
   - CALORY
   - KILOCALORY
   - WATT_SECOND
   - WATT_HOUR
   - KILOWATT_SECOND
   - KILOWATT_HOUR
 - FORCE
   - NEWTON
   - KILOGRAM_FORCE
   - POUND_FORCE
 - HUMIDITY
   - PERCENTAGE
 - LENGTH
   - KILOMETER
   - HECTOMETER
   - METER
   - DECIMETER
   - CENTIMETER
   - MILLIMETER
   - MICROMETER
   - NANOMETER
   - ANGSTROM
   - PICOMETER
   - FEMTOMETER
   - INCHES
   - MILES
   - NAUTICAL_MILES
   - FEET
   - YARD
   - LIGHT_YEAR
   - PARSEC
   - PIXEL
   - POINT
   - PICA
   - EM
 - LUMINANCE
   - CANDELA_SQUARE_METER
   - CANDELA_SQUARE_CENTIMETER
   - CANDELA_SQUARE_INCH
   - CANDELA_SQAURE_FOOT
   - LAMBERT
   - FOOT_LAMBERT
 - LUMINOUS_FLUX
   - LUX
   - PHOT
   - FOOT_CANDLE
   - LUMEN_SQUARE_INCH
 - MASS
   - TON
   - KILOGRAM
   - GRAM
   - MILLIGRAM
   - MICROGRAM
   - NANOGRAM
   - PICOGRAM
   - FEMTOGRAM
   - OUNCE
   - POUND
 - PRESSURE
   - MILLIPASCAL
   - PASCAL
   - HECTOPASCAL
   - KILOPASCAL
   - BAR
   - MILLIBAR
   - TORR
   - PSI
   - PSF
   - ATMOSPHERE
 - SPEED
   - MILLIMETER_PER_SECOND
   - METER_PER_SECOND
   - KILOMETER_PER_HOUR
   - MILES_PER_HOUR
   - KNOT
   - MACH
 - TEMPERATURE
   - KELVIN
   - CELSIUS
   - FAHRENHEIT
 - TEMPERATURE_GRADIENT
   - KELVIN_PER_SECOND
   - KELVIN_PER_MINUTE
   - KEVLIN_PER_HOUR
 - TIME
   - WEEK
   - DAY
   - HOUR
   - MINUTE
   - SECOND
   - MILLISECOND
   - MICROSECOND
   - NANOSECOND
   - PICOSECOND
   - FEMTOSECOND
 - TORQUE
   - NEWTON_METER
   - METER_KILOGRAM
   - FOOT_POUND_FORCE
   - INCH_POUND_FORCE
 - VOLUME
   - CUBIC_MILLIMETER
   - MILLILITER
   - LITER
   - CUBIC_METER
   - GALLON
   - CUBIC_FEET
   - CUBIC_INCH
 - VOLTAGE
   - MILLIVOLT
   - VOLT
   - KILOVOLT
   - MEGAVOLT
 - WORK
   - MILLIWATT
   - WATT
   - KILOWATT
   - MEGAWATT
   - GIGAWATT
   - HORSEPOWER
   - JOULE_PER_SECOND

 #Usage

 ```Java
 Converter temperatureConverter = new Converter(TEMPERATURE, CELSIUS); // Type Temperature with BaseUnit Celsius
 double    celsius              = 32.0;
 double    fahrenheit           = temperatureConverter.convert(celsius, FAHRENHEIT);
 double    kelvin               = temperatureConverter.convert(celsius, KELVIN);
 System.out.println(celsius + "°C   =>   " + fahrenheit + "°F    =>   " + kelvin + "°K");


 Converter lengthConverter = new Converter(LENGTH, METER); // Type Length with BaseUnit Meter
 double    meter           = 1.0;
 double    inches          = lengthConverter.convert(meter, INCHES);
 double    nanometer       = lengthConverter.convert(inches, NANOMETER);
 System.out.println(meter + " " + lengthConverter.getUnitShort() + "   =>   " + inches + " in   =>   " + nanometer + " nm");

 // Convert meter to centimeter
 System.out.println(lengthConverter.convertToString(meter, CENTIMETER));

 ```
