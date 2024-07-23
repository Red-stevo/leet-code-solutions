def main():
    print(f"fibonacci of 5 {fibonacci_sequence(5)}")


def fibonacci_sequence(n):
    if n == 0:
        return 0
    if n == 1 or n == 2:
        return 1
    return fibonacci_sequence(n - 1) + fibonacci_sequence(n - 2)


if __name__ == "__main__":
    main()
