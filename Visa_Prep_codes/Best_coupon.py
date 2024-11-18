def c(x):
    p=x - (x*0.1)
    q=x - 100
    if p>q:
        return q
    else:
        return int(p)
x=int(input().strip())
res=c(x)
print(res)
