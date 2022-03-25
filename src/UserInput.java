import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {
  static int getInteger() {
    InputStreamReader eisodosString = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(eisodosString);
    try {
      String line = br.readLine();
      int i = Integer.parseInt(line);
      return i;
    } catch (Exception e) {
      return -1;
    } 
  }
  
  static float getFloat() {
    InputStreamReader eisodosString = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(eisodosString);
    try {
      String line = br.readLine();
      float i = Float.parseFloat(line);
      return i;
    } catch (Exception e) {
      return -1.0F;
    } 
  }
  
  static double getDouble() {
    InputStreamReader eisodosString = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(eisodosString);
    try {
      String line = br.readLine();
      double i = Double.parseDouble(line);
      return i;
    } catch (Exception e) {
      return -1.0D;
    } 
  }
  
  static short getShort() {
    InputStreamReader eisodosString = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(eisodosString);
    try {
      String line = br.readLine();
      short i = Short.parseShort(line);
      return i;
    } catch (Exception e) {
      return -1;
    } 
  }
  
  static long getLong() {
    InputStreamReader eisodosString = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(eisodosString);
    try {
      String line = br.readLine();
      long i = Long.parseLong(line);
      return i;
    } catch (Exception e) {
      return -1L;
    } 
  }
  
  static byte getByte() {
    InputStreamReader eisodosString = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(eisodosString);
    try {
      String line = br.readLine();
      byte i = Byte.parseByte(line);
      return i;
    } catch (Exception e) {
      return -1;
    } 
  }
  
  public static char getChar() {
    InputStreamReader eisodosString = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(eisodosString);
    try {
      char c = (char)br.read();
      return c;
    } catch (Exception e) {
      return 'L';
    } 
  }
  
  public static String getString() {
    InputStreamReader eisodosString = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(eisodosString);
    try {
      String line = br.readLine();
      return line;
    } catch (Exception e) {
      return "Lathos";
    } 
  }
}
