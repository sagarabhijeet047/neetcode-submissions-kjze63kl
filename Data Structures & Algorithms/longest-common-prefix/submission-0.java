class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: empty array
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Edge case: single string
        if (strs.length == 1) {
            return strs[0];
        }
        
        // Use first string as reference
        String firstString = strs[0];
        
        // Iterate through each character position in first string
        for (int charIndex = 0; charIndex < firstString.length(); charIndex++) {
            char currentChar = firstString.charAt(charIndex);
            
            // Compare this character with same position in all other strings
            for (int stringIndex = 1; stringIndex < strs.length; stringIndex++) {
                String currentString = strs[stringIndex];
                
                // Check if we've reached end of current string OR character doesn't match
                if (charIndex >= currentString.length() || 
                    currentString.charAt(charIndex) != currentChar) {
                    
                    // Return prefix found so far (0 to charIndex-1)
                    return firstString.substring(0, charIndex);
                }
            }
        }
        
        // All characters of first string matched with all strings
        return firstString;
    }
}