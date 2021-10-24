


public class Patterns_10_in_Java{
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
     * row:-
     * 0-> ()
     * 1-> () ()
     * 2-> () () ()
     * 3-> () () () ()
     * 4-> () () () () ()
     * 5-> () () () ()
     * 6-> () () ()
     * 7-> () ()
     * 8-> ()
     */

    static void pattern5(int n){

        for(int row=0;row<((2*n));row++){

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
     * Here the no of rows to be printed is taken as 2*n-1(so <2*n)
     *
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

    }


    /**
     * 9)
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
     *     This works on a principle of finding the minimum distance of the element in an index from all the 4 sides
     *     the minimum distance from all the 4 sides is printed as the element in that particular index
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
     *
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
