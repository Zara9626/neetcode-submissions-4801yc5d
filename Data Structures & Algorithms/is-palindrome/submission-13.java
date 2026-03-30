class Solution {
    public boolean isPalindrome(String s) {

    String s1 = s.replaceAll("\\s+", "").replaceAll("[\\p{Punct}]", "").toLowerCase();
        
        System.out.println(s1);

        char [] str = s1.toCharArray();
        //System.out.println(str);

        int left = 0; 
        int right = str.length-1;

        while(left <=right){
            if(str[left]!= str[right]){
                System.out.println(str[left]);
                System.out.println(str[right]);
                return false;
            }else{
                left++;
                right--;
            }
        
        }
        return true;

        
    }
}
