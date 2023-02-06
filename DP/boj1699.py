#1699 제곱수의 합
import math
n=int(input())
num=[1, 2, 3]+[0 for i in range(n-3)]
for i in range(3, n):
  N=i+1; M=int(math.sqrt(N))
  if N==(M**2):
    num[i]=1
  else:
    m=100000
    for j in range(2,M+1):
      tmp=num[N-(j**2)-1]
      if m>tmp:
        m=tmp
    num[i]=m+1
print(num[n-1])