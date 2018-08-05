

# 정수(int)가 주어지면, 팰린드롬(palindrome)인지 알아내시오.
# 팰린드롬이란, 앞에서부터 읽으나 뒤에서부터 읽으나 같은 단어를 말합니다.
# 단, 정수를 문자열로 바꾸면 안됩니다.
#
# 예제)
# Input: 12345
# Output: False
#
# Input: -101
# Output: False
#
# Input: 11111
# Output: True
#
# Input: 12421
# ﻿Output: True


def is_palindrome(number):
    origin = number
    rev = 0

    while number > 0:
        reminder = number % 10
        rev = rev * 10 + reminder
        number = number // 10

    if origin == rev:
        return True
    else:
        return False

n = int(input("Input the number: ").strip())
print(is_palindrome(n))

print("{} is palindrome? {}".format(12345, True if is_palindrome(12345) else False))
print("{} is palindrome? {}".format(-101, True if is_palindrome(-101) else False))
print("{} is palindrome? {}".format(11111, True if is_palindrome(11111) else False))
print("{} is palindrome? {}".format(12421, True if is_palindrome(12421) else False))


