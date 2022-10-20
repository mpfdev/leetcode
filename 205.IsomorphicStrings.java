class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        char[] sT = new char[256];
        char[] tS = new char[256];
        
        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(sT[sChar] == 0 && tS[tChar] == 0) {
                sT[sChar] = tChar;
                tS[tChar] = sChar;
            } else if (sT[sChar] != tChar) {
                return false;
            }
        }
        
        return true;
    }
}
