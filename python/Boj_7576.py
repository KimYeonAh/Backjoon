import queue
M, N = map(int, input().split())

graph = []
visited = [[0]*M for _ in range(N)]

for i in range(N):
    graph.append(list(map(int, input().split())))

dx = [-1, 1, 0, 0]
dy = [0, 0, 1, -1]

def bfs() :
    x, y = que.get()
    visited[x][y] = 1
    for i in range(4) :
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < N and 0 <= ny < M :
            if graph[nx][ny] == 0 and visited[nx][ny] == 0:
                que.put([nx, ny])
                graph[nx][ny] = graph[x][y] + 1

    return graph

que = queue.Queue()

for i in range(N) :
    for j in range(M) :
        if graph[i][j] == 1:
            que.put([i, j])

while not que.empty() :
    bfs()

count = 0

for i in range(N) :
    for j in range(M) :
        if graph[i][j] == 0 :
            print(-1)
            quit()
        count = max(count, graph[i][j])

print(count - 1)
