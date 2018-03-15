package kenazCode;


import java.math.BigDecimal;

public class ConvertingPart {
    public double lightYear, meters, astronomicalUnit, parsec, convertedUnit;
    public String units1Transform, units2Transform;


    public ConvertingPart(double writedUnit,String units1Transform,String units2Transform){
        this.units2Transform = units2Transform;
        this.units1Transform = units1Transform;

        if(units1Transform == "Light-year"){
            lightYear = writedUnit;
         }else if(units1Transform == "Meters"){
            meters = writedUnit;
         }else if(units1Transform == "Astronomical Unit"){
            astronomicalUnit = writedUnit;
         }else if(units1Transform == "Parsec"){
            parsec = writedUnit; }

    }

    public double conResult(){
        if(units1Transform == "Light-year" && units2Transform == "Meters"){
            convertedUnit = lightYear * 94606 * 100000 *1000000;
            return convertedUnit;
        }else if(units1Transform == "Light-year" && units2Transform == "Astronomical Unit") {
            convertedUnit = lightYear * 63240;
            return convertedUnit;
        }else if(units1Transform == "Light-year" && units2Transform == "Parsec"){
            convertedUnit = lightYear * 0.306594845;
            return convertedUnit;
        }else if(units1Transform == "Light-year" && units2Transform == "Light-year"){
            convertedUnit = lightYear;
            return convertedUnit;
        }

        if(units1Transform == "Meters" && units2Transform == "Meters"){
            convertedUnit = meters;
            return convertedUnit;
        }else if(units1Transform == "Meters" && units2Transform == "Astronomical Unit") {
            convertedUnit = meters * 6.68458712 * 0.000000000001;
            return convertedUnit;
        }else if(units1Transform == "Meters" && units2Transform == "Parsec"){
            convertedUnit = meters * 3.24077929 * 0.0000000000000001;
            return convertedUnit;
        }else if(units1Transform == "Meters" && units2Transform == "Light-year"){
            convertedUnit = meters * 1.05702341 * 0.0000000000000001;
            return convertedUnit;
        }

        if(units1Transform == "Parsec" && units2Transform == "Meters"){
            convertedUnit =  parsec * 3.08567758 * 1000000000 * 10000000;
            return convertedUnit;
        }else if(units1Transform == "Parsec" && units2Transform == "Astronomical Unit") {
            convertedUnit =  parsec * 206264.806;
            return convertedUnit;
        }else if(units1Transform == "Parsec" && units2Transform == "Parsec"){
            convertedUnit = parsec;
            return convertedUnit;
        }else if(units1Transform == "Parsec" && units2Transform == "Light-year"){
            convertedUnit = parsec * 3.26163344;
            return convertedUnit;
        }

        if(units1Transform == "Astronomical Unit" && units2Transform == "Meters"){
            convertedUnit =  astronomicalUnit * 1495978707;
            return convertedUnit;
        }else if(units1Transform == "Astronomical Unit" && units2Transform == "Astronomical Unit") {
            convertedUnit =  astronomicalUnit ;
            return convertedUnit;
        }else if(units1Transform == "Astronomical Unit" && units2Transform == "Parsec"){
            convertedUnit = astronomicalUnit * 4.84813681 * 0.00001;
            return convertedUnit;
        }else if(units1Transform == "Astronomical Unit" && units2Transform == "Light-year"){
            convertedUnit = astronomicalUnit * 1.58128451 * 0.00001;
            return convertedUnit;
        }

        return 0;
    }



}
