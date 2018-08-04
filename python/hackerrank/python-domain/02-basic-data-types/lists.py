#!/usr/bin/env python3
# -*- coding: utf8 -*-


if __name__ == "__main__":
    list = []

    N = int(input())
    for i in range(N):
        cmd = input().split()

        for j in range(1, len(cmd)):
            cmd[j] = int(cmd[j])

        if cmd[0] == "insert":
            list.insert(cmd[1], cmd[2])

        elif cmd[0] == "print":
            print(list)

        elif cmd[0] == "remove":
            list.remove(cmd[1])

        elif cmd[0] == "append":
            list.append(cmd[1])

        elif cmd[0] == "sort":
            list.sort()

        elif cmd[0] == "pop":
            list.pop()

        elif cmd[0] == "reverse":
            list.reverse()
