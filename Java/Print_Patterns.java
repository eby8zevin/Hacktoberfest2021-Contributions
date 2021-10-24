package com.Archana;
//Pattern Printing Rules for any Pattern Problem
//STEP:- 1 :--> No of lines =no of rows = no of times the outer for loop will run
//STEP:- 2 :-->Identity for every row number how many columns are there
//STEP:- 3 :-->what to print(like *,1,2,3 or anything 2 b printed as per the qn given)
//PREREQUISITES FOR PATTERN PRINTING:- Loops



public class Print_Patterns {
    public static void main(String[] args) {

    pattern1(5);
    pattern2(5);
    pattern3(5);
    pattern4(5);
    pattern5(5);
    pattern6(5);
    pattern7(5);
    pattern8(5);
    pattern9(4);
    pattern10(4);
    }

    /**
1)
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *



     */

    static void pattern1(int n){
        for(int row=1;row<=n;row++){//step 1:-->outer for loop no of rows
            for(int col=1;col<=row;col++){//step 2:how many cols are there for the given no of rows
                System.out.print("*"+" ");
            }
            //when each row has printed to go to the next row we nedd to print a newline
            System.out.println();
        }
    }

    /**
     * 2)
     *
     * ^ ^ ^ ^ ^
     * ^ ^ ^ ^ ^
     * ^ ^ ^ ^ ^
     * ^ ^ ^ ^ ^
     * ^ ^ ^ ^ ^
     *
     */

    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print('^'+" ");
            }
            System.out.println();
        }
    }

    /**
     * 3)
     *  ! ! ! ! !
     *  ! ! ! !
     *  ! ! !
     *  ! !
     *  !
     * */

    static void pattern3(int n){
        for(int i=0;i<n;i++){

            for(int j=n-i;j>0;j--){
                System.out.print("!"+" ");
            }


            System.out.println();
        }
        /**
         *
         * Kunal's code
         * for(int i=1;i<=n;i++){
         * for(int j=1;j<n-i+1;j++){
         *     sout("*");
         * }
         * sout();
         * }
         */
    }

    /**
     * 4)
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     */

static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
}

    /**
     * 5)
     *
     * row:-         col:-
     * 0-> ()        col:1
     * 1-> () ()      col:2
     * 2-> () () ()    col:3
     * 3-> () () () ()  col:4
     * 4-> () () () () ()  col:5  -->max row length-->input-->n(user input)
     * 5-> () () () ()  col:4  -->if no of rows -->outer for loop running no of times > n(that is if n rows are printed with  max no of cols that is the user input
     * 6-> () () ()    col:3   -->then we use the conditional operater to check for the condition after each outer for loop
     * 7-> () ()      col:2   -->when no of times outer for loop is printed exceeds the user input(n) then the no of cols is curated acc to the formula calculated to printed the character '(' (no of cols for which the chara tre have to b prined is calculated)
     * 8-> ()        col:1   -->
     */

static void pattern5(int n){
    //here we consider max no of col as n(user input)
    //so we calculate the no of rows from cols as
    //no of rows (the outer for loop should run for)->(2*n)-1 times
    //where n is user input as here we have to run the outer loop for 9 times hence condition is <2n-<<2*5
    for(int row=0;row<((2*n));row++){
        /**
         *   here after no of rows exceeds n(user input)
         *   the no of rows next to the row where the pattern is printed max no of times (i.e the user input)
         *   has no of rows->6 no of cols to b printed->3 , the row nxt to this has 3 cols to b printed when no of rows is 7 no of cols 2 b printed ->2
         *   so we go formulate a formula as
         *   n(user input)-((row-n)+1)==>since we have to cut down certain no of rows after the max no of cols printed (n no of cols printde in a row)
         *   n-row+n-1 ==>2n-row-1(when col is initialized to 1)
         *   or ==>2n-row(when col is initialized to 0)
         *   5 -((7-5)+1)=>5-(2+1)=>5-3=>2(hence when thw no of rows is 7 ->2 '(' will be printed ) as so on for all the other rows also
         *
         *
         *   note: here we have initialized the col as '0' hence we use the formula 2n-row
         *
         */
        int col=row>n?(2*n)-row:row;
        for(int c=0;c<col;c++){
            System.out.print("()"+" ");
        }
        System.out.println();
    }

}

/**
 * 6) The formula for calculating the no of cols is same as above -->2n-row(n-(row-n))
 *    Pattern:-  no of cols:-    no of spaces:-
 *
 *     $         1                 5-1=4
 *    $ $        2                 5-2=3
 *   $ $ $       3                 5-3=2
 *  $ $ $ $      4                 5-4=1
 * $ $ $ $ $     5                 5-5=0
 *  $ $ $ $      4                 5-4=1
 *   $ $ $       3                 5-3=2
 *    $ $        2                 5-2=3
 *     $         1                 5-4=1
 *
 *
 */

