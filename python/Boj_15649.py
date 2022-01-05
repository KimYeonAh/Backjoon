N, M = map(int, input().split())

def all_permutations() :
    for i in range(N) :
        visit = [False] * N
    
    DFS_permutation([], 0, visit)

def DFS_permutation(sol, level, visit) :
    if level == M :
        for i in range(len(sol)) :
            print(sol[i], end=' ')
        print()
        return

    for i in range(N) :
        if not visit[i] :
            sol.append(i+1)
            visit[i] = True
            DFS_permutation(sol, level+1, visit)
            sol.pop()
            visit[i] = False

all_permutations()
