#!/usr/bin/env python
# -*- coding: utf-8 -*-


def quick_sort(unsorted_data):
    pivot_index = 0
    pivot_value = unsorted_data[pivot_index]  # 3

    left = pivot_index + 1
    right = len(unsorted_data) - 1

    done = False
    while not done:
        if unsorted_data[left] <= pivot_value:
            left += 1
            print(left)

        if unsorted_data[right] >= pivot_value:
            right -= 1
            print(right)

        if left >= right:
            done = True


if __name__ == "__main__":
    # unsorted_data = [54, 26, 93, 17, 77, 31, 44, 55, 20]
    # unsorted_data = [9, 3, 7, 4, 1, 6, 6, 5, 2, 8, 0]
    # unsorted_data = [9, 3, 7, 4, 1]
    unsorted_data = [3, 1, 6, 5, 7]
    print(unsorted_data)
    quick_sort(unsorted_data)
    print(unsorted_data)