static void pattern6(int n){
    for(int i=0;i<2*n;i++){//1st step no of rows (no of times outer loop should run)
        int col=i>n?(2*n)-i:i;
        int no_of_spaces=n-col;
        for(int j=0;j<no_of_spaces;j++) {
            System.out.print(" ");
        }
        for(int k=0;k<col;k++) {

            System.out.print("$" + " ");
        }
        System.out.println();


    }
}
/**
 * 7)
 * here the pattern clearly shows that we have 2 sets of patterns to be printed sequentially
 * that is 1st we will print the pattern from no of rows till 1 (after leaving no of spaces)
 * then we will print the pattern from 2 till the end of the specific row (no of cols)
 * we do this since we hve considered 1 as a center point and have decreased no of rows till 1 and then uncrease from 2 toll no of rows
 *
 *  here the no of spaces to b k3ft is same as above that is
 *  no of spaces=n(user input)-no of rows
 *        1
 *      2 1 2
 *    3 2 1 2 3
 *  4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5
 */

static void pattern7(int n){
    for(int row=1;row<=n;row++){//step:1 no of the outer for loop
        //int col=(2*row)-1;//relationship btw  no of rows and cols
        int no_of_spaces=n-row;

        for(int j=0;j<=no_of_spaces;j++){
            System.out.print("  ");
        }
        for(int col=row;col>=1;col--){
            System.out.print(col+" ");
        }
        for(int col1=2;col1<=row;col1++){
            System.out.print(col1+" ");
        }
        System.out.println();
    }
}

    /**
     * 8)
     * Here thw no of rows to be printed is takec as 2*n-1(so <2*n)
     * then the length of col is catogorized acc to the no of rows finished printing since rows are increasing till 2*n-1
     * when no of rows printed exceeds the user input(n) then a special formula of 2*n-row is applid to limit the second half of the col from 2
     * & to start the first half anf go till 1
     * no of spaces is also calculated as (n-row) if-> n>row or (row-n) if-> row>n
     *           1
     *         2 1 2
     *       3 2 1 2 3
     *     4 3 2 1 2 3 4
     *   5 4 3 2 1 2 3 4 5
     *     4 3 2 1 2 3 4
     *       3 2 1 2 3
     *         2 1 2
     *           1
     *
     */
    static void pattern8(int n){
    for(int row=0;row<2*n;row++){
        int col=row>n?(2*n)-row:row;
        //instead of specifying the no of spaces separeately we can also
        //say as ->
        // (n-c) where is max no of cols(user input)-the no od col to be printed which is nicely calculated using the above formula


        int no_0f_spaces = row>n?row-n:n-row;
        for(int j=0;j<no_0f_spaces;j++){
            System.out.print("  ");
        }
        for(int k=col;k>=1;k--){
            System.out.print(k+" ");
        }
        for(int h=2;h<=col;h++){
            System.out.print(h+" ");
        }
        System.out.println();

    }
        /**
         *    Kunal's code
         */

}
//static void patt(int n){
//        for(int row=1;row<=n;row++){
//            for(int space=0;space<n-row;space++){
//                System.out.print(" ");
//            }
//            for(int col=row;col>=1;col--){
//                System.out.print(col);
//            }
//            for(int col=2;col<=row;col++){
//                System.out.print(col);
//            }
//            System.out.println();
//        }
//}

    /**
     * 9) intro pattern to print a pattern said below this pattern
     *
     *    0 0 0 0 0 0 0 0 0
     *    0 1 1 1 1 1 1 1 0
     *    0 1 2 2 2 2 2 1 0
     *    0 1 2 3 3 3 2 1 0
     *    0 1 2 3 4 3 2 1 0
     *    0 1 2 3 3 3 2 1 0
     *    0 1 2 2 2 2 2 1 0
     *    0 1 1 1 1 1 1 1 0
     *    0 0 0 0 0 0 0 0 0
     *     This works on a principkle of finding the minnimum distance of the element in an index from all the 4 sides
     *     the minimum distance from all the 4 sides is printed as the elemnt in that particular index
     */
 static void pattern9(int n) {

    for(int row=0;row<=(2*n);row++){
      for(int col=0;col<=(2*n);col++){
          int at_Every_index= Math.min(Math.min(row,col),Math.min((2*n)-row,(2*n)-col));
          System.out.print(at_Every_index+" ");
      }
        System.out.println();
}
 }

    /**
     * 10)
     * This si juz done by taking the above pattern9 method pattern as reference here we have juz done i extra step in pattern9
     * that is we have juz subratacted the min distance from all the sides from the user input(n)
     * so that we arrive at our favourable solution for this problem
     *
     *  4 4 4 4 4 4 4 4 4
     *  4 3 3 3 3 3 3 3 4
     *  4 3 2 2 2 2 2 3 4
     *  4 3 2 1 1 1 2 3 4
     *  4 3 2 1 0 1 2 3 4
     *  4 3 2 1 1 1 2 3 4
     *  4 3 2 2 2 2 2 3 4
     *  4 3 3 3 3 3 3 3 4
     *  4 4 4 4 4 4 4 4 4
     *
     */
 static void pattern10(int n){
     for(int row=0;row<=2*n;row++){
         for(int col=0;col<=2*n;col++){
             int element_at_every_index=Math.min(Math.min(row,col),Math.min((2*n)-row,(2*n)-col));

             System.out.print(n-element_at_every_index+" ");
         }
         System.out.println();
     }
 }

}
