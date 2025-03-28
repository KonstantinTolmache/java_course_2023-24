# На вход подается последовательность целых чисел.
# Требуется определить, присутствуют ли в этой последовательности одинаковые числа.
# Результат вернуть в формате Boolean.
# Ввод 0 0 1 2 3 4 5 6 7, вывод True/False

def has_duplicates(numbers):
    seen = set()
    for i in numbers:
        if i in seen:
            return True
        seen.add(i)
    return False

input_numbers = input()
numbers_list = list(map(int, input_numbers.split()))

result = has_duplicates(numbers_list)
print(result)
