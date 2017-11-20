/*
 * Copyright (c) 2017 by Gerrit Grunwald
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.hansolo.unit.converter;

import static eu.hansolo.unit.converter.Converter.UnitDefinition.*;
import static eu.hansolo.unit.converter.Converter.Category.*;


public class Demo {

    public Demo() {
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

        // Shorten long numbers
        System.out.println(lengthConverter.format(1500000, 1));
    }

    public static void main(String[] args) {
        new Demo();
    }
}
