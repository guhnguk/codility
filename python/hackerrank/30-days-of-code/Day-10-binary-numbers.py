#!/bin/python3
# -*- coding: utf8 -*-

import math
import os
import random
import re
import sys


if __name__ == '__main__':
    n = int(input())

    # result = ""
    max_count = 0
    count = 0

    while n > 0:
        reminder = n % 2
        n = n // 2
        result = str(reminder) + result

        if reminder == 1:
            count += 1
            max_count = max(max_count, count)
        else:
            count = 0

    print(count)