#include <cstdlib>
#include <iostream>

using namespace std;

/*Main Recursive Function for moving disks onto different pegs
Takes the number of disks and each of the three pegs
as arguments.
Has no return type as all printing occurs from within function.
*/
void move_disks(size_t disks, char a, char b, char c);

/*Main Program*/
int main(void)
{
    // three pegs are labeled a,b, and c
    char a = 'a', b = 'b', c = 'c';
    // initialize a number of disks for entry
    size_t number_disks = 0;
    // prompt disk entry
    cout << "Enter number of disks: " << flush;
    // receive disk entry
    cin >> number_disks;

    cout << "Moving disks...\n"
         << endl;

    // call function to make the moves
    move_disks(number_disks, a, c, b);

    return EXIT_SUCCESS;
}

/*Main Recursive Function for moving disks onto different pegs
Takes the number of disks and each of the three pegs
as arguments.
The key to this function is the order in which the pegs are
passed into the recursive call.  Notice that b and c are switched
on the first recursive call and that a and c are switched on the
second recursive call.
Two recursive calls for when unrecursing it will still continue
calling to finish moves with each disk.
Decrements number of disks on the way through to move smaller
disks and when unrecursing, larger disks are moved.
For three disks output is:
Moving disk 1 from peg a to peg c.
Moving disk 2 from peg a to peg b.
Moving disk 1 from peg c to peg b.
Moving disk 3 from peg a to peg c.
Moving disk 1 from peg b to peg a.
Moving disk 2 from peg b to peg c.
Moving disk 1 from peg a to peg c.
There are 2^n -1 moves necessary if n is the number of disks.
Has no return type as all printing occurs from within function.
*/

void move_disks(size_t disks, char a, char b, char c)
{
    // base case
    if (disks == 0)
    {
        return;
    }
    else
    {
        /*decrements number of disks and continues calling until
        the number of disks reaches zero then the first message
        is printed*/
        move_disks(disks - 1, a, c, b);
        // moving message
        cout << "Moving disk " << disks << " from peg " << a
             << " to peg " << b << "." << endl;
        /*second recursive call*/
        move_disks(disks - 1, c, b, a);
    }
}