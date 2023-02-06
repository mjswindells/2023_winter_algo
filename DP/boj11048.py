#11048 이동하기
N, M = map(int, input().split())
maze=[]
for i in range(N):
  row=list(map(int,input().split()))
  maze.append(row)
for i in range(N):
  for j in range(M):
    if i==0:
      if j==0:
        continue
      else:
        maze[i][j]+=maze[i][j-1]
    else:
      if j==0:
        maze[i][j]+=maze[i-1][j]
      else:
        a=maze[i-1][j]; b=maze[i][j-1]; c=maze[i-1][j-1]
        maze[i][j]+=max(a, b, c)
print(maze[N-1][M-1])