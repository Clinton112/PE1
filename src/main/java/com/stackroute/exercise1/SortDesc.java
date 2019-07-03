/*
 Write a program which accepts a number as input from user and perform the following:
 a. sort the number in non-increasing order
 b. after sorting sum all the even numbers, the sum should be greater than 15 .
 c. if sum is more than 15,then print output as true or false.
 Input : 234534
 Output : Sorted number in non-increasing order : 544332

 Sum of even numbers : 10
 False
 */
package com.company;


public class SortDesc
{
    public String sortNumber(int input)//to take input and perform reversesort and check for sum
    {
        String numStr=Integer.toString(input);//initialized numString and value converted from integer
        String output="";//output string value
        char[] arrnum=numStr.toCharArray();//string to character array
        for(int i=0;i<arrnum.length;i++)//outer loop starts here
        {
            for(int j=0;j<arrnum.length;j++)//Sorting is done here
            {
                if(arrnum[i]>arrnum[j])
                {
                    char temp=arrnum[i];
                    arrnum[i]=arrnum[j];
                    arrnum[j]=temp;
                }
            }
        }
        int sum=0;
        for(int i=0;i<arrnum.length;i++){
            if(((int)arrnum[i]-48)%2==0)//48 is deducted because of the ASCII value
            {
                sum=sum+(int)arrnum[i]-48;
            }
            output=output+(arrnum[i]);
        }
        output=output+"\n";
        output=output+("\nSum of Even numbers is "+sum);
        if(sum>15)
            output=output+("\ntrue");
        else
            output=output+("\nfalse");
        return output;
    }

}