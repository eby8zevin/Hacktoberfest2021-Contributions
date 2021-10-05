n = int(input('Enter How Many Number Of Fibonacci Series Do You Want :'))
fib = lambda x: x if x < 2 else fib(x-1) + fib(x-2) 
#how to execute function
print(list(map(fib,range(1,n+1))))


