#!/usr/bin/env python3
# -*- coding: utf8 -*-


import sys


n = int(input().strip())

if (n >= 2) and (n <= 20):
    for i in range(1, 11):
        print("%d x %d = %d" %(n, i, (n*i)))
else:
    exit(1)
