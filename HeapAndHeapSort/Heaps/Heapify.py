class Heap:
    def min_heap(self, nums):
        size = len(nums) - 1

        while size >= 0:
            parent = (size - 1) / 2
            if nums[parent] > nums[size]:
                self.swap(nums, parent, size)
            else:
                size -= 1

    def swap(self, nums, index1, index2):
        temp = nums[index1]
        nums[index1] = nums[index2]
        nums[index2] = temp
