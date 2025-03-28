# Дан список слов. Составить из последних букв каждого слова новое.
# Ввод:кот гири док, вывод: тик

stroka = input()

p_slovo = stroka[:stroka.index(' ')]
v_slovo = stroka[stroka.index(' '):stroka.index(' д')]
t_slovo = stroka[stroka.index(' '):]

slovo = p_slovo[-1] + v_slovo[-1] + t_slovo[-1]
print(slovo)
