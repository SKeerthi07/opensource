def p(x,y):
    if x>=y:
        return "YES"
    else:
        return "NO"
input_val=input().split()
x=int(input_val[0])
y=int(input_val[1])
result=p(x,y)
print(result)
