# Дан список слов. Составить из последних букв каждого слова новое.
# Ввод кот гири док, вывод тик

stroka = input()
parts = stroka.split(); new = parts[0][-1] + parts[1][-1] + parts[2][-1]
print(new)
