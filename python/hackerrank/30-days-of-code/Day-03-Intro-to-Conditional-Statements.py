#!/usr/bin/env python3
# -*- coding: utf8 -*-


import sys


N = int(input().strip())
if (N < 1) or (N > 100):
    print("Constraints: 1 <= N <= 100")
    exit(0)

value = N % 2

if value > 0:
    print("Weird")
elif (value is 0) and (2 <= N and N <=5):
    print("Not Weird")
elif (value is 0) and (6 <= N and N <=20):
    print("Weird")
elif (value is 0) and (20 < N):
    print("Not Weird")