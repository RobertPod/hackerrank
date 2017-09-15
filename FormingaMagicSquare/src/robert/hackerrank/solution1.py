def rotatelist(mylist): # rotate once
    return [[mylist[j][2-i] for j in range(3)] for i in range(3)]

def changecost(square1, square2):
    return sum([abs(square1[r][c] - square2[r][c]) for r in range(3) for c in range(3)])

def lucassquare(a,b,c): # return a magic square using lucas's method
    x = [[], [], []]
    x[0] = [c-b, c+a+b, c-a]
    x[1] = [c-(a-b), c, c+(a-b)]
    x[2] = [c+a, c-(a+b), c+b]
    return x

square = [[], [], []]
for r in range(3):
    row = list(map(int, input().strip().split(' ')))
    square[r] = row
    
magicref = [[2, 9, 4], [7, 5, 3], [6, 1, 8]]
magicflip = magicref[:][::-1]
sq1 = magicref
sq2 = magicflip
for i in range(4):
    if i==0:        
        mincost = min(changecost(sq1, square), changecost(sq2, square))
    else:      
        mincost = min(changecost(sq1, square), changecost(sq2, square), mincost)
    sq1 = rotatelist(sq1)
    sq2 = rotatelist(sq2)
print(mincost)