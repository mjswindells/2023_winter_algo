N=int(input())
L=list(map(int, input().split()))
ans=[]
for i in range(N):
    item=L[i]
    if len(ans)==0:
        ans.append([item, item])
    else:
        m=0; isfind=False
        for p in ans:
            if item>p[1]:
                if m<p[0]:
                    m=p[0]; isfind=True
        if isfind==True:
            ans.append([m+item, item])
        else:
            ans.append([item, item])
ans.sort(key=lambda x:-x[0]) 
print(ans[0][0])