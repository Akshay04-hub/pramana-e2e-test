def calculate_average(numbers):
    if not numbers:
        return 0

    return sum(numbers) / len(numbers)
num=[2,3,45,6,9]
calculate_average(num)