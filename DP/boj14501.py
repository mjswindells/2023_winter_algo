#14501 퇴사
N=int(input())
profit=[0 for i in range(N+2)]
for i in range(1, N+1):
  T, P=map(int, input().split())
  if i+T>N+1:
    continue
  else:
    for j in range(i+T, N+2):
      if profit[j]<profit[i]+P:
        profit[j]=profit[i]+P
print(profit[N-1])