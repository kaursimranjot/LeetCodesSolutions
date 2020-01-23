/*Given a 32-bit signed integer, reverse digits of an integer.

        Example 1:

        Input: 123
        Output: 321
        Example 2:

        Input: -123
        Output: -321
        Example 3:

        Input: 120
        Output: 21
        Note:
        Assume we are dealing with an environment which could only store integers within the 32-bit signed
        integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0
        when the reversed integer overflows.*/
public class ReverseInteger {
    public int reverse(int x) {
        long rev=0;
        Boolean flag=false;
        if(x<0){
            flag=true;
            x=-x;
        }
        while(x>0){
            int temp=x%10;
            rev=rev*10+temp;
            x=x/10;
        }
        long intlimit=2147483647;
        if(rev>intlimit)
            return 0;
        else{
            if(flag==true)
                rev=-rev;
            return (int)rev;
        }
    }
}
