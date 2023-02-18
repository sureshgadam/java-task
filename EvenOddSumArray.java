class EvenOddSumArray
{
public static void main(String arg[])
{
int arr[]={1,2,3};
int evenSum=0,oddSum=0;
for(int i=0;i<arr.length;i++)
 {
  if(arr[i]%2==0)
   {
    evenSum=evenSum+arr[i];
   }
 else
  {
   oddSum=oddSum+arr[i];
  }
}
System.out.println("Sum of even is:"+evenSum);
System.out.println("Sum of odd is:"+oddSum);
}
}

