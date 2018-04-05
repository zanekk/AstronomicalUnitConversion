package kenazCode;


import java.math.BigDecimal;

public class ConvertingPart {
    private BigDecimal lightYear, meters, astronomicalUnit, parsec;
    private BigDecimal light, met, astro, pars, convertedUnit;
    private String units1Transform, units2Transform;


    public ConvertingPart(double writedUnit,String units1Transform,String units2Transform){

        this.units2Transform = units2Transform;
        this.units1Transform = units1Transform;

        if(units1Transform.equals("Light-year"))
        {lightYear = new BigDecimal(writedUnit);}
        else if(units1Transform.equals("Meters")){
            meters =  new BigDecimal(writedUnit);
         }else if(units1Transform.equals("Astronomical Unit")){
            astronomicalUnit =  new BigDecimal(writedUnit);
         }else if(units1Transform.equals("Parsec")){
            parsec = new BigDecimal(writedUnit); }
        }


    public BigDecimal conResult(){




        if(units1Transform.equals("Light-year") && units2Transform.equals("Meters")){
            light = new BigDecimal(9.4606E15);
            convertedUnit = light.multiply(lightYear);
            return convertedUnit;
        }else if(units1Transform.equals("Light-year") && units2Transform.equals("Astronomical Unit")) {
            light = new BigDecimal(63240);
            convertedUnit = light.multiply(lightYear);
            return convertedUnit;
        }else if(units1Transform.equals("Light-year") && units2Transform.equals("Parsec")){
            light = new BigDecimal(0.306594845);
            convertedUnit = light.multiply(lightYear);
            return convertedUnit;
        }else if(units1Transform.equals("Light-year") && units2Transform.equals("Light-year")){
            convertedUnit = lightYear;
            return convertedUnit;
        }

        if(units1Transform.equals("Meters") && units2Transform.equals("Meters")){
            convertedUnit = meters;
            return convertedUnit;
        }else if(units1Transform.equals("Meters") && units2Transform.equals("Astronomical Unit")) {
            met = new BigDecimal(6.6845812E-12);
            convertedUnit = met.multiply(meters);
            return convertedUnit;
        }else if(units1Transform.equals("Meters") && units2Transform.equals("Parsec")){
            met = new BigDecimal(3.24077929E-17);
            convertedUnit = met.multiply(meters);
            return convertedUnit;
        }else if(units1Transform.equals("Meters") && units2Transform.equals("Light-year")){
            met = new BigDecimal(1.05702341E-16);
            convertedUnit = met.multiply(meters);
            return convertedUnit;
        }

        if(units1Transform.equals("Parsec") && units2Transform.equals("Meters")){
            pars = new BigDecimal(3.08567758E16);
            convertedUnit =  pars.multiply(parsec);
            return convertedUnit;
        }else if(units1Transform.equals("Parsec") && units2Transform.equals("Astronomical Unit")) {
            pars = new BigDecimal(206264.806);
            convertedUnit =  pars.multiply(parsec);
            return convertedUnit;
        }else if(units1Transform.equals("Parsec") && units2Transform.equals("Parsec")){
            convertedUnit = parsec;
            return convertedUnit;
        }else if(units1Transform.equals("Parsec") && units2Transform.equals("Light-year")){
            pars = new BigDecimal(3.26163344);
            convertedUnit =  pars.multiply(parsec);
            return convertedUnit;
        }

        if(units1Transform.equals("Astronomical Unit") && units2Transform.equals("Meters")){
            astro = new BigDecimal("149597870700");
            convertedUnit =  astro.multiply(astronomicalUnit);
            return convertedUnit;
        }else if(units1Transform.equals("Astronomical Unit") && units2Transform.equals("Astronomical Unit")) {
            convertedUnit =  astronomicalUnit ;
            return convertedUnit;
        }else if(units1Transform.equals("Astronomical Unit") && units2Transform.equals("Parsec")){
            astro = new BigDecimal(4.84813681E-6);
            convertedUnit =  astro.multiply(astronomicalUnit);
            return convertedUnit;
        }else if(units1Transform.equals("Astronomical Unit") && units2Transform.equals("Light-year")){
            astro = new BigDecimal(1.58128451E-5);
            convertedUnit =  astro.multiply(astronomicalUnit);
            return convertedUnit;
        }

        return convertedUnit;
    }



}
