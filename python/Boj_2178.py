from collections import deque

N, M = map(int, input().split())

graph = []
visited = [[0]*M for _ in range(N)]

for i in range(N):
    graph.append(list(map(int, input())))

dx = [-1, 1, 0, 0]
dy = [0, 0, 1, -1]

queue = deque()
queue.append([0, 0])

def bfs() :
    x, y = queue.popleft()
    visited[x][y] = 1
    
    for i in range(4) :
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < N and 0 <= ny < M :
            if graph[nx][ny] == 1 and visited[nx][ny] == 0 :
                queue.append([nx, ny])
                graph[nx][ny] = graph[x][y] + 1

    return graph
                    
while queue :
    bfs()

print(graph[N-1][M-1])
