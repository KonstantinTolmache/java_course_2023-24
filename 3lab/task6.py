# На вход подается последовательность целых чисел.
# Требуется определить, присутствуют ли в этой последовательности одинаковые числа.
# Результат вернуть в формате Boolean.
# Ввод 0 0 1 2 3 4 5 6 7, вывод True/False

numbers = input(); flag = False; clearnumbers = numbers.replace(" ", "")
for i in clearnumbers:
    if clearnumbers[0] == clearnumbers[1]:
        flag = True
print(flag)

# Работает только если повторяеся в первом, ещё и не в одну строку
