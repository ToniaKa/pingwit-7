
1. Отсортируйте таблицу users по полю email по убыванию и выведите 5 записей, начиная с 10
SELECT *
	FROM public.users
	ORDER BY email DESC
	OFFSET 9;

2. Выведите все столбцы из таблицы products, у которых цена ниже, чем цена продукта с id = 41
SELECT *
    FROM products
    WHERE price < (SELECT price FROM products WHERE id=41)

3. Из таблицы users выведите все уникальные имена пользователей
SELECT DISTINCT name
	FROM public.users;

4. Выведите имя, фамилию и имэйл пользователей, у которых имэйл находится в домене gmail.com
SELECT name, surname, email
	FROM public.users
	WHERE email LIKE '%gmail.com';

5. Выведите orders.id, users.email, orders.created_at, product.name и order_items.quantity для заказов, сделанных 2023-02-19 и позже
SELECT orders.id, users.email, orders.created_at, products.name, order_items.quantity
	FROM public.orders, order_items, users, products
	WHERE created_at > '2023-02-19';

6. Выведите все колонки таблицы users + заказы пользователя, если они у него есть
SELECT *
	FROM public.users u JOIN orders o ON u.id=o.user_id;

7. Выведите дату и количество заказов, сделанных в эту дату
SELECT created_at,sum(quantity)
    FROM orders o JOIN order_items oi ON o.id=oi.order_id
    GROUP BY created_at

8. Выведите products.name, и sum(quantity) проданных товаров для всех товаров, которых продали меньше 15 штук sum(quantity) < 15
SELECT p.name, sum(quantity)
	FROM public.products p JOIN order_items oi ON p.id=oi.product_id
	GROUP BY p.name
	HAVING sum(quantity)<15


