#Рассмотрим три числа a, b и c. Упорядочим их по возрастанию.
#Какое число будет стоять между двумя другими?
#Ввод 1 2 3, вывод 2

s = input()

a = b = c = None  # Инициализируем переменные a, b, c значением None

current_variable = ''  # Инициализируем текущую переменную как пустую строку
variable_index = 1

for char in s:
    if char != ' ':
        current_variable += char  # Добавляем символ к текущей переменной
    else:
        if current_variable:
            if variable_index == 1:
                a = int(current_variable)
            elif variable_index == 2:
                b = int(current_variable)
            variable_index += 1
            current_variable = ''  # Сбрасываем текущую переменную

if current_variable:
    if variable_index == 3:
        c = int(current_variable)

# Теперь у нас есть переменные abc с соответствующими значениями

if a > c:
    a, c = c, a
if b > c:
    c, b = b, c
if a > b:
    b, a = a, b
print(b)
