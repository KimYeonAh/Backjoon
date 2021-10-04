import sys
sys.setrecursionlimit(10000)

T = int(input())
countList = []

def dfs(x, y) :
    visited[x][y] = 1
    global count

    for i in range(4) :
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < N and 0 <= ny < M :
            if graph[nx][ny] == 1 and visited[nx][ny] == 0:
                dfs(nx, ny)

for _ in range(T) :
    M, N, K = map(int, input().split())
    visited = [[0]*M for _ in range(N)]
    graph = [[0]*M for _ in range(N)]

    dx = [-1, 1, 0, 0]
    dy = [0, 0, 1, -1]

    count = 0

    for _ in range(K) :
        y, x = map(int, input().split())
        graph[x][y] = 1

    if K == 1 :
        countList.append(1)
        continue

    for i in range(N) :
        for j in range(M) :
            if graph[i][j] == 1 and visited[i][j] == 0 :
                dfs(i, j)
                count += 1
        
    countList.append(count)

for i in countList :
    print(i)
