# На вход подается доменное имя сайта. Необходимо вывести все домены по порядку
# начиная с домена первого уровня.
# Ввод www.google.com
# Вывод
# com
# google
# www


domen = input()

a = domen[:"."]
b = domen[".":"."]
c = domen[-1:"."]

print(a)
print(b)
print(c)
