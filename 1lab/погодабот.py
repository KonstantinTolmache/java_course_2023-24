import requests
# подключаем модуль для Телеграма
import telebot

# указываем город
city = 'Сочи'

# формируем запрос
url = 'https://api.openweathermap.org/data/2.5/weather'
params = {
    "q": city,
    "units": "metric",
    "lang": "ru",
    "appid": "79d1ca96933b0328e1c7e3e7a26cb347"
}

# отправляем запрос на сервер и сразу получаем результат
weather_data = requests.get(url, params=params).json()

# получаем данные о температуре и о том, как она ощущается
temperature = round(weather_data['main']['temp'])
temperature_feels = round(weather_data['main']['feels_like'])

# выводим значения на экран
print('Сейчас в городе', city, str(temperature), '°C')
print('Ощущается как', str(temperature_feels), '°C')


# указываем токен для доступа к боту
bot = telebot.TeleBot('8086819868:AAHHOBA0-JN__mPiIDXnWp4cdncXDVx1K38')

# приветственный текст
start_txt = 'Здравствуйте! \n\nНапишите город, я покажу погоду в нём'

# обрабатываем старт бота
@bot.message_handler(commands=['start'])
def start(message):
    # выводим приветственное сообщение
    bot.send_message(message.from_user.id, start_txt, parse_mode='Markdown')

# запускаем бота
if __name__ == '__main__':
    while True:
        # в бесконечном цикле постоянно опрашиваем бота — есть ли новые
        # сообщения
        try:
            bot.polling(none_stop=True, interval=0)
    # если возникла ошибка — сообщаем про исключение и продолжаем работу
        except Exception as e:
            print('❌❌❌❌❌Сработало исключение! ❌❌❌❌❌')


def get_weather(city):
    pass
    return weather_data

# обрабатываем полученное сообщение(город)
@bot.message_handler(content_types=['text'])
def weather(message):
    # получаем город из сообщения пользователя
    city = message.text
    # отправляем запрос на сервер
    weather_data = get_weather(city)

    # получаем данные о температуре и о том, как она ощущается
    temperature = round(weather_data['main']['temp'])
    temperature_feels = round(weather_data['main']['feels_like'])

    # формируем ответы
    w_now = 'Сейчас в городе ' + city + ' ' + str(temperature) + ' °C'
    w_feels = 'Ощущается как ' + str(temperature_feels) + ' °C'

    # отправляем значения пользователю
    bot.send_message(message.from_user.id, w_now)
    bot.send_message(message.from_user.id, w_feels)
