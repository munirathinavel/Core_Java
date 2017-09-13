package fresh;
public class MemorySize {
   public static void main(String[] args) {
      Runtime runtime = Runtime.getRuntime();
      System.out.println("Maximum memory " +runtime.maxMemory());
      System.out.println("Total memory " +runtime.totalMemory());
      System.out.println("Free memory " +runtime.freeMemory());
   }
}