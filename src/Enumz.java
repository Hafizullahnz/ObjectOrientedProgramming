public class Enumz {
    public static void main(String[] args) {

        System.out.println("==================normal way");
        String chosenUnitString="FOOT";
        double convMeterVal=1.0;
        double convCentiMeterVal=0.01;
        double convInchVal=0.025;
        double convFootVal=0.3;


        switch(chosenUnitString) {
            case "FOOT":
                System.out.println("Foot unit is selected.... use " + convFootVal);
                break;
            case "METER":
                System.out.println("Meter unit is selected.... use " + convMeterVal);
                break;
            case "INCH":
                System.out.println("Inch unit is selected.... use " + convInchVal);
                break;
            case "CENTIMETER":
                System.out.println("Centimeter unit is selected.... use " + convCentiMeterVal);
                break;
        }
        System.out.println("\n================== Enum way");
        LengthUnit chosenUnit = LengthUnit.valueOf("INCH");
        System.out.println(chosenUnit.convertToMeters());

        System.out.println("\n================== Iteration");
        for(LengthUnit tempVar: LengthUnit.values()){
            System.out.println(tempVar + ": " + tempVar.convertToMeters());
        }

        System.out.println("\n================== for complex eg.");
        Cryptzz cryptEnum = Cryptzz.Iron;
        String tobeUsed = cryptEnum.getMyCrypt();
        System.out.println(cryptEnum + ": " + cryptEnum.getMyCrypt());

        System.out.println("\n================== MY_ENUM_FRUITES");
        for(fruits vl : fruits.values()){

            System.out.println(vl + ": " + vl.getfruits());

        }





    }


}

enum LengthUnit {
    METER(1),
    CENTIMETER(0.01),
    FOOT(0.3),
    INCH(0.025);

    double value;
    LengthUnit(double value) {
        this.value = value;
    }

    double convertToMeters() {
        return value;
    }
}

enum Cryptzz {
    Iron("tVxyMEb87CW0ktVxjkdsf"),
    Ozzy("K6s28$vhCAqw4hkjuU$Qxx"),
    Pearl("vhCvfr55Aqw4xynnMEb8o157CW"),
    Audio("cxvWwyoooSkcnzuXgI7R41");

    String value;
    Cryptzz(String value) {
        this.value = value;
    }

    String getMyCrypt() {
        return value;
    }





}

enum fruits { // enums should be decleared outside the class like a outer class
    banana( "this is banana" ),
    apple( "this is apple" ),
    orange( "this is an orange" );

    String value;


    fruits(String value) {
        this.value = value;
    }

    String getfruits() {
        return value;
    }
}