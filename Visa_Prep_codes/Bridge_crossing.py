def bc(x,y,z):
    c=(z - y)// x
    return c
input_val=input().split()
x=int(input_val[0])
y=int(input_val[1])
z=int(input_val[2])
res=bc(x,y,z)
print(res)
