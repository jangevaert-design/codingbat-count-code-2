public class CountCode2 {
  public int countCode(String str) {
    int count = 0;

    for (int i = 0; i < str.length() - 3; i++)
      if (str.startsWith("co", i) && str.charAt(i + 3) == 'e') {
        count++;
      }
    return count;
  }
}
