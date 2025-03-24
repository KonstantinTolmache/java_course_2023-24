#На вход подается доменное имя сайта. Необходимо вывести все домены по порядку
#начиная с домена первого уровня.
#Ввод www.google.com
#Вывод
#com
#google
#www


domen = input()

firstdomen = domen[:3]
seconddomen = domen[4:10]
thirddomen = domen[11:]

print(thirddomen)
print(seconddomen)
print(firstdomen)
