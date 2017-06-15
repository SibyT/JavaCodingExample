package org.java.str;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
  public String solution(String S) {
    if (S == null || S.isEmpty()) {
      return S;
    }
    String clean = S.replaceAll("[\\s]+", " ");
    String[] words = clean.split(" ");
    return Arrays.stream(words).map(word -> reverse(word)).collect(Collectors.joining(" "));
  }

  private String reverse(String input) {
    StringBuilder sb = new StringBuilder(input);
    return sb.reverse().toString();
  }
}