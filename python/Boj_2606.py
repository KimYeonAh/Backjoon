num = int(input())
connect = int(input())

graph = [[] for _ in range(num+1)]
graph[0] = [0, 0]

for _ in range(connect) :
    start, end = map(int, input().split())
    graph[start].append(end)
    graph[end].append(start)

def dfs(graph, start) :
    if start not in visited :
        visited.append(start)
        for i in graph[start] :
            if i not in visited :
                dfs(graph, i)

visited = []
dfs(graph, 1)
print(len(visited) - 1)
