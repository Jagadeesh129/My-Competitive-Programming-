        // Create a StringBuilder object
        // using StringBuilder() constructor
StringBuilder str = new StringBuilder();
 str.append("GFG"); 
 System.out.println("String = " + str.toString());    //String = GFG
StringBuilder str1= new StringBuilder("AAAABBBCCCC");
System.out.println("String1 = " + str1.toString()); // String1 = AAAABBBCCCC
StringBuilder str2 = new StringBuilder(10);
System.out.println("String2 capacity = "+ str2.capacity());     //String2 capacity = 10


// remove the substring from index 2 to 8      means it removes 2,3,4,5,6,7 indices only
str.delete(2, 8);
//get substring start from index 5 to index 8
str.substring(5, 8);
 
  // get substring start from index 5
  str.substring(5);

str.reverse();




