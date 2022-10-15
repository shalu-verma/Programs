public class Operator {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        System.out.println("1. Increment / Decrement Operator");
        System.out.println("PreIncrement: ++" + x + " = " + (++x));
        System.out.println("Post Increment: " + x + "++ = " + (x++));
        System.out.println("Pre Decrement: --" + y + " = " + (--y));
        System.out.println("Post Decrement: " + y + "-- = " + (y--));
        System.out.println();
        
        System.out.println("2. Arithmatic Operator");
        System.out.println("Addition: " + x + " + " + y + " = " + (x + y));
        System.out.println("Substraction: " + x + " - " + y + " = " + (x - y));
        System.out.println("Multiplication: " + x + " * " + y + " = " + (x * y));
        System.out.println("Division: " + x + " / " + y + " = " + (x / y));
        System.out.println("Modulus: " + x + " % " + y + " = " + (x % y));
        System.out.println();
        
        System.out.println("3. Relational Operator");
        System.out.println("Equals: " + x + " == " + y + " = " + (x == y));
        System.out.println("Not Equal: " + x + " != " + y + " = " + (x != y));
        System.out.println("Greater Than: " + x + " > " + y + " = " + (x > y));
        System.out.println("Less than: " + x + " < " + y + " = " + (x < y));
        System.out.println("Greater than Equal to: " + x + " >= " + y + " = " + (x >= y));
        System.out.println("Less than equal to: " + x + " <= " + y + " = " + (x <= y));
        System.out.println();
        
        System.out.println("4. Bitwise Operator");
        System.out.println("AND: " + x + " & " + y + " = " + (x & y));
        System.out.println("OR: " + x + " | " + y + " = " + (x | y));
        System.out.println("XOR: " + x + " ^ " + y + " = " + (x ^ y));
        System.out.println("NOT: ~" + y + " = " + (~y));
        System.out.println("LEFT SHIFT: " + x + " << " + 1 + " = " + (x << 1));
        System.out.println("RIGHT SHIFT: " + x + " >> " + 2 + " = " + (x >> 1));
        System.out.println("zero-fill right shift: " + x + " >>> " + 1 + " = " + (x >>> 1));
        System.out.println();
        
        System.out.println("5. Conditional Operator");
        System.out.println("Logical AND: " + x + " > 1 && " + y + " < 1  returns  " + (x > 1 && y < 1));
        System.out.println("Logical OR: " + x + " > 1 || " + y + " < 1  returns  " + (x > 1 || y < 1));
        System.out.println("Ternary: (" + x + " > 5 ? GreaterThan5 : LessThanEqualTo5) returns "
                + (x > 5 ? "GreaterThan5" : "LessThanEqualTo5"));
        System.out.println();

    }

}
