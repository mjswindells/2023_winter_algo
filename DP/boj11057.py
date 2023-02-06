n=int(input())
l=[1 for i in range(10)]
if n==1:
  print(10)
else:
  for i in range(n-1):
    for j in range(9, 0, -1):
      l[j-1]+=l[j]
  print(l)
  sum=0
  for i in range(10):
    sum+=l[i]
  print(sum%10007)