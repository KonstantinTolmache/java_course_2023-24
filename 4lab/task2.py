# a^n = (a^2)^n/2  при четном n,
# a^n = a × a^n−1 при нечетном n.
# На вход подается два числа через пробел: a, n. 
# Напишите функцию для реализации алгоритма быстрого возведения в степень с помощью рекурсивной функции.


def fast_power(a, n):
    if n == 0:
        return 1
    
    elif n % 2 == 0:
        half_power = fast_power(a, n // 2)
        return half_power * half_power
    
    else:
        return a * fast_power(a, n - 1)

input_data = input("Введите два числа a и n через пробел: ")
a, n = map(float, input_data.split())

result = fast_power(a, int(n))
print(f"{a} в степени {n} равно {result}")
