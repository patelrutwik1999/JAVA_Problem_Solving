class Solution
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String[] ans = new String[S.length()];
        int len = S.length()-1;
        for(String s : S.split("\\.")){
            System.out.println(s);
            ans[len] = s;
            len--;
        }

        String result = "";
        for(int i =S.length()-1;i>=0;i--){
            if(i==S.length()-1){
                result += ans[i];
            }else{
                result += ans[i] + ".";
            }

        }
        return result;
    }
}