// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java.
//        Создать множество ноутбуков.
//        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
//        и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры
//        фильтрации можно также в Map.

Для реализации задачи создал 4 класса (помимо Main):

- Notebook - конструктор ноутбука; вывод записи ноутбука через override; Сохранение критериев поиска в список
- Options - набор enum и методов для генерации случайного ноутбука
- Search - набор методов для поиска ноутбуков по критериям
- Program - блок основной программы. Здесь создаю базу данных ноутбуков (конструктор Notebook собираю при помощи Options)
            количество записей базы данных ноутбуков задано переменной notebooksAmount.
            И в этом же классе реализовано меню выбора критерия поиска ноутбука с последующей обработкой поиска.
- В main только запуск метода run из класса Program.

 Примечания:
 - Поиск по объему ОЗУ, HDD, цене реализован при помощи регулярных выражений.
 - Цену, как правило, ставят с копейками, но не стал "заморачиваться", установил в рублях :)
 - Строка вывода базы данных в main, с одной стороны необязательна, но для проверки правильности выполнения заданий
   оказалась необходима :). Оставил в финальной версии.