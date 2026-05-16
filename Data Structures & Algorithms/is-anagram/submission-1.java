class Solution {
    public boolean isAnagram(String s, String t) {
      String a = s.toLowerCase();
String b = t.toLowerCase();
int[] count = new int[26];
if(a.length() != b.length()){
    return false;
}
for(int i=0; i<a.length(); i++){
    count[a.charAt(i) - 'a']++;
    count[b.charAt(i)-'a']--;
}

for(int num : count){
    if (num != 0){
        return false;
    }
}

return true;
    }
}
