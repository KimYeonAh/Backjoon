N, M = map(int, input().split())

def DFS_permutation(sol, level) :
    if level == M :
        for i in range(M) :
            print(sol[i], end=' ')
        print()
    
    for i in range(N) :
        if len(sol) != M :
            sol.append(i+1)
            DFS_permutation(sol, level+1)
            sol.pop()

DFS_permutation([], 0)
