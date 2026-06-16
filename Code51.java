//////////////////////////////////////////////////////////////////
//
//  File Name :         Code51.java
//  Description :       Program to display pattern of alphabets where 
//                      odd rows contain lowercase letters and even rows 
//                      contain uppercase letters.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
// Input 4  4   
/*
    a   a   a   a
    B   B   B   B
    c   c   c   c
    D   D   D   D
*/

import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Pattern
//  Description :       Accepts number of rows and columns from user 
//                      and prints alphabets in such a way that odd rows 
//                      display lowercase and even rows display uppercase letter
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Pattern
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Display
    //  Description :     Displays pattern with lowercase alphabets in 
    //                    odd rows and uppercase alphabets in even rows.
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            16/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public void Display(
                            int iRow, 
                            int iCol
                        )
    {
        int i = 0, j = 0;
        char ch1 = '\0', ch2 = '\0';

        for(i = 1, ch1 = 'a', ch2 = 'A'; i <= iRow; i++, ch1++, ch2++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i % 2 == 0)
                {
                    System.out.print(ch2+"\t");
                }
                else
                {
                    System.out.print(ch1+"\t");
                }
            }
            System.out.println();
        }
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code51
//  Description :       Main class to accept input from user and call 
//                      Display method to print alternating case pattern.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code51
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Entry point of program. Takes number of rows 
    //                    and columns as input and prints pattern with 
    //                    alternating lowercase and uppercase alphabets.
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            16/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter number of rows : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1, iValue2);
    }
}