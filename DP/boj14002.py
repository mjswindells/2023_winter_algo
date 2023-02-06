#14002 가장 긴 증가하는 부분 수열
N=int(input())
A=list(map(int, input().split()))
ans=[]
for i in range(N):
  a=A[i]
  if len(ans)==0:
    ans.append([a])
  else:
    isfind=False; tmp=[]
    for j in range(len(ans)):
      if a>=ans[j][-1]:
        if len(ans[j])>len(tmp):
          tmp=ans[j]
        isfind=True
    if isfind==False:
      ans.append([a])
    else:
      ans.append(tmp+[a])
  print(ans)
m=0; p=[]
for i in range(len(ans)):
    tmp=ans[i]
    if m<len(tmp):
        m=len(tmp)
        p=tmp[:]
print(m)
for i in range(m):
    print(p[i], end=" ")