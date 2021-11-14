n = int(input())

for i in reversed(range(1, n+1)) :
    for j in range(1, n+1) :
        if(i <= j) :
            print("*",end='')
        else :
            print(" ",end='')
    print()
