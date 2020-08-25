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

        /*
        Converter cssConverter = new Converter(CSS_UNITS, PX);
        double    point = 12;
        double    pixel = cssConverter.convert(point, PX);
        System.out.println(point + "pt  =>  " + pixel + "px");
        */

        Converter lengthConverter = new Converter(LENGTH, METER); // Type Length with BaseUnit Meter
        double    meter           = 1.0;
        double    inches          = lengthConverter.convert(meter, INCHES);
        double    nanometer       = lengthConverter.convert(inches, NANOMETER);
        System.out.println(meter + " " + lengthConverter.getUnitShort() + "   =>   " + inches + " in   =>   " + nanometer + " nm");


        Converter volumeConverter = new Converter(VOLUME, CUBIC_METER);
        double cubicMeter = 3;
        double liters = volumeConverter.convert(cubicMeter, LITER);
        System.out.println(cubicMeter + " cubic meter -> " + liters + " liter");

        Converter literConverter = new Converter(VOLUME, LITER);
        double liter = 3000;
        double cubicMeters = literConverter.convert(liter, CUBIC_METER);
        System.out.println(liter + " liter -> " + cubicMeters + " cubic meter");

        Converter glucoseConverter = new Converter(BLOOD_GLUCOSE, MILLIMOL_PER_LITER);
        double millimolPerLiter = 6.0;
        double milligramPerDeciliter = glucoseConverter.convert(millimolPerLiter, MILLIGRAM_PER_DECILITER);
        System.out.println(millimolPerLiter + "mmol/l -> " + milligramPerDeciliter + "mg/dl");

        Converter mgdlConverter = new Converter(BLOOD_GLUCOSE, MILLIGRAM_PER_DECILITER);
        double mgdl = 108.108108;
        double mmoll = mgdlConverter.convert(mgdl, MILLIMOL_PER_LITER);
        System.out.println(mgdl + " mg/dl -> " + mmoll + " mmol/l");

        // Convert meter to centimeter
        System.out.println(lengthConverter.convertToString(meter, CENTIMETER));

        // Shorten long numbers
        System.out.println(Converter.format(1_500_000, 1));

        System.out.println(Converter.format(1_000_000, 0));
    }

    public static void main(String[] args) {
        new Demo();
    }
}
