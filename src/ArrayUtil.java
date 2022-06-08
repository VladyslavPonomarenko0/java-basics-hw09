import java.util.*;
import java.util.HashSet;

public class ArrayUtil {

  public static String[] findCommon(String[] array1, String[] array2) {
    Set<String> set = new HashSet<>();
    for (String s : array1) {
      for (String value : array2) {
        if (s.equals(value)) {
          set.add(s);
        }
      }
    }
    return set.toArray(new String[0]);
  }

}

