class Heap:
    def min_heap(self, nums):
        size = len(nums) - 1
        LENGTH = size

        while size >= 0:
            parent = (size - 1) / 2
            if nums[parent] > nums[size]:
                self.swap(nums, parent, size)
            size2 = size
            left_child = 2 * size2 + 1
            right_child = left_child + 1
            while left_child <= LENGTH:
                if left_child <= LENGTH and right_child <= LENGTH:
                    if nums[left_child] < nums[right_child] and nums[left_child] < nums[size2]:
                        self.swap(nums, left_child, size2)
                        size2 = left_child
                    elif nums[right_child] < nums[size2]:
                        self.swap(nums, right_child, size2)
                        size2 = right_child
                elif nums[left_child] < nums[size2]:
                    self.swap(nums, left_child, size2)
                    size2 = left_child
                left_child = 2 * size2 + 1
                right_child = left_child + 1
            size -= 1

    def swap(self, nums, index1, index2):
        temp = nums[index1]
        nums[index1] = nums[index2]
        nums[index2] = temp
