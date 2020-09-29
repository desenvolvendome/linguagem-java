def re_fact(n):  
   if n == 1:  
       return n  
   else:  
       return n*re_fact(n-1)   
num = int(input("Enter a number: "))   
if num < 0:  
   print("Sorry, factorial does not exist for negative numbers")  
elif num == 0:  
   print("Factorial of 0 is 1")  
else:  
   print("Factorial of",num,"is",re_fact(num))  
