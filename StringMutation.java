public class StringMutation1
{
  public static void main (String[]args)
  {
    String phrase = "Love is the force of the world";
    String mutation1, mutation2, mutation3, mutation4;
    
    System.out.println("Original string: \"" + phrase + "\"");
    System.out.println("Length of the string: " + phrase.length());
    
    mutation1 = phrase.concat(", the world is lost without love");
    mutation2 = mutation1.toUpperCase();
    mutation3 = mutation2.replace('E', 'X');
    mutation4 = mutation3.substring(3, 30);
    
    System.out.println("Mutation 1: " + mutation1);
    System.out.println("Mutation 2: " + mutation2);
    System.out.println("Mutation 3: " + muattion3);
    System.out.println("Mutation 4: " + mutation4);
    
    System.out.println("Mutated string length: " + mutation4.length());
  }
}
