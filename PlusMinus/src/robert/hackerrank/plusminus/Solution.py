#!/bin/python3

import sys

n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]

pos = 0
neg = 0
zer = 0
for val in arr:
    if val > 0:
        pos = pos + 1
    elif val < 0:
        neg = neg + 1
    else:
        zer = zer + 1

#print('%(val)8.6f ' % {'val': (pos / n)})
print ('%8.6f' % (pos/n))
print ('%8.6f' % (neg/n))
print ('%8.6f' % (zer/n))

