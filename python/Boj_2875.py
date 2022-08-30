import math

N, M, K = map(int, input().split())

tmp = 0
if N//2 < M :
  tmp = N//2
else :
  tmp = M

N -= tmp*2
M -= tmp

if (M+N) > K :
  print(tmp)
else :
  K -= (M+N)
  print(tmp - math.ceil(K/3))
