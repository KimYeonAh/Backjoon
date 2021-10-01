N = int(input())

graph = []
visited = [[0]*N for _ in range(N)]

for i in range(N):
    graph.append(list(map(int, input())))

dx = [-1, 1, 0, 0]
dy = [0, 0, 1, -1]

def dfs(x, y) :
    visited[x][y] = 1
    global count

    if graph[x][y] == 1 :
        count += 1

    for i in range(4) :
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < N and 0 <= ny < N :
            if graph[nx][ny] == 1 and visited[nx][ny] == 0 :
                dfs(nx, ny)

count = 0
countList = []

for i in range(N) :
    for j in range(N) :
        if graph[i][j] == 1 and visited[i][j] == 0:
            dfs(i, j)
            countList.append(count)
            count = 0

print(len(countList))

for i in sorted(countList) :
    print(i)
