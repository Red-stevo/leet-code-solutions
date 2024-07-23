def main():
    coins = [1, 5, 10, 20, 40]
    amount = 11
    ans_arr = minimum_coins(coins, amount)
    print(ans_arr)


def minimum_coins(coins, amount):
    num_coins = len(coins)

    working_list = [[float('inf')] * (amount + 1) for _ in range(num_coins + 1)]

    for i in range(num_coins + 1):
        working_list[i][0] = 0

    for j in range(1, num_coins + 1):
        for k in range(1, amount + 1):
            if coins[j - 1] > k:
                working_list[j][k] = working_list[j - 1][k]
            else:
                working_list[j][k] = min(working_list[j][k - coins[j - 1]] + 1, working_list[j - 1][k])
    return working_list[len(coins)][amount]


if __name__ == "__main__":
    main()
