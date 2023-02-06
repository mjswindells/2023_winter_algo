N=int(input())
ans=[1, 1, 1]#왼쪽에 배치, 오른쪽에 배치, 배치X
for i in range(N):
  left=ans[1]+ans[2]
  right=ans[0]+ans[2]
  no=ans[0]+ans[1]+ans[2]
  ans=[left, right, no]
print(ans[2]%9901)