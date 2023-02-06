#9655 돌 게임
N=int(input())
find=True
possible=[N]; count=0
while find:
  tmp=set()
  for rock in possible:
    if rock==1 or rock==3:
      if count%2==0:
        print("SK")
      else:
        print("CY")
      find=False
      break
    else:
      if rock==2 or rock==4:
        if 1 not in tmp:
          tmp.add(1)
      else:
        tmp.add(rock-1)
        tmp.add(rock-3)
  possible=list(tmp); count+=1