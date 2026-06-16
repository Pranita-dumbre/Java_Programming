// Input : 4    #
// Output : #   #   #   #

// Input : 5    &
// Output : &   &   &   &   &

// Input : 3    z
// Output : z   z   z

///////////////////////////////////////////////////////////////////
//
//  File Name :         Code35.java
//  Description :       Accepts a number and a character from the user
//                      and prints the character the specified number
//                      of times in a single line, separated by tabs.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

import java.util.*;
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Pattern
//  Description :       Contains a method to display a given character
//                      multiple times based on user input frequency.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////

class Pattern
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     Display
    //  Description :     Accepts frequency and a character from the user,
    //                    and prints the given character that many times
    //                    in a single line separated by tabs.
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            16/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public void Display(
                            int iNo,
                            char ch 
                        )
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        } 

        System.out.println("Output :");

        for(iCnt = 1; iCnt <= iNo; iCnt++)    
        {
            System.out.print(ch+"\t");
        }
    }
}
/////////////////////////////////////////////////////////////////////
//
//  Class Name :        Code35
//  Description :       Accepts the frequency from the user,
//                      creates an object of Pattern class,
//                      and calls the Display() method.
//  Author :            Pranita Purushottam Dumbre.
//  Date :              16/06/2026
//
/////////////////////////////////////////////////////////////////////
class Code35
{
    //////////////////////////////////////////////////////////////////////
    //
    //  Method Name :     main
    //  Description :     Entry point function. Accepts frequency 
    //                    from user and calls Display function 
    //  Author:           Pranita Purushottam Dumbre.
    //  Date :            16/06/2026
    //
    ////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0;
        char ch = '\0';

        System.out.println("Enter frequency : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter character : ");
        ch = sobj.next().charAt(0);

        Pattern pobj = new Pattern();

        pobj.Display(iValue1,ch);
    }
}