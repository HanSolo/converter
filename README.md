## Converter
A Java tool to convert between units. It covers the following types of units:
 - ACCELERATION
 - ANGLE
 - AREA
 - DATA
 - CURRENT
 - ELECTRIC_CHARGE
 - ENERGY
 - FORCE
 - HUMIDITY
 - LENGTH
 - LUMINANCE
 - LUMINOUS_FLUX
 - MASS
 - PRESSURE
 - SPEED
 - TEMPERATURE
 - TEMPERATURE_GRADIENT
 - TIME
 - TORQUE
 - VOLUME
 - VOLTAGE
 - WORK
 
 
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