def RecursiveBinarySearch (subject, length, r, x):
    if r >= length: 
        mid = int(length + (r - length)/2)
        if subject[mid] == x: 
            return mid 
        elif subject[mid] > x: 
            return RecursiveBinarySearch(subject, l, mid-length, x) 
        else: 
            return RecursiveBinarySearch(subject, mid+length, r, x) 
    else: 
        return -1
    
mylist = [1,2,3,4,5,6,7,8,9,10]
x= int(input(" What integer would you like to search for:")) 
result = RecursiveBinarySearch(mylist,0,len(mylist)-1,x)

if result != -1:
    print("The item is in the list")

else:
    print("Item not in the list.")


        
