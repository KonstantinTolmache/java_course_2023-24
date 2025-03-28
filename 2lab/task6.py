# Строка состоит из 0 и 1. Выведите ‘yes’, если
# количество единиц совпадает с количеством нулей.
# И ‘no’ в противном случае.
# Ввод: 11100, вывод no
# Ввод 111000, вывод yes

numbers = input()

ones = 0
zeroes = 0

for i in numbers:
    if i == '1':
        ones += 1
    elif i == '0':
        zeroes += 1

if zeroes == ones:
    print("yes")
else:
    print("no")
