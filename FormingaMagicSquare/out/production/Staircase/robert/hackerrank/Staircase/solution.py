#!/bin/python3

import sys

n = int(input().strip())

stairs = 1
if (n > 0):
    if (n > 1):
        for j in range(0, n):
            output = ""
            for i in range(0, n):
                if i + stairs < n:
                    output += " "
                else:
                    output += "#"
            print(output)
            stairs += 1
    else:
        print("#")
