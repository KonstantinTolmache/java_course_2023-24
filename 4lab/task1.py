# На вход подается список чисел через пробел. Напишите функцию выводящую сообщение для списка чисел:
# 1) Все числа равны
# 2) Все числа разные
# 3) Есть равные и неравные числа

def analyze_numbers(numbers):
    set_numbers = set(numbers)

    if len(set_numbers) == 1:
        print("Все числа равны.")
    elif len(set_numbers) == len(numbers):
        print("Все числа разные.")
    else:
        print("Есть равные и неравные числа.")

input_numbers = input("Введите список чисел через пробел: ")
numbers_list = list(map(int, input_numbers.split()))

analyze_numbers(numbers_list)
