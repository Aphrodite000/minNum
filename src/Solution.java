import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] a=new int[10];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'0']++;
        }
        //1233221000
        for(int i=1;i<a.length;i++){
            if(a[i]!=0){
                System.out.print(i);
                a[i]--;
                if(a[0]!=0){
                    int j=a[0];
                    while(j>0){
                        System.out.print("0");
                        j--;
                    }
                    a[0]=0;
                    int p=a[i];
                    while(p>0){
                        System.out.print(i);
                        p--;
                    }
                }else{
                    int j=a[i];
                    while(j>0){
                        System.out.print(i);
                        j--;
                    }
                }
            }
        }
    }
}
