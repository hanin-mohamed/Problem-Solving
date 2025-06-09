package easy;

public class FirstPalindrom {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
           int j=words[i].length()-1;
           int x=0;
           while (x<j){
               if (words[i].charAt(x) != words[i].charAt(j)){
                   break;
               }
               else {
                   x++;
                   j--;
               }
           }
           if (x==j || j==x-1) return words[i];
        }
        return "";
    }
    public  static void main(String args[]){
    FirstPalindrom fp = new FirstPalindrom();
   // fp.firstPalindrome(["cqllrtyhw","swwisru","gpzmbders","wqibjuqvs","pp","usewxryy","ybqfuh","hqwwqftgyu","jggmatpk"]);
    }

}
