#!/usr/bin/env python3
# -*- coding: utf8 -*-


def is_leap(year):
    leap = False

    # Write your logic here
    if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        leap = True
    else:
        return leap

    return leap


if __name__ == "__main__":
    year = int(input())

    if year < 1900 or year > 10**5:
        exit(1)

    print(is_leap(year))