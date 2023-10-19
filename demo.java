public class demo{
    public static void main (String a[]){
      //1. Creating Strings:
      //You can create a `String` object using a string literal or the `new` keyword:
      String str1 = "Hello"; // Using a string literal
      String str2 = new String("World"); // Using the new keyword
      System.out.println("1. Creating Strings:")
      System.out.println(str1);
      System.out.println(str2);


      // 2. Concatenation:
      // You can concatenate strings using the `+` operator or the `concat()` method:
      String str3 = str1 + ", " + str2; // Using the + operator
      String str4 = str1.concat(", ").concat(str2); // Using the concat() method

      // 3. String Length:
      // You can find the length of a string using the `length()` method:
      int length = str3.length();

    }
}
