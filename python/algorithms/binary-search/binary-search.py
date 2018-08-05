#!/usr/bin/env python3
# -*- coding: utf8 -*-


def binary_search(list, item):
    first = 0
    last = len(list) - 1

    while first <= last:
        middle = (last - first) // 2
        guess = list[middle]

        if guess == item:
            return middle
        elif guess > item:
            last -= 1
        elif guess < item:
            last += 1

    return None


if __name__ == "__main__":
    list = [1, 2, 3, 4, 5]
    print(binary_search(list, 3))
    print(binary_search(list, 2))
