#!/usr/bin/env python3
# -*- coding: utf8 -*-


# n = int(input())
# S1 = str(input())
# S2 = str(input())

# s1_even_part = S1[0:len(S1):2]
# s1_odd_part = S1[1:len(S1):2]
#
# print(s1_even_part + " " + s1_odd_part)
#
# s2_even_part = S2[0:len(S1):2]
# s2_odd_part = S2[1:len(S1):2]
#
# print(s2_even_part + " " + s2_odd_part)

t = int(input())

if (t < 1) or (t > 10):
    exit(1)

for i in range(0, t):
    S = str(input())
    S_len = len(S)

    even_temp = ""
    for i in range(0, S_len):
        if i % 2 == 0:
            even_temp += S[i]

    odd_temp = ""
    for j in range(0, S_len):
        if j % 2 == 1:
            odd_temp += S[j]

    print(even_temp + " " + odd_temp)
