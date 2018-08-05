#!/usr/bin/env python
#-*- coding: utf-8 -*-


def get_prime(n):
    ret = [2, 3]

    if n <= 3:
        return ret

    for i in range(4, n+1):
        for k in range(2, i-1):
            a = i % k

            if a == 0:
                is_prime = False
                break
        else:
            ret.append(i)

    return ret