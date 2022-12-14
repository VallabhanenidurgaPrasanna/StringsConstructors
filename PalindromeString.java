public class PalindromeString {
        public static void main(String args[]){

            String str="malayalam";
            int first=0;
            int last=str.length()-1;
            int mc=0;
            while(first!=last) {
                 if(str.charAt(first)==str.charAt(last)) {
                     
                    mc++;   // 1
                    first++;
                    last--;
                }
                else {
                    break;
                }
            }
            if(mc==str.length()/2) {
                System.out.println("Palindrome");
            }
            else {
                System.out.println("not a palindrome");
            }
            
            
        }
        }
        