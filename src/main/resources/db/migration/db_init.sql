
insert into plant_division(name_rus, name_lat)
values ('Голосеменные', 'Pinophyta'), ('Покрытосеменные', 'Magnliophyta');

insert into plant_class(name_rus, name_lat, division_id)
values ('Однодольные', 'Liliopsida', 2),
('Двудольные', 'Magnoliopsida', 2),
('Хвойные', 'Pinopsida', 1);

insert into plant_order(name_rus, name_lat, class_id)
values ('Астроцветные', 'Asterales', 2),
('Сосновые', 'Pinales', 3),
('Бромелиецветные', 'Bromeliales', 1),
('Гвоздикоцветные', 'Caryophyllales', 2);

insert into plant_family(name_rus, name_lat, order_id)
values ('Астровые', 'Asteraceae', 1),
('Сосновые', 'Pinaceae', 2),
('Бромелиевые', 'Bromeliaceae', 3),
('Кактусовые', 'Cactaceae', 4);

insert into garden_type(name)
values ('Оранжерея'),('Огород'),('Ботанический сад');

insert into garden(name, type_id)
values ('Ботанический сад Петра Великого', 3),
('Стрельна', 2),
('Летний сад', 2);

insert into plant(name_rus, name_lat, description, family_id, garden_id)
values ('Латук посевной', 'Latuca sativa',
'Салаты-латуки русскому человеку не нравились. Один из управляющих мызой писал: «Мы не козлы, дабы жрать эту траву». Салаты выращивали и продавали иностранцам – немцам, французам, итальянцам. Интересно, что тогда же на Руси весной ели лебеду, щавель, крапиву, листья маргаритки. Понадобилось около 100 лет, чтобы культура салатов вошла в рацион.',
1, 2),
('Ананас посевной', 'Ananassa sativa',
 '«Золотые хоромы» Екатерины I окружал Третий Летний сад, или, как его в народе чаще называли, «сад за речкой Мьей». По сравнению с петровским «парадизом» он больше всего напоминал боярскую усадьбу тех далеких времен, с огородом, фруктовыми деревьями и парниками, в коих царица даже пыталась выращивать заморские фрукты – ананасы и бананы. ',
 3, 3),
('Селеницереус крупноцветковый', 'Selenicereus grandiflorus',
'Этот колючий гость из Южной Америки прибыл в Санкт-Петербург почти два века назад — ещё в 1824 году. Полюбоваться чудом природы когда-то могли Пушкин и Гоголь, а теперь можете и вы: каждый год в конце мая — начале июня кактус причудливо расцветает, привлекая нескончаемый поток зрителей.',
4, 1)


