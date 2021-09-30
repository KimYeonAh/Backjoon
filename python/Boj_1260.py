import queue

N, M, V = map(int, input().split())

graph = [[] for _ in range(N+1)]
graph[0] = [0,0]

for _ in range(M):
    start, end = map(int, input().split())
    graph[start].append(end)
    graph[end].append(start)
    graph[start].sort()
    graph[end].sort()

def dfs(graph, start, visited):
    if start not in visited :
        visited.add(start)
        print(start, end=' ')

        for i in graph[start] :
            if i not in visited :            
                dfs(graph, i, visited)

def bfs(graph, start, visited):
    visited.add(start)
    que = queue.Queue()
    que.put(start)

    while not que.empty() :
        out = que.get()
        print(out, end = ' ')

        for i in graph[out] :
            if i not in visited :
                visited.add(i)
                que.put(i)

dfs(graph, V, set())
print()
bfs(graph, V, set())
