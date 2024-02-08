CREATE TABLE public.users
(
    id bigint,
    name character varying(300) NOT NULL,
    surname character varying(300) NOT NULL,
    email character varying(320) NOT NULL,
    phone character varying(15) NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.users
    OWNER to pingwit;

CREATE TABLE public.products
(
    id bigint,
    name character varying(300) NOT NULL,
    description text,
    price numeric(10, 2) NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.products
    OWNER to pingwit;

CREATE TABLE public.order_statuses
(
    id bigint,
    name character varying(30) NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.order_statuses
    OWNER to pingwit;

CREATE TABLE public.orders
(
    id bigint,
    creation_date timestamp without time zone NOT NULL,
    users_id bigint NOT NULL,
    quantity integer NOT NULL,
    order_statuses_id bigint NOT NULL,
    comments text,
    PRIMARY KEY (id),
    CONSTRAINT fk_orders_users_id FOREIGN KEY (users_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT fk_orders_order_statuses_id FOREIGN KEY (order_statuses_id)
        REFERENCES public.order_statuses (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);

ALTER TABLE IF EXISTS public.orders
    OWNER to pingwit;