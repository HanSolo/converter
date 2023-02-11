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
- RESISTANCE
   - NANOOHM
   - MICROOHM
   - MILLIOHM
   - OHM
   - KILOOHM
   - MEGAOHM
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
- GENERAL
   - YOTA
   - ZETTA
   - EXA
   - PETA
   - TERA
   - GIGA
   - MEGA
   - KILO
   - HECTO
   - DECA
   - GENERAL_BASE
   - DECI
   - CENTI
   - MILLI
   - MICRO
   - NANO
   - PICO
   - FEMPTO
   - ATTO
   - ZEPTO
   - YOCTO

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

### Builder Class

Lets you create your Converter using Builder style, which can be preferable for readibility and usability, allowing you to set all parameters in a single line of code. Leverage the intelligent coding assistance that your IDE provides to make it easier to access the relevant parameters of Converter.

```Java
Converter voltConverter = new Converter.Builder(VOLTAGE, VOLT).decimals(4).locale(Locale.GERMANY).build();
double volts = 1206;
String millivolts = voltConverter.convertToString(volts, MILLIVOLT);
String kilivolts = voltConverter.convertToString(volts, KILOVOLT);
System.out.println(volts + " " + voltConverter.getUnitShort() + " => " + millivolts + " => " + kilivolts);
```
```Java
Converter dataConverter = new Converter.Builder(DATA)
                                       .units(GIGABYTES)
                                       .decimals(2)
                                       .locale(Locale.GERMANY)
                                       .build();
```
## General Unit
General is a unit that you can use to convert values within the standard scientific notation conversion steps. You can assign any word you'd like to the unit and you use it in either one of these two ways:
```Java
Converter c = new Converter(GENERAL, GENERAL_BASE);
c.setGeneralUnitDefinition("Blurbs", GENERAL_BASE);
douoble blurbs = 123;
double kiloBlurbs = c.convert(blurbs, KILO);
double microBlurbs = c.convert(blurbs,MICRO);
```

OR

```Java
Converter c = new Converter.Builder(GENERAL).units(GENERAL_BASE).decimals(3).generalUnit("Blurbs").build();
double blurbs = 12345;
double kiloBlurbs = c.convert(blurbs, KILO);
double microBlurbs = c.convert(blurbs,MICRO);
System.out.println(c.convertToString(blurbs, KILO));
```
Output:
> 12.345 kBlurbs
