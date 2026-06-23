class Solution {
    public boolean isPalindrome(String s) {
       String s1 = s.replaceAll("\\s+", "").replaceAll("[\\p{Punct}]", "").toLowerCase();
        
        char [] str = s1.toCharArray();

        int left = 0; 
        int right = str.length-1;

        while(left <=right){
            if(str[left]!= str[right]){
                return false;
            }else{
                left++;
                right--;
            }
        
        }
        return true;

    }
}
