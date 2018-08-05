#!/usr/bin/env python
# -*- coding: utf-8 -*-

def quick_sort(alist):
    q_sort(alist, 0, len(alist) - 1)

def q_sort(alist, first, last):
    if first<last:

        splitpoint = partition(alist,first,last)

        q_sort(alist, first, splitpoint - 1)
        q_sort(alist, splitpoint + 1, last)


def partition(alist,first,last):
    pivotvalue = alist[first]

    leftmark = first+1
    rightmark = last

    done = False
    while not done:

        while leftmark <= rightmark and alist[leftmark] <= pivotvalue:
            leftmark = leftmark + 1

        while leftmark <= rightmark and alist[rightmark] >= pivotvalue:
            rightmark = rightmark - 1
        #while alist[rightmark] >= pivotvalue and rightmark >= leftmark:


        if rightmark < leftmark:
            done = True
        else:
            temp = alist[leftmark]
            alist[leftmark] = alist[rightmark]
            alist[rightmark] = temp

    temp = alist[first]
    alist[first] = alist[rightmark]
    alist[rightmark] = temp


    return rightmark


#unsorted_data = [54, 26, 93, 17, 77, 31, 44, 55, 20]
#unsorted_data = [9, 3, 7, 4, 1, 6, 6, 5, 2, 8, 0]
#unsorted_data = [9, 3, 7, 4, 1]
unsorted_data = [9, 3, 7, 4]
quick_sort(unsorted_data)
print(unsorted_data)




# if __name__ == "__main__":
#     # unsorted_data = [9, 3, 7, 4, 1, 6, 6, 5, 2, 8, 0]
#
#     unsorted_data = [9, 3, 7, 4]
#
#     print('array size:', end=''); print(len(unsorted_data)-1)
#
#     for x in range(0, len(unsorted_data)):
#         print('[' + str(x) + ']=>', end=''); print(unsorted_data[x])
#
#
#     pivot = unsorted_data[len(unsorted_data)-1]


