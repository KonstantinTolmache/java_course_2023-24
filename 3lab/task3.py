# На вход подается доменное имя сайта. Необходимо вывести все домены по порядку
# начиная с домена первого уровня.
# Ввод www.google.com
# Вывод
# com
# google
# www

domen = input()

a, b, c = domen.split(".")

print(c); print(b); print(a)
