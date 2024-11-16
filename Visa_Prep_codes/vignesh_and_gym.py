def g(x,y,z):
    if z<x:
        return 0
    elif z>=x+y:
        return 2
    else:
        return 1
input_val=input().split()
x=int(input_val[0])
y=int(input_val[1])
z=int(input_val[2])
result=g(x,y,z)
print(result)
