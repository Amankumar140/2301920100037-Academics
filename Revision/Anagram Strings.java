  static int areAnagram(String S1, String S2) {
         
          if (S1.length() != S2.length())
            {return 0;}
        char[] sArray = S1.toCharArray();
        char[] tArray = S2.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray)? 1: 0;
        
    }
