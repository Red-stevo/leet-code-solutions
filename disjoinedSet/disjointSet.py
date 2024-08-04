def main():
    values = [0]*11
    #     initialized the list.
    for i in range(11):
        values[i] = i

    print(values)

    print("\nEnter the node to be connected.")
    firstNode = input("First Node : ")
    secondNode = input("Second Node : ")

    find(values, firstNode, secondNode)


if __name__ == "__main__":
    main()
