

def is_palindrome(param):
    length = len(param)
    half = length // 2

    for i in range(0, length//2):
        # print("{} <=> {}".format(param[i], param[length-i-1]))
        if param[i] is not param[length-i-1]:
            return False
        else:
            continue
    return True

# n = input("Input the string: ").strip()
# print(is_palindrome(n))

print("{} is palindrome? {}".format(12345, True if is_palindrome(str(12345)) else False))
print("{} is palindrome? {}".format(-101, True if is_palindrome(str(-101)) else False))
print("{} is palindrome? {}".format(11111, True if is_palindrome(str(11111)) else False))
print("{} is palindrome? {}".format(12421, True if is_palindrome(str(12421)) else False))

