n=int(input())
N=[]

if n==1:
    row=list(map(int,input().split()))
    print(max(row), min(row))
else:
    row=list(map(int,input().split()))
    maximum=row[:]; minimum=row[:]
    for j in range(1,n):
        row=list(map(int,input().split()))
        xtmp=row[:]
        xtmp[0]+=max(maximum[0],maximum[1])
        xtmp[1]+=max(maximum)
        xtmp[2]+=max(maximum[1], maximum[2])
     
        ntmp=row[:]
        ntmp[0]+=min(minimum[0],minimum[1])
        ntmp[1]+=min(minimum)
        ntmp[2]+=min(minimum[1], minimum[2])

        maximum=xtmp[:]; minimum=ntmp[:]
    print(max(maximum), min(minimum))
