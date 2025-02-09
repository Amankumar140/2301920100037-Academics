class Solution {
  public:
    // Function to find the first non-repeating character in a string.
    char nonRepeatingChar(string &s) {
         int n=s.size();
         vector<int> v(26,0);
         for(int i=0; i<n; i++){
             v[s[i]-'a']++;
         }
        for(int i=0; i<n; i++){
            if(v[s[i]-'a']==1) return s[i];
        }
          return '$';
    }
};
