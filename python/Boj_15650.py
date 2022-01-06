N, M = map(int, input().split())

def all_permutations() :
    visit = [False] * N
    DFS_permutation(0, [], 0, visit)

def DFS_permutation(num, sol, level, visit) :
    if level == M :
        if num != sol[0] :
            num = sol[0]

        for i in range(M) :
            print(sol[i], end= ' ')
        print()
        return

    for i in range(num, N) :
        if not visit[i] :
            sol.append(i+1)
            visit[i] = True
            DFS_permutation(num+1, sol, level+1, visit)
            visit[i] = False
            sol.pop()

all_permutations()
