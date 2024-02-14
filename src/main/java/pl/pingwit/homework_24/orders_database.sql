CREATE TABLE IF NOT EXISTS public.order_rows
(
    id bigint NOT NULL,
    orders_id bigint NOT NULL,
    products_id bigint NOT NULL,
    quantity integer NOT NULL,
    CONSTRAINT order_rows_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.order_statuses
(
    id bigint NOT NULL,
    name character varying(30) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT order_statuses_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.orders
(
    id bigint NOT NULL,
    creation_date timestamp without time zone NOT NULL,
    users_id bigint NOT NULL,
    order_statuses_id bigint NOT NULL,
    comments text COLLATE pg_catalog."default",
    CONSTRAINT orders_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.products
(
    id bigint NOT NULL,
    name character varying(300) COLLATE pg_catalog."default" NOT NULL,
    description text COLLATE pg_catalog."default",
    price numeric(10, 2) NOT NULL,
    CONSTRAINT products_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.users
(
    id bigint NOT NULL,
    name character varying(300) COLLATE pg_catalog."default" NOT NULL,
    surname character varying(300) COLLATE pg_catalog."default" NOT NULL,
    email character varying(320) COLLATE pg_catalog."default" NOT NULL,
    phone character varying(15) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT users_pkey PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.order_rows
    ADD CONSTRAINT fk_order_rows_orders_id FOREIGN KEY (orders_id)
    REFERENCES public.orders (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID;


ALTER TABLE IF EXISTS public.order_rows
    ADD CONSTRAINT fk_order_rows_products_id FOREIGN KEY (products_id)
    REFERENCES public.products (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    NOT VALID;


ALTER TABLE IF EXISTS public.orders
    ADD CONSTRAINT fk_orders_order_statuses_id FOREIGN KEY (order_statuses_id)
    REFERENCES public.order_statuses (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;


ALTER TABLE IF EXISTS public.orders
    ADD CONSTRAINT fk_orders_users_id FOREIGN KEY (users_id)
    REFERENCES public.users (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;