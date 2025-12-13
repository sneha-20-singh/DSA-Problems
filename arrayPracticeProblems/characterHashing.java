package arrayPracticeProblems;

import java.util.HashMap;
import java.util.Scanner;

public class characterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String s= sc.nextLine();

        HashMap<Character,Integer> map = new HashMap<>();
            //pre compute
for(int i=0;i<s.length();i++)
{
    char ch = s.charAt(i);
    map.put(ch,map.getOrDefault(ch,0)+1);
}
System.out.println("enter the no of character to be searched");
int query = sc.nextInt();
for(int i=0;i<query;i++)
{
    System.out.print("enter the character to be searched: ");
    char c= sc.next().charAt(0);
    System.out.println("No of times it appears = "+map.getOrDefault(c,0));
}
sc.close();
    }
}
