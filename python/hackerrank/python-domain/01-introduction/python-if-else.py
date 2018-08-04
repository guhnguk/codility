#!/usr/bin/env python3
# -*- coding: utf8 -*-


if __name__ == '__main__':
    n = int(input())

    if n < 1 or 100 < n:
       exit(1)

    value = n % 2

    if value != 0:
        print("Weird")
    elif (value == 0) and (2 <= n and n <= 5):
        print("Not Weird")
    elif (value == 0) and (6 <= n and n <= 20):
        print("Weird")
    elif (value == 0) and (20 < n):
        print("Not Weird")