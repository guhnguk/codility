
# Given an array of integers, return indices of the two numbers such that they add up to a specific target.
# You may assume that each input would have exactly one solution, and you may not use the same element twice.
#
# Example:
# Given nums = [2, 7, 11, 15], target = 9,
# Because nums[0] + nums[1] = 2 + 7 = 9,
# return [0, 1].

def two_sum1(nums, target):
    for idx, num in enumerate(nums):
        guess = target - num
        if guess in nums:
            return idx, nums.index(guess)


def two_sum2(nums, target):
    dic = {}
    idx = 0

    for num in nums:
        guess = target - num
        if guess in dic:
            return dic[guess], idx
        dic[num] = idx
        idx += 1

nums = [2, 7, 11, 15]
target = 18

print(two_sum1(nums, target))
print(two_sum2(nums, target))