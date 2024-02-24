begin;
INSERT INTO public.orders(
	id, user_id, created_at, status_id, comment)
	VALUES (9,13, '2024-02-22', 12, 'to Minsk');

INSERT INTO public.order_items(
	id, order_id, product_id, quantity)
	VALUES (52, 8, 81, 10), (53, 6, 101, 11), (54, 8, 131, 31);
commit;