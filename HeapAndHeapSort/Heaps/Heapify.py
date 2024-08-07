def is_min_heap(arr):
    n = len(arr)
    for i in range(n):
        left = 2 * i + 1
        right = 2 * i + 2
        if left < n and arr[i] > arr[left]:
            return False
        if right < n and arr[i] > arr[right]:
            return False
    return True


def swap(nums, index1, index2):
    temp = nums[index1]
    nums[index1] = nums[index2]
    nums[index2] = temp


def min_heap(nums):
    size = len(nums) - 1
    LENGTH = size

    while size >= 0:
        parent = int((size - 1) / 2)
        if nums[parent] > nums[size]:
            swap(nums, parent, size)
            size2 = size
            left_child = 2 * size2 + 1
            right_child = left_child + 1
            while left_child <= LENGTH:
                if left_child <= LENGTH and right_child <= LENGTH:
                    if nums[left_child] < nums[right_child] and nums[left_child] < nums[size2]:
                        swap(nums, left_child, size2)
                        size2 = left_child
                    elif nums[right_child] < nums[size2]:
                        swap(nums, right_child, size2)
                        size2 = right_child
                    else:
                        break
                elif nums[left_child] < nums[size2]:
                    swap(nums, left_child, size2)
                    size2 = left_child
                else:
                    break

                left_child = 2 * size2 + 1
                right_child = left_child + 1

        size -= 1
    return nums


class Heap:
    pass
