// Last updated: 11/08/2026, 14:18:31
class Solution {
    public String reverseVowels(String s) {
        // Convert to char array for easy swapping
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        
        // Helper function to check vowels
        while (left < right) {
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            while (left < right && !isVowel(arr[right])) {
                right--;
            }
            
            // Swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(arr);
    }
    
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
