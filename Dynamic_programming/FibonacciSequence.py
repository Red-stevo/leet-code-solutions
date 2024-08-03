def main():
    n = 50
    memo = [None] * (n+1)
    print(f"fibonacci of {n} is {fibonacci_dynamically(n,memo)}")
    print(f"fibonacci of {n} is {fibonacci_sequence(n)}")


def fibonacci_sequence(n):
    if n == 0:
        return 0
    if n == 1 or n == 2:
        return 1
    return fibonacci_sequence(n - 1) + fibonacci_sequence(n - 2)


def fibonacci_dynamically(n, memoization):
    if memoization[n] is not None:
        return memoization[n]
    if n == 0:
        return 0
    if n == 1 or n == 2:
        return 1
    memoization.insert(n, fibonacci_dynamically(n-1, memoization) + fibonacci_dynamically(n-2, memoization))
    return memoization[n]


if __name__ == "__main__":
    main()
