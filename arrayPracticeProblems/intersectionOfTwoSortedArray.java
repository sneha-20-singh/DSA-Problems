package arrayPracticeProblems;

public class intersectionOfTwoSortedArray {
    static void intersection(int[] a,int[] b)
    {
int i=0,j=0;
while(i<a.length && j<b.length)
{
    if(a[i]==b[j])
    {
        System.out.print(a[i]+" ");
        i++;
        j++;
    }
    else if (a[i]<b[j]) {
        i++;
    }
    else{
j++;
    }
}
    }
    public static void main(String[] args) {
        int[] a = {1,2,2,3,4,5,5};
        int[] b = {2,2,3,3,5,5,6};
        intersection(a, b);
    }
}
