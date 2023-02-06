N=int(input())
l=list(map(int, input().split()))
pay=[0 for i in range(N+1)]
for i in range(N):
    money=l[i]
    for j in range((i+1), N+1):
        if j%(i+1)==0:
            if pay[j]<(j//(i+1))*money:
                pay[j]=(j//(i+1))*money
        else:
            if pay[j]<pay[j-(i+1)]+money:
                pay[j]=pay[j-(i+1)]+money
print(pay[N])