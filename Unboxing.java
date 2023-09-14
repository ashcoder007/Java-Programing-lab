public class Unboxing {
    public static void main(String[] args) {
       
        Integer wrapperInt = Integer.valueOf(42);
        Boolean wrapperBoolean = Boolean.valueOf(true);
        Character wrapperChar = Character.valueOf('A');
        Byte wrapperByte = Byte.valueOf((byte) 127);
        Short wrapperShort = Short.valueOf((short) 1000);
        Long wrapperLong = Long.valueOf(1234567890L);
        Float wrapperFloat = Float.valueOf(3.14f);
        Double wrapperDouble = Double.valueOf(2.71828);

       
        int primitiveInt = wrapperInt;
        boolean primitiveBoolean = wrapperBoolean;
        char primitiveChar = wrapperChar;
        byte primitiveByte = wrapperByte;
        short primitiveShort = wrapperShort;
        long primitiveLong = wrapperLong;
        float primitiveFloat = wrapperFloat;
        double primitiveDouble = wrapperDouble;

       
        System.out.println("Unboxing Results:");
        System.out.println("int: " + primitiveInt);
        System.out.println("boolean: " + primitiveBoolean);
        System.out.println("char: " + primitiveChar);
        System.out.println("byte: " + primitiveByte);
        System.out.println("short: " + primitiveShort);
        System.out.println("long: " + primitiveLong);
        System.out.println("float: " + primitiveFloat);
        System.out.println("double: " + primitiveDouble);
    }
}