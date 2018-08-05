#!/usr/bin/env python
# -*- coding: utf-8 -*-

# using bit operator
i = 5
j = 8

print('i=', end=''); print(i)
print('j=', end=''); print(j)

print('---------------------------')

i = i^j
j = i^j
i = i^j

print('i=', end=''); print(i)
print('j=', end=''); print(j)

print('---------------------------')

# using arithmetic operator
a = 5
b = 8

print('a=', end=''); print(a)
print('b=', end=''); print(b)

print('---------------------------')
a = a + b   # 5 + 8 = 13
b = a - b   # 13 - 8 = 5
a = a - b   # 13 - 5 = 8

print('a=', end=''); print(a)
print('b=', end=''); print(b)
