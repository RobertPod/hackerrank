#!/bin/python3

import sys


n = int(input().strip())
scores = [int(scores_temp) for scores_temp in input().strip().split(' ')]
m = int(input().strip())
alice = [int(alice_temp) for alice_temp in input().strip().split(' ')]
# your code goes here

rank = 0
ranks = []
lastscore = -1
for score in scores:
    if (score != lastscore):
        rank += 1
    ranks.append(rank)
    lastscore = score

last = rank + 1  # last spot
lastscoreindex = len(scores) - 1
for score in alice:
    rank = last
    for i in range(lastscoreindex, -1, -1):
        if (score < scores[i]):
            break
        rank = ranks[i]
        lastscoreindex = i
        
    print(rank)
            