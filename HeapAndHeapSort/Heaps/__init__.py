from Heaps.Heapify import Heap


def main():
    nums = [10, 14, 5, 23, 1, 6, 30, 11]
    heapify = Heap()
    nums = heapify.min_heap(nums)

    for i in nums:
        print(f"{nums},\t")


if __name__ == "__main__":
    main()
