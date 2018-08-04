#!/usr/bin/env python3
# -*- coding: utf8 -*-


if __name__ == "__main__":
    n = int(input())

    phone_book = {}
    for i in range(n):
        new_inform = input().split()
        phone_book[new_inform[0]] = new_inform[1]

    # search = []
    # for i in range(n):
    #     name = input().strip()
    #     search.append(name)

    for i in range(n):

        name = input().strip()

        if name in phone_book:
            # print(search[i] + "=" + phone_book.get(search[i]))
            print("{}={}".format(name, phone_book[name]) )
        else:
            print("Not found")

