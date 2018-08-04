#!/usr/bin/env python3
# -*- coding: utf8 -*-

n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]


arr_reverse = arr[::-1]

for i in range(n):
    print(str(arr_reverse[i]), end=" ")
