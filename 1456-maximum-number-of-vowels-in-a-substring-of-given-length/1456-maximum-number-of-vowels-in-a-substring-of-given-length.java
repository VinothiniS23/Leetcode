class Solution {
    public int maxVowels(String s, int k) {
        
		int c=0;
		int max=0;
		int ws=0;
		for(int we=0;we<s.length();we++) {
			if(s.charAt(we)=='a'||s.charAt(we)=='e'||s.charAt(we)=='i'||s.charAt(we)=='o'||s.charAt(we)=='u') {
				c++;
			}
			if(we - ws + 1 == k) {
				max=Math.max(max, c);
				if(s.charAt(ws)=='a'||s.charAt(ws)=='e'||s.charAt(ws)=='i'||s.charAt(ws)=='o'||s.charAt(ws)=='u') {
					c--;
				}
				
				
			
			ws++;
		}
    
}
return max;
}
}