package org.konneyj;

public class DataTypes {
    public static void main(String[] args) {
        // byte
        byte minByte = -128;
        byte bt = 0;
        byte maxByte = 127;
        byte sizeByte = 8;
        System.out.println("Минимальное значение byte: " + minByte);
        System.out.println("Значение byte: " + bt);
        System.out.println("Максимальное значение byte: " + maxByte);
        System.out.println("Размер в битах: " + sizeByte);
        System.out.println();

        // short
        short minShort = -32768;
        short shrt = 0;
        short maxShort = 32767;
        short sizeShort = 16;
        System.out.println("Минимальное значение short: " + minShort);
        System.out.println("Значение short: " + shrt);
        System.out.println("Максимальное значение short: " + maxShort);
        System.out.println("Размер в битах: " + sizeShort);
        System.out.println();

        // int
        int minInteger = -2147483648;
        int intgr = 0;
        int maxInteger = 2147483647;
        int sizeInt = 32;
        System.out.println("Минимальное значение int: " + minInteger);
        System.out.println("Значение int: " + intgr);
        System.out.println("Максимальное значение int: " + maxInteger);
        System.out.println("Размер в битах: " + sizeInt);
        System.out.println();

        // long
        long minLong = -9223372036854775808L;
        long lng = 0;
        long maxLong = 9223372036854775807L;
        long sizeLong = 64;
        System.out.println("Минимальное значение long: " + minLong);
        System.out.println("Значение long: " + lng);
        System.out.println("Максимальное значение long: " + maxLong);
        System.out.println("Размер в битах: " + sizeLong);
        System.out.println();

        // float
        float minFloat = 1.4E-45F;
        float flt = 0;
        float maxFloat = 3.4E38F;
        byte sizeFloat = 32;
        System.out.println("Минимальное значение float: " + minFloat);
        System.out.println("Значение float: " + flt);
        System.out.println("Максимальное значение float: " + maxFloat);
        System.out.println("Размер в битах: " + sizeFloat);
        System.out.println();

        // double
        double minDouble = 4.9E-324;
        double dbl = 0;
        double maxDouble = 1.7976931348623157E308;
        byte sizeDouble = 64;
        System.out.println("Минимальное значение double: " + minFloat);
        System.out.println("Значение double: " + flt);
        System.out.println("Максимальное значение double: " + maxFloat);
        System.out.println("Размер в битах: " + sizeFloat);
        System.out.println();

        // char
        char minChar1 = '\u0000';
        char minChar2 = 0;
        char chr = 26;
        char maxChar1 = '\uffff';
        char maxChar2 = 65535;
        byte sizeChar = 16;
        System.out.println("Минимальное значение char: " + (int) minChar1 + " или " + (int) minChar2);
        System.out.println("Значение char: " + (int) chr);
        System.out.println("Максимальное значение char: " + (int) maxChar1 + " или " + (int) maxChar2);
        System.out.println("Размер в битах: " + sizeChar);
        System.out.println();

        // boolean
        boolean trueExmp = true;
        boolean flaseExmp = false;
        byte sizeBoolean = 1;
        System.out.println("Значение true: " + trueExmp);
        System.out.println("Значение false: " + flaseExmp);
        System.out.println("Размер в битах: " + sizeBoolean);
        System.out.println();

        // String
        String string = "Строка";
        System.out.println(string);
    }
}